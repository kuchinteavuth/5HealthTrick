package kuch.inteavuth.com.a5healthtrick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_second_tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_tip);
    }

    //Run when button Previous Click, to go back to first tip
    public void backToFirstTip(View view) {
        super.onBackPressed();
    }

    //Run when button Next Click, to go to Third Activity
    public void goThirdActivityTip(View view) {
        Intent intent = new Intent(activity_second_tip.this, activity_third_tip.class);
        startActivity(intent);
    }

    //Run when button Read Click
    public void readSecondTipDetail(View view) {
        Intent intent = new Intent(this, activity_second_detail.class);
        startActivity(intent);
    }
}
