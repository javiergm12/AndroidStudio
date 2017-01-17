package com.example.alumno.prjlogin2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etUsuario;
    private EditText etPassword;
    private Button btnAceptar;
    private Button btnCancelar;
    private TextView lblAcceso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etPassword = (EditText) findViewById(R.id.etPassword);
        lblAcceso = (TextView) findViewById(R.id.lblAcceso);
        btnAceptar = (Button) findViewById(R.id.btnAceptar);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);

        // limpiar los campos

        //login de acceso, cuando ponga ROOT/TOOR bienvenido acceso

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etUsuario.setText("");
                etPassword.setText("");
            }
        });

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsuario.getText().toString().equals("Root") && etPassword.getText().toString().equals("toor")) {
                    lblAcceso.setText("Bienvenido Root");
                }else{
                    lblAcceso.setText("No eres Root, saliendo");
                }
            }
        });

    }

}
