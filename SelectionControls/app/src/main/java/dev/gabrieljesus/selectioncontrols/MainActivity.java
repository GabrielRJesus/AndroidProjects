package dev.gabrieljesus.selectioncontrols;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SwitchCompat switchButton;
    private AppCompatCheckBox checkBox;
    private RadioGroup radioGroup;

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

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.option1 : {
                        Toast.makeText(MainActivity.this, "Opção 1", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.option2 : {
                        Toast.makeText(MainActivity.this, "Opção 2", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.option3 : {
                        Toast.makeText(MainActivity.this, "Opção 3", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
    }
}