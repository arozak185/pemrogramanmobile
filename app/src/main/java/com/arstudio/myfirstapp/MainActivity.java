package com.arstudio.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtPass = findViewById(R.id.txtPass);
        Button login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUser.getText().toString();
                String password = txtPass.getText().toString();

                if (username.trim().equals("")){
                    txtUser.setError("Username Tidak Boleh Kosong");
                }
                else if (password.trim().equals("")){
                    txtPass.setError("Password Tidak Boleh Kosong");
                }
                else{
                    Intent kirim = new Intent(MainActivity.this, MyFirstApp2.class);
                   kirim.putExtra("amplopuser", username);
                    startActivity(kirim);
                }
        }
        });

    }
}