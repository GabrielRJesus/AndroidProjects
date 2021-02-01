package dev.gabrieljesus.rogressbars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar circularBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularBar = findViewById(R.id.circularBar);
        circularBar.setVisibility(View.GONE);
        new AsyncCircular().execute();
    }

    public class AsyncCircular extends AsyncTask<Void, Integer, Void>{

        @Override
        protected void onPreExecute() {
            circularBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            for(int i=0; i<100; i++){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            circularBar.setVisibility(View.GONE);
        }
    }
}