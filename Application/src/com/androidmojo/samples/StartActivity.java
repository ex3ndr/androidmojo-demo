package com.androidmojo.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.androidmojo.samples.background.FastActivity;
import com.androidmojo.samples.background.NormalActivity;

public class StartActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void doOpenNormalBackground(View view) {
        startActivity(new Intent().setClass(this, NormalActivity.class));
    }

    public void doOpenFastBackground(View view) {
        startActivity(new Intent().setClass(this, FastActivity.class));
    }
}
