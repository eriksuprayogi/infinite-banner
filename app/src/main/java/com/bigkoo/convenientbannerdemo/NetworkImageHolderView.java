package com.bigkoo.convenientbannerdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by Sai on 15/8/4.
 * 网络图片加载例子
 */
public class NetworkImageHolderView implements Holder<String> {
    private ImageView imageView;

    @Override
    public Fragment createFragment(String data) {
//        return ContentFragment.newInstance(data);
        return null;
    }

}
