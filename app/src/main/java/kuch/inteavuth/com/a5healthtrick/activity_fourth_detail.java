package kuch.inteavuth.com.a5healthtrick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_fourth_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_detail);
    }

    //Click Button Back to goto Fourth Activity
    public void returnFourthTip(View view) {
        super.onBackPressed();
    }
}
