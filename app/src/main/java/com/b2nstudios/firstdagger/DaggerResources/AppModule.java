package com.b2nstudios.firstdagger.DaggerResources;


import android.app.Application;
import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {
    Application mApp;

    public AppModule(Application app){ mApp = app; }

    @Provides
    Application provideApplication(){ return mApp; }

    @Provides
    Context provideContext(){ return mApp.getApplicationContext(); }

    @Provides @Named("a_string")
    String aNameString(){ return "AName"; }

    @Provides
    int return2(){return 2;}
}
