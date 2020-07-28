package com.example.respostas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  TextView mTextView1;
    private  TextView mTextView2;
    private  EditText mEditTextMensagem;
    private Button mButtonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = findViewById(R.id.textView);
        mTextView2 = findViewById(R.id.textView2);
        mEditTextMensagem = findViewById(R.id.editTextMensagem);
        mButtonEnviar = findViewById(R.id.button);


        mButtonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSegundaTela = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intentSegundaTela);
            }
        });



    }
}