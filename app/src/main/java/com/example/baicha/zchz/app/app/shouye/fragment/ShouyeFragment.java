package com.example.baicha.zchz.app.app.shouye.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.baicha.zchz.R;
import com.example.baicha.zchz.app.app.base.BaseFragment;
import com.youth.banner.Banner;

/**
 *主页面fragment
 */
public class ShouyeFragment extends BaseFragment {
    @Override
    protected View initView() {
        View view = View.inflate(mContext,R.layout.fragment_shouye,null);
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


