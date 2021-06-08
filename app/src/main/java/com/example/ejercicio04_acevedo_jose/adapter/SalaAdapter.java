package com.example.ejercicio04_acevedo_jose.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ejercicio04_acevedo_jose.R;
import com.example.ejercicio04_acevedo_jose.entity.Sala;

import java.util.List;

public class SalaAdapter extends ArrayAdapter<Sala> {
    private Context context;
    private List<Sala> lista;

    public SalaAdapter(@NonNull Context context, int resource,  @NonNull List<Sala> lista) {
        super(context, resource, lista);
        this.context =context;
        this.lista=lista;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                View row= inflater.inflate(R.layout.activity_sala_item, parent, false);
        Sala obj = lista.get(position);

        TextView txtNombre = row.findViewById(R.id.idItemNumeroSala);
        txtNombre.setText(obj.getNumero());
                return row;
    }
}
