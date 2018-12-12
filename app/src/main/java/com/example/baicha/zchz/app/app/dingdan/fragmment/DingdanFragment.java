package com.example.baicha.zchz.app.app.dingdan.fragmment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baicha.zchz.R;
import com.example.baicha.zchz.app.app.base.BaseFragment;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *订单fragment
 */
public class DingdanFragment extends BaseFragment {
    private ListView listView;
    private int[] imageId = new int[]{R.drawable.a,R.drawable.b,R.drawable.c};

    private String[] dianming = new String[]{"回味香","瘦肉丸","欣时客"};

    private String[] dingdan = new String[]{"订单已完成","订单进行中","订单已完成"};

    private String[] shijian = new String[]{"4小时36分钟前","8小时57分钟前","1天前"};

    private String[] caipin = new String[]{"包子+油条+粥","砂锅面","包子+拌粉"};

    private String[] jiage = new String[]{"￥8.50","￥7.50","￥8.00"};



    @Override
    protected View initView() {
        View view = View.inflate(mContext,R.layout.fragment_dingdan,null);
        listView = view.findViewById(R.id.listv);
        return view;
    }
    @Override
    public void initData() {
        super.initData();
    }
    public void  onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        list();
    }
    public void list(){
        List<Map<String,Object>> listItems = new ArrayList<>();
        for (int i = 0; i < imageId.length; i++ ){
            Map<String,Object> map = new HashMap<>();
            map.put("image",imageId[i]);
            map.put("dianming",dianming[i]);
            map.put("dingdan",dingdan[i]);
            map.put("shijian",shijian[i]);
            map.put("caipin",caipin[i]);
            map.put("jiage",jiage[i]);
            listItems.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(
                getActivity(),
                listItems,
                R.layout.dingdan,
                new  String[]{"dianming","image","dingdan","shijian","caipin","jiage"},
                new int[] {R.id.dianming, R.id.image, R.id.dingdan, R.id.shijian, R.id.caipin,R.id.jiage}
        );
        listView.setAdapter(adapter);
    }
}
