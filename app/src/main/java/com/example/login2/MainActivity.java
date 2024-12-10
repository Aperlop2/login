package com.example.login2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button buttonLogin, buttonRegister;
    EditText editTextEmail, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Asegúrate de que los IDs coinciden con los del XML
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();
                if (correo.equals("ana47926@gmail.com") && password.equals("123")) {
                    Intent intencion = new Intent(getApplicationContext(), Ventana2.class);
                    intencion.putExtra("email", correo);
                    startActivity(intencion);
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Usuario o contraseña incorrectos",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
