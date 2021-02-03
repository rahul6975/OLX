package com.rahul.olx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.olx.KolKataResponseClasses.DataKolkataClasses;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;
import com.rahul.olx.R;
import com.rahul.olx.ViewHolders.KolkataViewHolder;

import java.util.List;

public class KolkataViewAdapter extends RecyclerView.Adapter<KolkataViewHolder> {
    private List<DataKolkataClasses> dataKolkataClassesList;

    public KolkataViewAdapter(List<DataKolkataClasses> dataKolkataClassesList) {
        this.dataKolkataClassesList = dataKolkataClassesList;
    }

    @NonNull
    @Override
    public KolkataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_for_mumbai,parent,false);

        return new KolkataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KolkataViewHolder holder, int position) {
        DataKolkataClasses dataKolkataClasses = dataKolkataClassesList.get(position);
        holder.setData(dataKolkataClasses);

    }

    @Override
    public int getItemCount() {
        return dataKolkataClassesList.size();
    }

    public void updateData(List<DataKolkataClasses> dataKolkataClasses)
    {
        this.dataKolkataClassesList = dataKolkataClasses;
        notifyDataSetChanged();
    }
}
