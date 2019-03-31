package com.example.xyzreader.remote;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    private static String TAG = Config.class.toString();

    public static URL baseUrl(Context context) {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json" );
        } catch (MalformedURLException ignored) {
            Toast.makeText(context, "Please check your internet connection", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "Please check your internet connection.");
        }

        return url;
    }
}
