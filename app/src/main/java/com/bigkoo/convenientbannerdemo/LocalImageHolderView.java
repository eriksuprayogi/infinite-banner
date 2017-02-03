package com.bigkoo.convenientbannerdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bigkoo.convenientbanner.holder.Holder;

/**
 * Created by Sai on 15/8/4.
 */
public class LocalImageHolderView implements Holder<Integer> {

    @Override
    public Fragment createFragment(Integer data) {
        return ContentFragment.newInstance(data);
    }

}
