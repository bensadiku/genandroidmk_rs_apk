package com.bensadiku.testapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set a key to a string.
        FirebaseCrashlytics.getInstance().setCustomKey("str_key", "hello");

// Set a key to a boolean.
        FirebaseCrashlytics.getInstance().setCustomKey("bool_key", true);

    }
}