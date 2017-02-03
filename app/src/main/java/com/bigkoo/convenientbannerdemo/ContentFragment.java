package com.bigkoo.convenientbannerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by erry on 03/02/17.
 */

public class ContentFragment extends Fragment {

    public static ContentFragment newInstance() {

        Bundle args = new Bundle();

        ContentFragment fragment = new ContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.banner_item, container, false);
        return rootView;
    }
}
