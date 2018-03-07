package com.b2nstudios.firstdagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG ="SecondActivity" ;

    @Inject
    String mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ((FirstDaggerApp)getApplication()).getAppComponent().injectSecondAct(this);

        Log.e(LOG_TAG,mName);
    }
}
