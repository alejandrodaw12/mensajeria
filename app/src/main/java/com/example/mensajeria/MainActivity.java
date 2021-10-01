package com.example.mensajeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXTO1 = "caulquiera1";
    private EditText edt_enviado1 = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_enviado1 = (EditText) findViewById(R.id.txt_enviado1);
    }

    public void enviar(View view) {
        String texto = String.valueOf(edt_enviado1.getText());
        Intent intent = new Intent(this, pantalla2Activity.class);
        intent.putExtra(EXTRA_TEXTO1, texto);
        startActivity(intent);

    }
}