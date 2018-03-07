package com.b2nstudios.firstdagger.DaggerResources;

import android.app.Application;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class StupidModule {


    @Provides @Named ("stupid_string")
    String stupidString(){return  "stupid";}
}
