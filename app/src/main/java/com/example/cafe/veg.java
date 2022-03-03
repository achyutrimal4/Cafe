package com.example.cafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class veg extends Fragment {

    private RecyclerView recyclerView;
    private List<VegModelClass> listVegItems;

    public veg() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_veg, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        ItemListAdapter adapter = new ItemListAdapter(listVegItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listVegItems = new ArrayList<>();
        listVegItems.add(new VegModelClass("Bhaat", "Rs. 150.0", R.drawable.one));
        listVegItems.add(new VegModelClass("Roti Tarkari", "Rs. 100.0", R.drawable.two));
        listVegItems.add(new VegModelClass("Khana Set", "Rs. 200.0", R.drawable.three));
        listVegItems.add(new VegModelClass("Chowmein", "Rs. 70.0", R.drawable.four));
        listVegItems.add(new VegModelClass("Momo", "Rs. 80.0", R.drawable.five));
        listVegItems.add(new VegModelClass("Bhaat", "Rs. 150.0", R.drawable.one));
        listVegItems.add(new VegModelClass("Roti Tarkari", "Rs. 100.0", R.drawable.two));
        listVegItems.add(new VegModelClass("Khana Set", "Rs. 200.0", R.drawable.three));
        listVegItems.add(new VegModelClass("Chowmein", "Rs. 70.0", R.drawable.four));
        listVegItems.add(new VegModelClass("Momo", "Rs. 80.0", R.drawable.five));
        listVegItems.add(new VegModelClass("Bhaat", "Rs. 150.0", R.drawable.one));
        listVegItems.add(new VegModelClass("Roti Tarkari", "Rs. 100.0", R.drawable.two));
        listVegItems.add(new VegModelClass("Khana Set", "Rs. 200.0", R.drawable.three));
        listVegItems.add(new VegModelClass("Chowmein", "Rs. 70.0", R.drawable.four));
        listVegItems.add(new VegModelClass("Momo", "Rs. 80.0", R.drawable.five));
        listVegItems.add(new VegModelClass("Bhaat", "Rs. 150.0", R.drawable.one));
        listVegItems.add(new VegModelClass("Roti Tarkari", "Rs. 100.0", R.drawable.two));
        listVegItems.add(new VegModelClass("Khana Set", "Rs. 200.0", R.drawable.three));
        listVegItems.add(new VegModelClass("Chowmein", "Rs. 70.0", R.drawable.four));
        listVegItems.add(new VegModelClass("Momo", "Rs. 80.0", R.drawable.five));


    }
}