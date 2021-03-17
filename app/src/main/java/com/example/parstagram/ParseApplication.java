package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("qQkr4RPh6aF3KPKTTvJRXt7Bmloqt3fWDUJLHLOq")
                .clientKey("RqQODTmCmDIXZ65v9rcpzNDgq5M8ZJj9dnoDkzVb")
                .server("https://parseapi.back4app.com").build());
    }
}
