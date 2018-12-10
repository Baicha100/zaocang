package com.example.baicha.zchz.app.app.dingdan.fragmment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.baicha.zchz.R;
import com.example.baicha.zchz.app.app.base.BaseFragment;
import com.youth.banner.Banner;

/**
 *订单fragment
 */
public class DingdanFragment extends BaseFragment {

    @Override
    protected View initView() {
        View view = View.inflate(mContext,R.layout.fragment_dingdan,null);
        return view;
    }
    @Override
    public void initData() {
        super.initData();
    }
    public void  onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

    }
}
