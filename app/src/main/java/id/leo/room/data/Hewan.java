package id.leo.room.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "tb_hewan")
public class Hewan {
    @PrimaryKey (autoGenerate = true)
    private int id;
    @ColumnInfo (name = "nama_hewan")
    private String namaHewan;
    @ColumnInfo (name = "jenis_kelamin")
    private String jenisKelamin;

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
