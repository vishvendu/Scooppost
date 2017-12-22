package com.vishvendupalawat.scooppost.root;

import com.vishvendupalawat.scooppost.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by vishvendu on 21/12/17.
 */
@Singleton
@Component(modules = AppModule.class)
public interface ApplicationComponent {

    void inject(MainActivity target);
}
