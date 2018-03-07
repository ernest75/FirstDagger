package com.b2nstudios.firstdagger.DaggerResources;

import com.b2nstudios.firstdagger.MainActivity;
import com.b2nstudios.firstdagger.SecondActivity;

import dagger.Component;


@Component(modules ={AppModule.class,StupidModule.class})
public interface AppComponent {
    void inject(MainActivity ma);
    void injectSecondAct(SecondActivity sa);
}
