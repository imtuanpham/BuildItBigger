package net.tuanpham.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    private final String LOG_TAG = JokeDisplayActivity.class.getSimpleName();

    public static final String JOKE_DISPLAY = "JOKE_DISPLAY";

    TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        mJokeTextView = findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if (intent == null) {
            showError();
        }

        String joke = intent.getStringExtra(JOKE_DISPLAY);
        Log.d(LOG_TAG, joke);
        if (joke != null) {
            mJokeTextView.setText(joke);
        }

    }

    private void showError() {
        mJokeTextView.setText(R.string.error);
    }

}
