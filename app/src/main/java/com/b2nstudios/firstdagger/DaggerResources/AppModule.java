package com.b2nstudios.firstdagger.DaggerResources;


import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xavi on 23/12/2017.
 */

@Module
public class AppModule {
    Application mApp;

    public AppModule(Application app){ mApp = app; }

    @Provides
    Application provideApplication(){ return mApp; }

    @Provides
    Context provideContext(){ return mApp.getApplicationContext(); }

    @Provides
    String aNameString(){ return "AName"; }

    @Provides
    int return2(){return 2;}
}
