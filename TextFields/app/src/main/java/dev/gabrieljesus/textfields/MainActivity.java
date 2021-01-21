package dev.gabrieljesus.textfields;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private AppCompatEditText editTextEmail;
    private AppCompatEditText editTextPassword;

    private TextInputLayout textLayoutEmail;
    private TextInputLayout textLayoutPassword;

    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.et_email);
        textLayoutEmail = findViewById(R.id.txtlayout_email);

        editTextPassword = findViewById(R.id.et_password);
        textLayoutPassword = findViewById(R.id.txtlayout_password);

        buttonLogin = findViewById(R.id.btn_login);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
              validateForm();
            }
        });

    }

    private void validateForm(){
        if(editTextEmail.getText().toString().isEmpty()){
            textLayoutEmail.setErrorEnabled(true);
            textLayoutEmail.setError("Preencha com seu e-mail");
        }else{
            textLayoutEmail.setErrorEnabled(false);
        }

        if(editTextPassword.getText().toString().isEmpty()){
            textLayoutPassword.setErrorEnabled(true);
            textLayoutPassword.setError("Preencha com sua senha");
        }else{
            textLayoutPassword.setErrorEnabled(false);
        }
    }
}