package kuch.inteavuth.com.a5healthtrick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Run when button getStart Click
    public void goFirstActivityTip(View view) {
        Intent intent1 = new Intent(MainActivity.this, activity_first_tip.class);
        startActivity(intent1);
    }


}
