package dev.gabrieljesus.dialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton btnAlert;
    private AppCompatButton btnDialogItens;
    private AlertDialog alertDialog;
    private AlertDialog dialogItens;

    private String[] items = {"Item1","Item2","Item3","Item4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Dialog Alert
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialog);
        builder.setMessage("Deseja excluir?");
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Sim", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Não", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog = builder.create();

        btnAlert = findViewById(R.id.btn_alert);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.show();
            }
        });

        //Dialog Items
        AlertDialog.Builder builderDialogItens = new AlertDialog.Builder(this);
        builderDialogItens.setTitle("Selecione a opção desejada:");
//        builderDialogItens.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, items[i], Toast.LENGTH_SHORT).show();
//            }
//        });
        builderDialogItens.setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                Toast.makeText(MainActivity.this, items[i] + " : " + b, Toast.LENGTH_SHORT).show();
            }
        });
        builderDialogItens.setPositiveButton("Ok", null);
        builderDialogItens.setNegativeButton("Cancelar", null);

        dialogItens = builderDialogItens.create();

        btnDialogItens = findViewById(R.id.btnDialogItens);
        btnDialogItens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogItens.show();
            }
        });
    }
}