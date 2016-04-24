package kuch.inteavuth.com.a5healthtrick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_fourth_tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_tip);
    }

    //Run when button Previous Click
    public void backToThirdTip(View view) {
        super.onBackPressed();
    }

    //Run when button Next Click
    public void goFifthActivityTip(View view) {
        Intent intent = new Intent(activity_fourth_tip.this, activity_fifth_tip.class);
        startActivity(intent);
    }

    //Run when button Read is clicked
    public void readFourthTipDetail(View view) {
        Intent intent = new Intent(this, activity_fourth_detail.class);
        startActivity(intent);
    }
}
