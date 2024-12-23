package com.example.dam_examen_sustitutorio_mancilla;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class NotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        List<Nota> notaList = new ArrayList<>();
        notaList.add(new Nota("Mundo 1", "Noticia de la sección Mundo", false, android.R.color.holo_blue_light));
        notaList.add(new Nota("Deportes 1", "Noticia de la sección Deportes", false, android.R.color.holo_green_light));
        notaList.add(new Nota("Vital 1", "Noticia de la sección Vital", false, android.R.color.holo_orange_light));

        NotaAdapter adapter = new NotaAdapter(notaList);
        recyclerView.setAdapter(adapter);
    }
}
