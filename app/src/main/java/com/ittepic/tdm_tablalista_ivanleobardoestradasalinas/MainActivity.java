package com.ittepic.tdm_tablalista_ivanleobardoestradasalinas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edt;
    ListView lv;
    int n,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        edt=findViewById(R.id.editText);
        lv=findViewById(R.id.listView);

        final String[] lista = new String[]{"Tabla:"};
        final List<String> list = new ArrayList<String>(Arrays.asList(lista));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        lv.setAdapter(arrayAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=Integer.parseInt(edt.getText().toString());
                String r;
                for (int i=1;i<=10;i++){
                    n2=n*i;
                    r=n+" X "+i+" = "+n2+"\n";
                    list.add(r);
                    arrayAdapter.notifyDataSetChanged();
            }
        }

    });
    }
}
