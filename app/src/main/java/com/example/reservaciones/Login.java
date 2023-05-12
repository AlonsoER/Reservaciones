package com.example.reservaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText nombre, apellido1, apellido2, email, contraseña;
    private Button btnCrearUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();

        btnCrearUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Nombre " + nombre.getText() + " Apellidos " + apellido1.getText() + " " + apellido2.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void init (){
        nombre = findViewById(R.id.edtNombreLogin);
        apellido1 = findViewById(R.id.edt1erApellidoLogin);
        apellido2 = findViewById(R.id.edt2doApellidoLogin);
        email = findViewById(R.id.edtEmailLogin);
        contraseña = findViewById(R.id.edtContraseña);
        btnCrearUsuario = findViewById(R.id.btnCrearUsuario);
    }
}