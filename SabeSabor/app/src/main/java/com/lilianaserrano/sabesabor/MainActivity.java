package com.lilianaserrano.sabesabor;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private ListView lv;
    private EditText et;
    private List<Receta> valores = new ArrayList<Receta>();
    //private String listview_array[] = { "ONE", "TWO", "THREE", "FOUR", "FIVE","SIX", "SEVEN", "EIGHT", "NINE", "TEN" };
    private ArrayList<Receta> array_sort= new ArrayList<Receta>();
    int textlength=0;

    public void onCreate(Bundle savedInstanceState)
    {
        valores.add(new Receta("Spaguetti", "ingredientes", "moler"));
        valores.add(new Receta("Burritos", "una libra", "asar"));
        valores.add(new Receta("Arroz Especial", "una bolsa de leche", "batir"));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.ListView01);
        et = (EditText) findViewById(R.id.EditText01);

        CustomListAdapter newAdpt = new CustomListAdapter(this, R.layout.list_item, valores);




        lv.setAdapter(newAdpt);

        //lv.setAdapter(new ArrayAdapter<String>(this,
        //        android.R.layout.simple_list_item_1, listview_array));

        et.addTextChangedListener(new TextWatcher()
        {
            public void afterTextChanged(Editable s)
            {
                // Abstract Method of TextWatcher Interface.
            }
            public void beforeTextChanged(CharSequence s,
                                          int start, int count, int after)
            {
// Abstract Method of TextWatcher Interface.
            }
            public void onTextChanged(CharSequence s,
                                      int start, int before, int count)
            {
                textlength = et.getText().length();
                array_sort.clear();
                for (int i = 0; i < valores.size(); i++)
                {
                    if (textlength <= valores.get(i).getNombre().length())
                    {
                        if(et.getText().toString().equalsIgnoreCase(
                                (String)
                                        valores.get(i).getNombre().subSequence(0,
                                                textlength)))
                        {
                            array_sort.add(valores.get(i));
                        }
                    }
                }
                lv.setAdapter(new CustomListAdapter(MainActivity.this, R.layout.list_item, array_sort ));

            }
        });
    }
}
