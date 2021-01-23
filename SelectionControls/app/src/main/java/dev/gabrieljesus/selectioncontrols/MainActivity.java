package dev.gabrieljesus.selectioncontrols;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SwitchCompat switchButton;
    private AppCompatCheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchButton = findViewById(R.id.switchButton);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Ligado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Desligado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox = findViewById(R.id.cb_ice_cream);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Gosta de sorvete", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Não gosta de sorvete", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}