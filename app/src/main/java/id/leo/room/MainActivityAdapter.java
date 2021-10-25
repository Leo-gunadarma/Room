package id.leo.room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.leo.room.data.Hewan;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.HewanViewHolder> {
    private List <Hewan> dataHewan = new ArrayList<>();
    public MainActivityAdapter (List <Hewan> dataHewan){
        this.dataHewan = dataHewan;
    }

    @NonNull
    @Override
    public HewanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity_main,parent,false);
        return new HewanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HewanViewHolder holder, int position) {
        holder.namaHewan.setText(dataHewan.get(position).getNamaHewan());
        holder.jenisKelamin.setText(dataHewan.get(position).getJenisKelamin());
    }

    @Override
    public int getItemCount() {
        return dataHewan.size();
    }

    public class HewanViewHolder extends RecyclerView.ViewHolder{
        public TextView namaHewan;
        public TextView jenisKelamin;
        public HewanViewHolder(@NonNull View itemView) {
            super(itemView);
            namaHewan = itemView.findViewById(R.id.textViewfieldNama);
            jenisKelamin = itemView.findViewById(R.id.textViewfieldKelamin);
        }
    }

}
