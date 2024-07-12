package com.example.myapplication.myapplication.myapplication.project_andi;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Data_mahasiswa> list;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tambah_data();
        listView=findViewById(R.id.listview);
        Adapter adapter =new Adapter(getApplicationContext(),list);
        listView.setAdapter(adapter);
    }

    void tambah_data()
    {
        list=new ArrayList<>();
        list.add(new Data_mahasiswa("DIAN NANDA ELISMA","STE202202880"));
        list.add(new Data_mahasiswa("DIMAS ALFIANTO","STE202202882"));
        list.add(new Data_mahasiswa("FAUZIA ANIS DEWANTI","STE202202883"));
        list.add(new Data_mahasiswa("FIDIA NURLIA","STE202202884"));
        list.add(new Data_mahasiswa("SATRIA PAMBUDI","STE202202924"));
        list.add(new Data_mahasiswa("*ANDI SULISTIONO*","*STE202202927*"));
        list.add(new Data_mahasiswa("RANDIANO ILHAM","STE202202936"));
        list.add(new Data_mahasiswa("TRI SAMPUTRI","STE202202937"));
        list.add(new Data_mahasiswa("ELI KHOTIMAHTUN AVIANINGTIYAS","STE202202964"));
        list.add(new Data_mahasiswa("PUPUT DIAN SUKMA WATI","STE202202967"));
        list.add(new Data_mahasiswa("VITA AGUSTIN HASANAH","STE202202972"));




    }
}