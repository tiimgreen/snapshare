package com.tiimgreen.snapshare;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;

/**
 * Created by tim on 28/12/14.
 */
public class SnapshareApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("SnapshareApplication", "logged 123456789");

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "4YC4Wkfbkl07tNDAZAOVzQjsFBe0OKfyAlRPxelm", "jAAOOfDfCUx9DUqQZr2DDKCei26WNFVOHBvesLAr");
    }
}
