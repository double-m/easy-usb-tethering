package com.marcellomessori.easyusbtethering;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class IntroductionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intro);
    }

    public void closeActivity(View view) {
        finish();
    }
}
