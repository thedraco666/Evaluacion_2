package com.example.eva2.modelo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eva2.R;

public class DetallesActivity extends AppCompatActivity {


    public Tarea tarea;
    public Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        intent=getIntent();
        int id=(Integer) intent.getExtras().get("idTarea");
        tarea=Tarea.tareas[id];

        TextView txtNombre=(TextView) findViewById(R.id.txtNombre);
        txtNombre.setText(tarea.getNombre());

        TextView txtHora=(TextView) findViewById(R.id.txtHora);
        txtHora.setText(tarea.getHora() +" "+ tarea.getHora());

        TextView txtEstado=(TextView) findViewById(R.id.txtEstado);
        Button cambiar=(Button) findViewById(R.id.estado);

        if(tarea.isEstado()==Tarea.PENDIENTE)
        {
            txtEstado.setText("Pendiente");
            cambiar.setText("Marcar como Comprado");
        }
        else
        {
            txtEstado.setText("Comprado");
            cambiar.setText("Marcar como Pendiente");
        }



    }
    public void cambiarEstado(View view)
    {
        tarea.setEstado(!tarea.isEstado());
        finish();
    }

}
