package com.circuit.breaker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.circuit.breaker.bean.Params;
import com.circuit.breaker.bean.Params1;

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

        if (mType.equals("参数变量")){
             Params1 param1 = mParams.getParams1();


        }else if (mType.equals("当前变量")){

        }if (mType.equals("累计记录")){

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.one_key_btn:
                startActivity(new Intent(ParamsActivity.this, RegisterActivity.class));
                break;
        }
    }
}
