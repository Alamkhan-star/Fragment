package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;

    private RecyclerView myrecyclerview;
    private List<Contact> Istcontact;


    public FragmentContact() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.contact_fragment,container,false);
        myrecyclerview= v.findViewById(R.id.recycler_view);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),Istcontact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Istcontact= new ArrayList<>();
        Istcontact.add(new Contact("Alam","10:46 AM",R.drawable.ic_mood1));
        Istcontact.add(new Contact("Faizan","10:46 AM",R.drawable.ic_mood2));
        Istcontact.add(new Contact("Ali","10:46 AM",R.drawable.ic_mood4));
        Istcontact.add(new Contact("Zarshad","10:46 AM",R.drawable.ic_mood5));
        Istcontact.add(new Contact("Gull khan","10:46 AM",R.drawable.ic_mood6));
        Istcontact.add(new Contact("Shah Islam","10:46 AM",R.drawable.ic_mood_black_24dp));
        Istcontact.add(new Contact("Tor Gull","10:46 AM",R.drawable.ic_mood1));
        Istcontact.add(new Contact("Shahgi","10:46 AM6",R.drawable.ic_mood2));
        Istcontact.add(new Contact("Gull","10:46 AM",R.drawable.ic_mood4));
        Istcontact.add(new Contact("Osama","10:10 AM",R.drawable.ic_mood5));
        Istcontact.add(new Contact("Kaleem","10:39 AM",R.drawable.ic_mood6));
        Istcontact.add(new Contact("Usman","02:10 AM",R.drawable.ic_mood_black_24dp));


    }
}
