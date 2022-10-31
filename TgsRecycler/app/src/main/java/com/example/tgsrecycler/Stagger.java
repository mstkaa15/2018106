package com.example.tgsrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class Stagger extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SayuranAdapter adapter;
    private ArrayList<Sayuran> sayuranArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stagger);
        addData();
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new SayuranAdapter(sayuranArrayList, this, 3);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        sayuranArrayList = new ArrayList<>();
        sayuranArrayList.add(new Sayuran("Pakcoy", "Pakcoy atau bok choy merupakan jenis sayuran yang populer. Sayuran yang dikenal pula sebagai sawi sendok ini mudah dibudidayakan dan dapat dimakan segar atau diolah menjadi asinan",R.drawable.pakcoy));
        sayuranArrayList.add(new Sayuran("Kangkung", "Kangkung adalah tumbuhan yang termasuk jenis sayur-sayuran dan ditanam sebagai makanan. Tumbuhan ini banyak dijual di pasar-pasar.",R.drawable.kangkung));
        sayuranArrayList.add(new Sayuran("Kol", "Kol adalah tanaman dua tahunan hijau , ditanam sebagai tanaman tahunan sayuran untuk kepala padat berdaunnya.",R.drawable.kol));
        sayuranArrayList.add(new Sayuran("Sawi", "Sawi adalah sekelompok tumbuhan dari genus Brassica yang dimanfaatkan daun atau bunganya sebagai bahan pangan (sayuran), baik segar maupun diolah.",R.drawable.sawi));
        sayuranArrayList.add(new Sayuran("Wortel", "Wortel (serapan dari bahasa Belanda: wortel) adalah tumbuhan biennial (siklus hidup 12 - 24 bulan) yang menyimpan karbohidrat dalam jumlah besar",R.drawable.wortel));
        sayuranArrayList.add(new Sayuran("Buncis", "Buncis, adalah sejenis polong-polongan yang dapat dimakan dari berbagai kultivar Phaseolus vulgaris. Buah, biji, dan daunnya dimanfaatkan orang sebagai sayuran.",R.drawable.buncis));
    }
}
