package com.marcellomessori.easyusbtethering;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class IntroductionActivity extends Activity {


    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intro);
        MobileAds.initialize(this,
                "ca-app-pub-2413724092372090~4639103575");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void closeActivity(View view) {
        finish();
    }
}
