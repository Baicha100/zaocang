package com.example.baicha.zchz.app.app.shouye.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.example.baicha.zchz.R;
import com.example.baicha.zchz.app.app.base.BaseFragment;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 *主页面fragment
 */
public class ShouyeFragment extends BaseFragment {
    private TextView textView;
    private Banner banner;
    private ViewFlipper flipper;
    private int[] resId = {R.drawable.pc1, R.drawable.pc2, R.drawable.pc3, R.drawable.pc4};

    @Override
    protected View initView() {
        View view = View.inflate(mContext,R.layout.fragment_shouye,null);
        //找到flipper
        flipper =  view.findViewById(R.id.flipper);
        // 动态导入的方式为ViewFlipper加入子View
        for (int i = 0; i < resId.length; i++) {
            flipper.addView(getImageView(resId[i]));
        }
        //为ViewFlipper去添加动画效果
        flipper.setInAnimation(getContext(), R.anim.in);
        flipper.setOutAnimation(getContext(), R.anim.out);
        flipper.setFlipInterval(2000);
        flipper.startFlipping();
        return view;
    }


    @Override
    public void initData() {
        super.initData();
    }
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //init();
    }


    //获取图片背景
    private ImageView getImageView(int resId) {
        ImageView image = new ImageView(getContext());
        image.setBackgroundResource(resId);
        return image;
    }

   /* public void init(){
        banner=getActivity().findViewById(R.id.banner);
        int[] imageResouceID=new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
        List<Integer> imageList=new ArrayList<>();
        for (int i=0;i<imageResouceID.length;i++){
            imageList.add(imageResouceID[i]);
            banner.setImageLoader(new ImageLoader() {
                @Override
                public void displayImage(Context context, Object path, ImageView imageView) {
                    Glide.with(ShouyeFragment.this).load(path).into(imageView);
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
    */
}


