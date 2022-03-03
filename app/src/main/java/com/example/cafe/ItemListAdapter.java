package com.example.cafe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.itemHolder> {
    List<VegModelClass> vegItems;

    public ItemListAdapter(List<VegModelClass> vegItems) {
        this.vegItems = vegItems;
    }

    @NonNull
    @Override
    public itemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, null);
        return (new itemHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull itemHolder holder, int position) {
        holder.foodName.setText(vegItems.get(position).getFoodName());
        holder.price.setText(vegItems.get(position).getPrice());
        holder.image.setImageResource(vegItems.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return vegItems.size();
    }

    public class itemHolder extends RecyclerView.ViewHolder {
        private final ImageView image;
        private final TextView foodName;
        private final TextView price;

        public itemHolder(View view) {
            super(view);
            image = view.findViewById(R.id.img);
            foodName = view.findViewById(R.id.title);
            price = view.findViewById(R.id.price);

        }
    }
}
