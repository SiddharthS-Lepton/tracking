package com.lepton.tracking;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;



public class TrackService extends Service {


    public static void enableLog(boolean value) {
        TrackConfig.log_required=value;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        init();

    }

    public void  init(){

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

    }

}
