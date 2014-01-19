
package com.example.androidannotationexample;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsMenu;

import android.support.v4.app.FragmentActivity;

@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.main)
public class MainActivity extends FragmentActivity {

}
