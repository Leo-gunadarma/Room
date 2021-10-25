package id.leo.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import id.leo.room.data.Hewan;
import id.leo.room.data.HewanDatabase;

public class MainActivity extends AppCompatActivity {
    private HewanDatabase database;
    Button tambahData;
    RecyclerView recyclerView;
    MainActivityAdapter adapter;
    List<Hewan> listHewan = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database = HewanDatabase.getDbInstance(this);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listHewan = database.hewanDao().getAllData();
        adapter = new MainActivityAdapter(listHewan);
        recyclerView.setAdapter(adapter);
        tambahData = findViewById(R.id.buttonAdd);
        tambahData.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent secondActivity = new Intent(MainActivity.this , UserInput.class);
                startActivity(secondActivity);
            }
        });
    }
}