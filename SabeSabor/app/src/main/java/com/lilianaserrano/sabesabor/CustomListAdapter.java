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

/**
 * Created by mp on 21/02/2015.
 */
public class CustomListAdapter extends ArrayAdapter<String> {
    private Context appContext = null;
    private  ArrayList<String> items = null;
    public CustomListAdapter(Context context, int textViewResourceId,  ArrayList<String> items){
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
        String o = items.get(position);
        if (o != null) {
            TextView name = (TextView) v.findViewById(R.id.lst_item_Name);
            TextView mobile = (TextView) v.findViewById(R.id.lst_item_Mobile);
            Button btnDelete = (Button)v.findViewById(R.id.lst_item_Delete);

            btnDelete.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Toast.makeText(appContext,"Hellow this is clicked", Toast.LENGTH_LONG).show();

                }
            });

            if (name != null) {
                name.setText(o);                            }
            if(mobile != null){
                mobile.setText(o);
            }
        }
        return v;
    }
}
