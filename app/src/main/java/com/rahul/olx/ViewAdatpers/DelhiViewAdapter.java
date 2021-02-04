package com.rahul.olx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.olx.ClickListeners.DelhiClickListener;
import com.rahul.olx.DelhiResponseClasses.DataDelhiClasses;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;
import com.rahul.olx.R;
import com.rahul.olx.ViewHolders.DelhiLocationViewHolder;

import java.util.List;

public class DelhiViewAdapter extends RecyclerView.Adapter<DelhiLocationViewHolder> {
    private List<DataDelhiClasses> dataDelhiClassesList;
    private DelhiClickListener delhiClickListener;

    public DelhiViewAdapter(List<DataDelhiClasses> dataDelhiClassesList, DelhiClickListener delhiClickListener) {
        this.dataDelhiClassesList = dataDelhiClassesList;
        this.delhiClickListener = delhiClickListener;
    }

    @NonNull
    @Override
    public DelhiLocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_for_mumbai,parent,false);
        return new DelhiLocationViewHolder(view, delhiClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull DelhiLocationViewHolder holder, int position) {
    DataDelhiClasses dataDelhiClasses = dataDelhiClassesList.get(position);
    holder.setData(dataDelhiClasses);
    }

    @Override
    public int getItemCount() {
        return dataDelhiClassesList.size();
    }
    public void updateData(List<DataDelhiClasses> dataDelhiClasses)
    {
        this.dataDelhiClassesList = dataDelhiClasses;
        notifyDataSetChanged();
    }
}
