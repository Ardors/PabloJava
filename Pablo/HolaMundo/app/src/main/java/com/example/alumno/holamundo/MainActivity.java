package com.example.alumno.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t = (TextView) findViewById(R.id.textView);
        final EditText usuario = (EditText) findViewById(R.id.usuario);
        final EditText pass = (EditText) findViewById(R.id.pass);
        Button b = (Button) findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(usuario.getText().toString().equals("pablo")&&pass.getText().toString().equals("123")){
                    t.setText("Acceso permitido");
                }else{
                    t.setText("Acceso denegado");
                    usuario.setText("");
                    pass.setText("");
                }

            }
        });

    }
}
