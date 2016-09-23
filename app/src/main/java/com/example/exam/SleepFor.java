package com.example.exam;

import android.os.AsyncTask;
import android.widget.TextView;

public class SleepFor extends AsyncTask<Integer, Integer, Integer> {
    private TextView status;

    public SleepFor(TextView status) {
        this.status = status;
    }

    @Override
    protected void onPostExecute(Integer slept) {
        super.onPostExecute(slept);
        status.setText(" ASYNCTASK");
    }

    @Override
    protected Integer doInBackground(Integer... params) {
        Integer sleepFor = params[0] * 1000;

        try {
            Thread.sleep(sleepFor);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return 0;
        }

        return sleepFor/1000;
    }
}
