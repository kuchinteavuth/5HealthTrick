package kuch.inteavuth.com.a5healthtrick;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class rate_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);
    }
    //When user click on Submit, this app will request to sent email to author
    public void suggestionSubmit(View view){
        String suggestMessage = getSuggest();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:kuchteavuth@gmail.com")); // only email apps should handle this
        //intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"kuchteavuth@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Application Advice and Suggestion");
        intent.putExtra(Intent.EXTRA_TEXT,suggestMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    //getSuggest From User
    private String getSuggest(){
        EditText suggest = (EditText)findViewById(R.id.suggestion_text);
        return suggest.getText().toString();
    }
}
