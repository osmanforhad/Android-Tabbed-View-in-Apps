package com.osmanforhad.fragmentwithviewpagertabbedview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTwo extends Fragment {
    //Create an object for View
    View v2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
//Catch the data from xml using object
        v2 = inflater.inflate(R.layout.fragment_two_layout, container, false);
        return v2;
    }
}
