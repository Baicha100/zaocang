package com.example.baicha.zchz.app.app.shouye.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

import com.bumptech.glide.Glide;
import com.example.baicha.zchz.R;
import com.youth.banner.Banner;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class Shitang extends FragmentActivity {
    private Banner banner;
    private ImageView imageView;
    private  RadioGroup rgmain;
    private int position = 0;
    /**
     * 缓存的Fragment或者上次显示的Fragment
     */
    private Fragment tempFragment;
    /**
     * 装多个Fragment的实例集合
     */
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shitang);
       banner = (Banner)findViewById(R.id.banner1);
       imageView = findViewById(R.id.fanhui);
       imageView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });

       init();


    }
   public void init(){
        int[] imageResouceID=new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
        List<Integer> imageList=new ArrayList<>();
        for (int i=0;i<imageResouceID.length;i++){
            imageList.add(imageResouceID[i]);
            banner.setImageLoader(new ImageLoader() {
                @Override
                public void displayImage(Context context, Object path, ImageView imageView) {
                    Glide.with(Shitang.this).load(path).into(imageView);
                }
            });
            banner.setDelayTime(3000);
            //设置轮播的动画效果,里面有很多种特效,可以都看看效果。
            banner.setBannerAnimation(Transformer.ZoomOutSlide);
            banner.setImages(imageList);
            banner.start();
        }
    }
    public void onStart(){
        super.onStart();
        banner.startAutoPlay();
    }
}
