package kuch.inteavuth.com.a5healthtrick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_first_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_detail);
    }

    //When Button Back is click and this code is run
    public void returnFirstTip(View view) {
        super.onBackPressed();
    }

}
