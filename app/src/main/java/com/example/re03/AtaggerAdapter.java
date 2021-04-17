package com.example.re03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

public class AtaggerAdapter extends RecyclerView.Adapter<AtaggerAdapter.LinearViewHolder> {
    private Context context;

    public AtaggerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public LinearViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LinearViewHolder linearViewHolder = new LinearViewHolder(LayoutInflater.from(context).inflate(R.layout.item01,parent,false));
        return linearViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull LinearViewHolder holder, int position) {
        if (position %2==0){

            holder.imageView.setImageResource(R.drawable.a);
        }else
        {
            holder.imageView.setImageResource(R.drawable.b);

        }

    }

    @Override
    public int getItemCount() {
        return 30;
    }

    static class LinearViewHolder extends RecyclerView.ViewHolder {

     ImageView imageView;
        public LinearViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv);
        }
    }
}
