package com.example.evc3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class img extends BaseAdapter{

    private Context mContext;
    public int[] images = {
            R.drawable.phone1,
            R.drawable.phone2,
            R.drawable.phone3,
            R.drawable.phone4,
    };

    public img(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(images[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new GridView.LayoutParams(
                        300,
                        320
                ));

        return imageView;
    }
}

