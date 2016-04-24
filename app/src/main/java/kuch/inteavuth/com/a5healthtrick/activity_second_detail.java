package kuch.inteavuth.com.a5healthtrick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_second_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_detail);
    }

    //Click to go back to Second Activity
    public void returnSecondTip(View view) {
        super.onBackPressed();
    }
}
