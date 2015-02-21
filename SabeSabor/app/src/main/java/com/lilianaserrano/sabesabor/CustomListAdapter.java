package com.lilianaserrano.sabesabor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mp on 21/02/2015.
 */
public class CustomListAdapter extends ArrayAdapter<String> {
    private Context appContext = null;
    private  List<Receta> items = null;
    public CustomListAdapter(Context context, int textViewResourceId,  List items){
        super(context,textViewResourceId,items);
        this.appContext = context;
        this.items=items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) appContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.list_item, null);
        }
        Receta o = items.get(position);
        if (o != null) {
            TextView name = (TextView) v.findViewById(R.id.txt_nombre);
            TextView ingredientes = (TextView) v.findViewById(R.id.txt_ingredientes);
            TextView preparacion = (TextView) v.findViewById(R.id.txt_preparacion);
            Button btnVer = (Button)v.findViewById(R.id.btn_ver);

            btnVer.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Toast.makeText(appContext, "Hellow this is clicked", Toast.LENGTH_LONG).show();

                }
            });

            if (name != null) {
                name.setText(o.getNombre());
            }
            if (ingredientes != null) {
                ingredientes.setText(o.getIngrediente_cantidad());
            }
            if (preparacion != null) {
                preparacion.setText(o.getPreparacion());
            }

        }
        return v;
    }
}
