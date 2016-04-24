package kuch.inteavuth.com.a5healthtrick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_third_tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_tip);
    }

    //Run when button Previous Click
    public void backToSecondTip(View view) {
        super.onBackPressed();
    }

    //Run when button Next Click
    public void goFourthActivityTip(View view) {
        Intent intent = new Intent(activity_third_tip.this, activity_fourth_tip.class);
        startActivity(intent);
    }

    //Run when button Read is Clicked
    public void readThirdTipDetail(View view) {
        Intent intent = new Intent(this, activity_third_detail.class);
        startActivity(intent);
    }
}
