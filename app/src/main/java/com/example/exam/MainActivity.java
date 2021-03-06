package com.example.exam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private static Integer normalCalls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        normalCalls = 0;
    }

    public void sleep5(View view) {
        (new SleepFor((TextView)findViewById(R.id.sleep5))).execute(5);
    }

    public void count5(View view) {
        (new CountTo((TextView)findViewById(R.id.count5))).execute(5);
    }

    public void normal(View view) {
        String calls = String.format(Locale.getDefault(), " %d chamadas", ++normalCalls);
        ((TextView)findViewById(R.id.normal)).setText(calls);
    }
}
