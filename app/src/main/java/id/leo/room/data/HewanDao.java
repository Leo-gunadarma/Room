package id.leo.room.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;
@Dao
public interface HewanDao {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insertData (Hewan ... hewans);

    @Query("SELECT * FROM tb_hewan")
    List<Hewan> getAllData();
}
