package com.app.lianxi.myapplication1.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.lianxi.myapplication1.R;
import com.panxw.android.imageindicator.ImageIndicatorView;

/**
 * Created by dell on 2018/2/15.
 */

public class PersonalFragment extends Fragment {
    private ImageIndicatorView indicate_View;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_home,null);

            return super.onCreateView(inflater,container,savedInstanceState);
    }


}
