package com.b2nstudios.firstdagger;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//import com.b2nstudios.firstdagger.DaggerResources.DaggerAppComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Inject
    Context mContext;

    @Inject @Named("a_string")
    String mName;

    @Inject
    int mErase;

    @Inject @Named("stupid_string")
    String mTest;

    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.btnGoto2ndAct);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,SecondActivity.class));
            }
        });
        ((FirstDaggerApp) getApplication()).getAppComponent().inject(this);

        Log.e(LOG_TAG, mName);
        Log.e(LOG_TAG, mErase +"");
        Log.e(LOG_TAG, mTest );
        if(mContext != null){
            Log.e(LOG_TAG, "We have context!");
        }


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(LOG_TAG, "OnPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(LOG_TAG, "OnStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(LOG_TAG, "OnDestroy Called");
    }
}
