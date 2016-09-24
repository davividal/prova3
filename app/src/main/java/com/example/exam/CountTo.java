package com.example.exam;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Locale;

public class CountTo extends AsyncTask<Integer, Integer, Integer> {
    private TextView status;

    public CountTo(TextView status) {
        this.status = status;
    }

    @Override
    protected Integer doInBackground(Integer... params) {
        Integer countTo = params[0];

        for (Integer i = 1; i <= countTo; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publishProgress(i);
        }

        return 0;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        status.setText(String.format(Locale.getDefault(), " %d", values[0]));
    }
}
