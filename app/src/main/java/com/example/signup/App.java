package com.example.signup;

import android.app.Application;
import com.parse.Parse;
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate ( );
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Vx61hTylwcDD7N2Chhdp1CMo4AvJ4HGGIqdVnqV2")
                // if defined
                .clientKey("KY5lzRSNUercAGfdhYGjFIAHJykC8Ep5yNfTlwnK")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
