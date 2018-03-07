package com.b2nstudios.firstdagger.DaggerResources;

import com.b2nstudios.firstdagger.MainActivity;
import com.b2nstudios.firstdagger.SecondActivity;

import dagger.Component;

/**
 * Created by xavi on 23/12/2017.
 */

@Component(modules ={AppModule.class})
public interface AppComponent {
    void inject(MainActivity ma);
    void injectSecondAct(SecondActivity sa);
}
