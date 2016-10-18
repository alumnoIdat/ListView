package com.example.chango.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    public static final String [] COMIDAS={
            "arroz con pollo","ají de gallina","lomo saltado",
            "tacu tacu", "ceviche", "hostia que hambre me ha dado"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.LstOpciones);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.activity_listview, COMIDAS);
        lv.setAdapter(adapter);
    }
}
