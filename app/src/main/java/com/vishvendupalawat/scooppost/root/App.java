package com.vishvendupalawat.scooppost.root;

import android.app.Application;

/**
 * Created by vishvendu on 21/12/17.
 */

public class App extends Application{

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public ApplicationComponent getComponent(){

        return applicationComponent;
    }
}
