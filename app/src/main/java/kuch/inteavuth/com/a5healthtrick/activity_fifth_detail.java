package kuch.inteavuth.com.a5healthtrick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_fifth_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_detail);
    }

    //Click Button Back to return to fifth Activity
    public void returnFifthTip(View view) {
        super.onBackPressed();
    }
}
