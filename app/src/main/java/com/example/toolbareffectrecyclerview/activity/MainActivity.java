package com.example.toolbareffectrecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.toolbareffectrecyclerview.R;
import com.example.toolbareffectrecyclerview.adapter.MainAdapter;
import com.example.toolbareffectrecyclerview.model.Member;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        ArrayList<Member> members = prepareMemberList();
        refreshAdapter(members);

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
    }


    private void refreshAdapter(ArrayList<Member> members){
        MainAdapter adapter = new MainAdapter(members);
        recyclerView.setAdapter(adapter);
    }


    protected ArrayList<Member> prepareMemberList() {
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            members.add(new Member(i + ". Uchqun", i + ". Azimboyev", R.drawable.uchqun));
        }
        return members;
    }

}