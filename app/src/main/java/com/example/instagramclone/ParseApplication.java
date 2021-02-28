package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application
{
    // Initializer Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server server based on the values in the Heroku setting.
        // clickKey is not needed unless explicitly configured
        // any network interceptors must be added with the configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3ARLLqG0NHkUqyCbrgqqrpPv3glgHDsnLlnD57ej")
                .clientKey("Da2WMMou68w9DqdRckp2002wPshuOrgSgLGSw27m")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
