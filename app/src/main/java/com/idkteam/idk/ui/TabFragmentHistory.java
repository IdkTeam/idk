package com.idkteam.idk.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idkteam.idk.R;

/**
 * Created by Danny on 27/08/2016.
 */
public class TabFragmentHistory extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment_history, container, false);
    }
}

