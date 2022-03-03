package com.example.cafe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.itemHolder> {
    private final String[] itemsList;

    public ItemListAdapter(String[] itemsList) {
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public itemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, null);
        return (new itemHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull itemHolder holder, int position) {
        String value = itemsList[position];
        holder.title.setText(value);
    }

    @Override
    public int getItemCount() {
        return itemsList.length;
    }

    public class itemHolder extends RecyclerView.ViewHolder {
        private final ImageView img;
        private final TextView title;
        private final TextView price;

        public itemHolder(View view) {
            super(view);
            img = view.findViewById(R.id.img);
            title = view.findViewById(R.id.title);
            price = view.findViewById(R.id.price);

        }
    }
}
