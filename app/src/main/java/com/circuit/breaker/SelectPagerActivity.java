package com.circuit.breaker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.circuit.breaker.data.DBManger;

/**
 * 选择查看界面
 * */
public class SelectPagerActivity extends Activity implements View.OnClickListener{
    //参数变量
    private Button mParamsBtn1;
    //当前变量
    private Button mParamsBtn2;
    //累计记录
    private Button mParamsBtn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    public void init(){

        mParamsBtn1 = findViewById(R.id.param1_btn);
        mParamsBtn2 = findViewById(R.id.param2_btn);
        mParamsBtn3 = findViewById(R.id.param3_btn);

        mParamsBtn1.setOnClickListener(this);
        mParamsBtn2.setOnClickListener(this);
        mParamsBtn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.param1_btn:
                startActivity(new Intent(SelectPagerActivity.this, RegisterActivity.class));
                break;
            case R.id.param2_btn:
                startActivity(new Intent(SelectPagerActivity.this, RegisterActivity.class));
                break;
            case R.id.param3_btn:
                startActivity(new Intent(SelectPagerActivity.this, RegisterActivity.class));
                break;
        }
    }
}
