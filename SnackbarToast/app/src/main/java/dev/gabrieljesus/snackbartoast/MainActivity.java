package dev.gabrieljesus.snackbartoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View relativeLayout = findViewById(R.id.activityMain);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Snackbar snackbar = Snackbar.make(view, "ITEM EXCLUIDO",Snackbar.LENGTH_LONG);
                snackbar.setAction("FECHAR", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackbar.dismiss();
                    }
                });

                View snackView = snackbar.getView();
                snackView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark, null));

                TextView snackActionView = snackView.findViewById(com.google.android.material.R.id.snackbar_action);
                snackActionView.setTextColor(getResources().getColor(android.R.color.white, null));

                snackbar.show();
            }
        });
    }
}