package com.example.baicha.zchz.app.app.wode.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.baicha.zchz.R;
import com.example.baicha.zchz.app.app.base.BaseFragment;

public class WodeFragment extends BaseFragment {
    private TextView textView;
    @Override
    protected View initView() {
        View view = View.inflate(mContext,R.layout.fragment_wode,null);
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
