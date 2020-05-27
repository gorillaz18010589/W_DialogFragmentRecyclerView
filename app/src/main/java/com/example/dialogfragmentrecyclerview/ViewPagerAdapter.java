package com.example.dialogfragmentrecyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class ViewPagerAdapter  extends PagerAdapter {
    private List<View> viewList;//数据源

    public ViewPagerAdapter(List<View> list){
        viewList = list;
    }

    @Override
    public int getCount() {
    return viewList==null?0:viewList.size();

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        if(viewList != null) {
            container.removeView(viewList.get(position));
        }
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        if(viewList != null) {
            container.addView(viewList.get(position));
            return viewList.get(position);
        }
        return super.instantiateItem(container, position);
    }

}
