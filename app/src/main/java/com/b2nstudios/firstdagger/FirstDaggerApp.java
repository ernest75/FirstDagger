package com.b2nstudios.firstdagger;

import android.app.Application;
import android.util.Log;

import com.b2nstudios.firstdagger.DaggerResources.AppComponent;
import com.b2nstudios.firstdagger.DaggerResources.AppModule;
import com.b2nstudios.firstdagger.DaggerResources.DaggerAppComponent;


public class FirstDaggerApp extends Application {
    private static final String LOG_TAG = FirstDaggerApp.class.getSimpleName();

    private static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(LOG_TAG, "Application On Create");
        mAppComponent =  buildComponent();
    }

    private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @Override
    public void onTerminate() {
        Log.e(LOG_TAG, "Application On Terminate");
        super.onTerminate();
    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
