package com.vishvendupalawat.scooppost.root;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vishvendu on 21/12/17.
 */

@Module
@Singleton
public class AppModule {

    private Application application;


    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){

        return application;

    }
}
