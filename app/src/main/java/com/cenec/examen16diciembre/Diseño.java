package com.cenec.examen16diciembre;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Diseño extends AppCompatActivity {
    TextView text1;
    EditText textUsuario;
    EditText textContraseña;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseno);

    }

    @SuppressLint("WrongViewCast")
    public void propagar(View view) {
    text1=this.findViewById(R.id.textViewAquivaEltexto);
    textUsuario=this.findViewById(R.id.editText);
    textContraseña=this.findViewById(R.id.editText2);
    String a=textContraseña.getText().toString();
    String b=textUsuario.getText().toString();
    String c=text1.getText().toString();
    if(a.isEmpty()&&b.isEmpty()){
        text1.setText("Error, Faltan nombre o contraseña");

    }else{
       text1.setText(b+"\r\n"+a);

    }


    }
}
