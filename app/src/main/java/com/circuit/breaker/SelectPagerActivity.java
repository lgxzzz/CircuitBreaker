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

import com.circuit.breaker.bean.Params;
import com.circuit.breaker.data.DBManger;
import com.circuit.breaker.data.DataBase;

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

    Params mParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_pager);
        init();
    }

    public void init(){

        mParams = DataBase.createDefaultParams();

        mParamsBtn1 = findViewById(R.id.param1_btn);
        mParamsBtn2 = findViewById(R.id.param2_btn);
        mParamsBtn3 = findViewById(R.id.param3_btn);

        mParamsBtn1.setOnClickListener(this);
        mParamsBtn2.setOnClickListener(this);
        mParamsBtn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SelectPagerActivity.this, ParamsActivity.class);
        switch (v.getId()){
            case R.id.param1_btn:
                intent.putExtra("title", "参数变量");
                intent.putExtra("type", "参数变量");

                break;
            case R.id.param2_btn:
                intent.putExtra("title", "当前变量");
                intent.putExtra("type", "当前变量");
                break;
            case R.id.param3_btn:
                intent.putExtra("title", "累计记录");
                intent.putExtra("type", "累计记录");
                break;
        }
        Bundle b = new Bundle();
        b.putSerializable("params",mParams);
        intent.putExtras(b);
        startActivity(intent);
    }
}
