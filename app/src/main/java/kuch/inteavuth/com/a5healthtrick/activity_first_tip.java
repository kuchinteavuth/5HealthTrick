package kuch.inteavuth.com.a5healthtrick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_first_tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_tip);
    }

    //Run when button Next Click
    public void goSecondActivityTip(View view) {
        Intent intent = new Intent(activity_first_tip.this, activity_second_tip.class);
        startActivity(intent);
    }

    //Run when button Read is click
    public void readFirstTipDetail(View view) {
        Intent intent = new Intent(activity_first_tip.this, activity_first_detail.class);
        startActivity(intent);
    }

    //Run when button Home Click
    public void goBackHome(View view) {
        super.onBackPressed();
    }
}
