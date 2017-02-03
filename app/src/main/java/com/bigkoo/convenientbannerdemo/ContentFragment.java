package com.bigkoo.convenientbannerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by erry on 03/02/17.
 */

public class ContentFragment extends Fragment {

    public static ContentFragment newInstance(int res) {

        Bundle args = new Bundle();
        args.putInt("image", res);
        ContentFragment fragment = new ContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.banner_item, container, false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView);
        imageView.setImageResource(getArguments().getInt("image"));
        return rootView;
    }
}
