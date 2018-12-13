package com.example.baicha.zchz.app.app.wode.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baicha.zchz.R;
import com.example.baicha.zchz.app.app.Dengru.Dengru;
import com.example.baicha.zchz.app.app.base.BaseFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.content.Context.MODE_PRIVATE;

public class WodeFragment extends BaseFragment {
    private ListView listView;
    private TextView textView,gerenxinxi;
    private int[] imageId = new int[]{R.drawable.wodedizhi,R.drawable.wodepingjia,R.drawable.kefu};
    private String[] wenzi = new String[]{"我的评价","帮助与反馈","客服中心"};
    private int[] imageId1 = new int[]{R.drawable.gengduo,R.drawable.gengduo,R.drawable.gengduo};
    @Override
    protected View initView() {
        View view = View.inflate(mContext,R.layout.fragment_wode,null);
        listView = view.findViewById(R.id.listwode);
        textView = view.findViewById(R.id.txt_account_name1);
        gerenxinxi = view.findViewById(R.id.gerenxinxi);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("yonghu", MODE_PRIVATE);
        textView.setText(sharedPreferences.getString("用户名","请先登入"));
        SharedPreferences sharedPreferences1 = getActivity().getSharedPreferences("yonghu", MODE_PRIVATE);
        gerenxinxi.setText(sharedPreferences1.getString("是否登录","登入查看信息"));

        return view;
    }

    @Override
    public void initData() {
        super.initData();
    }
    public void  onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        list();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Dengru.class));
            }
        });
    }
    public void list(){
        List<Map<String,Object>> listItems = new ArrayList<>();
        for (int i = 0; i < imageId.length; i++ ){
            Map<String,Object> map = new HashMap<>();
            map.put("image",imageId[i]);
            map.put("text",wenzi[i]);
            map.put("image1",imageId1[i]);
            listItems.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(
                getActivity(),
                listItems,
                R.layout.item,
                new  String[]{"image","text","image1"},
                new int[] {R.id.image, R.id.text, R.id.image1}
        );
        listView.setAdapter(adapter);
        //设置listview点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //position 点击的Item位置，从0开始算
                // Intent intent=new Intent();
                // intent.putExtra("xx","");//传递给下一个Activity的值
                //  startActivity(intent);//启动Activity
                if (position == 0){
                    Toast.makeText(getActivity(),"123",Toast.LENGTH_SHORT).show();}
                if (position == 1){
                    Toast.makeText(getActivity(),"1",Toast.LENGTH_SHORT).show();}
                if (position == 2){
                    Toast.makeText(getActivity(),"2",Toast.LENGTH_SHORT).show();}
                if (position == 3){
                    Toast.makeText(getActivity(),"3",Toast.LENGTH_SHORT).show();}
            }
        });
    }
}
