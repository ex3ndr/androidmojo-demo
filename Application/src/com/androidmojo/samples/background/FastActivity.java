package com.androidmojo.samples.background;

import android.app.Activity;
import android.os.Bundle;
import com.androidmojo.samples.R;

/**
 * Author: Korshakov Stepan
 * Created: 08.05.13 19:28
 */
public class FastActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawableResource(R.drawable.transparent);
        setContentView(R.layout.activity_background);
    }
}