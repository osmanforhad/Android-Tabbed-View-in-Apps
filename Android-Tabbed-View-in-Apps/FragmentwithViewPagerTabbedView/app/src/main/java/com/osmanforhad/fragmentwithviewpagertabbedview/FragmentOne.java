package com.osmanforhad.fragmentwithviewpagertabbedview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentOne extends Fragment {
//Create an object for View
    View v;
    //Cretae an object for Button
    Button b;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, @Nullable Bundle savedInstanceState) {
//Catch the data from xml using object
        v = inflater.inflate(R.layout.fragment_one_layout, container,false);
//Catch the data from xml using object
        b = (Button) v.findViewById(R.id.button_for_mainPage);
//Code for Click Action
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Clicked on button", Toast.LENGTH_LONG).show();
            }
        });

        return v;
    }
}
