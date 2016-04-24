package kuch.inteavuth.com.a5healthtrick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_fifth_tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_tip);
    }

    //Run when button Previous Click
    public void backToFourthTip(View view) {
        super.onBackPressed();
    }

    //Run when button Next Click
    public void goRateActivity(View view) {
        Intent intent = new Intent(activity_fifth_tip.this, rate_us.class);
        startActivity(intent);
    }

    //Run when button Read is clicked
    public void readFifthTipDetail(View view) {
        Intent i = new Intent(this, activity_fifth_detail.class);
        startActivity(i);
    }
}
