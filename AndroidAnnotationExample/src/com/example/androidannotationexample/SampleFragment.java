package com.example.androidannotationexample;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.TextChange;
import org.androidannotations.annotations.ViewById;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@EFragment(R.layout.fragment_sample)
public class SampleFragment extends Fragment {
    private static final String TAG = "SampleFragment";

    @ViewById(R.id.editText1)
    protected EditText editText1;

    @ViewById(R.id.button1)
    protected Button button1;

    @AfterViews // Viewの初期化後の処理
    protected void initViwes() {
        Log.d(TAG, "initViwes");

        editText1.setText("初期化したよ");
    }

    @Click(R.id.button1)
    protected void button1Click() {
        Toast.makeText(getActivity(), "Click!", Toast.LENGTH_SHORT).show();
    }

    @TextChange(R.id.editText1)
    protected void editText1Changed(CharSequence s, int start, int before, int count) {
        Log.d(TAG, "editText1Changed count=" + count);
        if (editText1.getText().length() == 0) {
            button1.setEnabled(false);
        } else {
            button1.setEnabled(true);
        }
    }
    
    @Background
    protected void loadJson() {
        
    }
}
