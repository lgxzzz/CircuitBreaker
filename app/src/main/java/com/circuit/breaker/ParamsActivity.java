package com.circuit.breaker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.circuit.breaker.bean.Param;
import com.circuit.breaker.bean.Params;
import com.circuit.breaker.bean.Params1;
import com.circuit.breaker.bean.Params2;
import com.circuit.breaker.bean.Params3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 参数界面
 * */
public class ParamsActivity extends Activity implements View.OnClickListener{
    //标题
    private TextView mTitleBtn;
    //一键获取
    private Button mOneKeyBtn;
    //内容布局
    private LinearLayout mParentView;

    //显示集合
    List<View> mValueViews = new ArrayList<>();

    String mTitile;
    String mType;
    Params mParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_params);
        init();
    }

    public void init(){

        mTitile = getIntent().getExtras().getString("title");
        mType = getIntent().getExtras().getString("type");

        mParams = (Params) getIntent().getExtras().get("params");

        mTitleBtn = findViewById(R.id.titile);
        mOneKeyBtn = findViewById(R.id.one_key_btn);
        mParentView = findViewById(R.id.params_layout);

        mTitleBtn.setText(mTitile);

        mOneKeyBtn.setOnClickListener(this);
        LinkedHashMap<String, Param> mNameMap = null;
        if (mType.equals("参数变量")){
            Params1 param1 = mParams.getParams1();
            mNameMap = param1.getNameMap();

        }else if (mType.equals("当前变量")){
            Params2 param2 = mParams.getParams2();
            mNameMap = param2.getNameMap();
        }if (mType.equals("累计记录")){
            Params3 param3 = mParams.getParams3();
            mNameMap = param3.getNameMap();
        }
        //动态添加参数布局
        if (mNameMap!=null){
            for ( Map.Entry<String,Param> entry : mNameMap.entrySet()) {
                Param param = entry.getValue();
                View itemView = LayoutInflater.from(ParamsActivity.this).inflate(R.layout.params_item, null);
                TextView titleTv = itemView.findViewById(R.id.params_title);
                final TextView valueTv = itemView.findViewById(R.id.params_value);
                valueTv.setText(param.getValue());
                valueTv.setVisibility(View.GONE);
                Button getValueBtn = itemView.findViewById(R.id.params_get_btn);
                titleTv.setText(param.getName());
                getValueBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        valueTv.setVisibility(View.VISIBLE);
                    }
                });
                mValueViews.add(valueTv);
                mParentView.addView(itemView);
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.one_key_btn:
                for (int i=0;i<mValueViews.size();i++){
                    View view = mValueViews.get(i);
                    view.setVisibility(View.VISIBLE);
                }
                break;
        }
    }
}
