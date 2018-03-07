package com.b2nstudios.firstdagger.DaggerResources;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ernest on 12/02/2018.
 */
@Module
public class StupidModule {



    @Provides
    String stupidString(){return "stupid";}
}
