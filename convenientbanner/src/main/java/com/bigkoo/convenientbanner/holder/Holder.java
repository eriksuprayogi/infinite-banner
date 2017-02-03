package com.bigkoo.convenientbanner.holder;

/**
 * Created by Sai on 15/12/14.
 * @param <T> 任何你指定的对象
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public interface Holder<T>{
    Fragment createFragment(T data);
}