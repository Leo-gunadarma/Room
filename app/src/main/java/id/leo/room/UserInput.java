package id.leo.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.leo.room.data.Hewan;
import id.leo.room.data.HewanDatabase;

public class UserInput extends AppCompatActivity {
    private HewanDatabase database;
    Button simpan;
    EditText namaHewan, jenisKelamin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        database = HewanDatabase.getDbInstance(this.getApplicationContext());


        simpan = findViewById(R.id.buttonSimpan);
        namaHewan = findViewById(R.id.editTextTextPersonName);
        jenisKelamin = findViewById(R.id.editTextTextPersonName2);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpan();

            }
        });
    }

    public void simpan(){
        if (namaHewan.getText().toString().trim().length() == 0){
            //method trim digunakan untuk menghapus spasi
            Toast toast = Toast.makeText(this, "Nama Hewan Belum diisi", Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        if (jenisKelamin.getText().toString().trim().length() == 0){
            Toast toast = Toast.makeText(this, "Jenis Kelamin belum diisi", Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        String namaHwn = namaHewan.getText().toString();
        String jk = jenisKelamin.getText().toString();
        Hewan aHewan = new Hewan();
        aHewan.setNamaHewan(namaHwn);
        aHewan.setJenisKelamin(jk);
        database.hewanDao().insertData(aHewan);
        Intent firstActivity = new Intent(UserInput.this, MainActivity.class);
        startActivity(firstActivity);
    }

}