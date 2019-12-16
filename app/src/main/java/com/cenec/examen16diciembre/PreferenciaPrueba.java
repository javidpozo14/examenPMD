package com.cenec.examen16diciembre;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.SwitchPreference;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cenec.examen16diciembre.constantes.ValoresPreferencias;

public class PreferenciaPrueba extends AppCompatActivity {

    @Override
    Context context;
    Switch cambiar;
    TextView text11=this.findViewById(R.id.valorTipoLista);
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences preferencia= context.getSharedPreferences("preferencia", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = preferencia.edit();
        edit.putString("MiAdapter", text11.getText().toString().trim());
        edit.apply();
        Boolean valorActivado=preferencia.getBoolean(ValoresPreferencias.textoCambiado,true);
        cambiartTexto(valorActivado);
                if(valorActivado){
                    cambiar.isChecked();
                }

    }
    public void cambiartTexto(Boolean valor){
        if(valor){
            text11.setText("MiAdapter");
        }else {
            text11.setText("ArrayAdapter");
        }
    }
}
