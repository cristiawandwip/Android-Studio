package com.cristiawan.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    public void load() {
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void isiData() {
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Natha", "Sidoarjo"));
        siswaList.add(new Siswa("Wawan", "Sidoarjo"));
        siswaList.add(new Siswa("Budi", "Sidoarjo"));
        siswaList.add(new Siswa("Tejo", "Sidoarjo"));
        siswaList.add(new Siswa("Rara", "Sidoarjo"));
        siswaList.add(new Siswa("Rere", "Sidoarjo"));
        siswaList.add(new Siswa("Habib", "Sidoarjo"));
        siswaList.add(new Siswa("Marga", "Sidoarjo"));
        siswaList.add(new Siswa("Rani", "Sidoarjo"));
        siswaList.add(new Siswa("Rini", "Sidoarjo"));
        siswaList.add(new Siswa("Criss", "Sidoarjo"));
        siswaList.add(new Siswa("Eko", "Sidoarjo"));
        siswaList.add(new Siswa("Yuli", "Sidoarjo"));
        siswaList.add(new Siswa("Natha", "Sidoarjo"));
        siswaList.add(new Siswa("Natha", "Sidoarjo"));
        siswaList.add(new Siswa("Natha", "Sidoarjo"));
        siswaList.add(new Siswa("Natha", "Sidoarjo"));
        siswaList.add(new Siswa("Natha", "Sidoarjo"));
        siswaList.add(new Siswa("Natha", "Sidoarjo"));
        siswaList.add(new Siswa("Natha", "Sidoarjo"));
        siswaList.add(new Siswa("Natha", "Sidoarjo"));

        adapter = new SiswaAdapter(this, siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("NATHALIA", "SURABAYA"));
        adapter.notifyDataSetChanged();
    }
}