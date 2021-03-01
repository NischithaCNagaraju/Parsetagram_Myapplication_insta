package com.example.myapplication_insta;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VmLZJ15TzOitBycHhn3gsXyCZMsBstTuk1MrtpS8")
                .clientKey("kgnjHwtDPW00Znmx4BVojmUkcp7SQEVcB1PesKhM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
