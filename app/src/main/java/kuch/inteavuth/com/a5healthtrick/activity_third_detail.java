package kuch.inteavuth.com.a5healthtrick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_third_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_detail);
    }

    //Click on button Back to back to ThirdTip
    public void returnThirdTip(View view) {
        super.onBackPressed();
    }
}
