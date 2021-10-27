package com.example.eva2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.eva2.modelo.DetallesActivity;
import com.example.eva2.modelo.Tarea;

public class ListaTareasActivity extends ListActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cargarLista();
    }

    public void cargarLista()
    {
          lista=getListView();
        ArrayAdapter<Tarea> listaAdapter = new ArrayAdapter<Tarea>(this, android.R.layout.simple_expandable_list_item_1, Tarea.tareas);
        lista.setAdapter(listaAdapter);

    }

    @Override
    public void onListItemClick(ListView listView, View view, int posicion, long id)
    {
        Intent intent=new Intent(ListaTareasActivity.this, DetallesActivity.class);
        intent.putExtra("idTarea", (int)id);
        startActivity(intent);

    }
}