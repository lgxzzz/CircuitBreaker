package com.circuit.breaker.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.circuit.breaker.util.SharedPreferenceUtil;


public class SQLiteDbHelper extends SQLiteOpenHelper {

    //数据库名称
    public static final String DB_NAME = "PestControl.db";
    //数据库版本号
    public static int DB_VERSION = 1;
    //用户表
    public static final String TAB_USER = "UserInfo";
    //参数变量
    public static final String TAB_PARAMS_1 = "Params1";
    //当前变量
    public static final String TAB_PARAMS_2 = "Params2";
    //累计记录
    public static final String TAB_PARAMS_3 = "Params3";

    Context context;
    public SQLiteDbHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createTableUser(db);
        createTableParams1(db);
        createTableParams2(db);
        createTableParams3(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        SharedPreferenceUtil.setFirstTimeUse(true,context);
        db.execSQL("DROP TABLE IF EXISTS "+TAB_USER);
        db.execSQL("DROP TABLE IF EXISTS "+TAB_PARAMS_1);
        db.execSQL("DROP TABLE IF EXISTS "+TAB_PARAMS_2);
        db.execSQL("DROP TABLE IF EXISTS "+TAB_PARAMS_3);

        onCreate(db);
    }

    //创建人员表
    public void createTableUser(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS "+TAB_USER +
                "(USER_ID varchar(20) primary key, " +
                "USER_NAME varchar(20), " +
                "USER_PASSWORD varchar(20), " +
                "USER_TEL varchar(20), " +
                "USER_MAIL varchar(20), " +
                "USER_ROLE varchar(20))");
    }

    //创建参数变量表
    public void createTableParams1(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS "+TAB_PARAMS_1 +
                "(P1_ID varchar(20) primary key, " +
                "P1_ADDRESS varchar(20), " +  //通信地址
                "P1_NUMBER varchar(20), " + // 设备号
                "P1_ZICAN_NUMBER varchar(20), " +  // 资产管理编码
                "P1_EX_VOL varchar(20), " +  // 额外电压
                "P1_RATE_DIANLIU varchar(20), " +  // 额定电流
                "P1_JIAKE_DIANLIU varchar(20), " +  // 壳架电流
                "P1_DEVICE_NUMBER varchar(20), " +  // 设备型号
                "P1_PRODUCE_TIME varchar(20), " +  // 生产日期
                "P1_AGREEN_VERSION varchar(20), " +  // 协议版本号
                "P1_FAC_NUMBER varchar(20), " +  // 厂家工厂号码
                "P1_GUJIAN_VERSION varchar(20), " +  // 固件版本号
                "P1_YINGJIAN_VERSION varchar(20), " +  // 硬件版本号
                "P1_EX_SHENGYUDIANLIU varchar(20), " +  // 额定剩余电流动作值
                "P1_EX_JIXIAN varchar(20), " +  // 额定极限不限定值
                "P1_EX_FENDUAN_TIME varchar(20), " +  // 额定分段时间
                "P1_ZIDONGCHIONGHE_TIME varchar(20), " +  // 自动重合闸时间范围
                "P1_TYPE varchar(20), " +  // 使用类别
                "P1_ANZHUANG varchar(20))");//安装相别
    }

    //创建当前变量表
    public void createTableParams2(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS "+TAB_PARAMS_2 +
                "(P2_ID varchar(20) primary key, " +
                "P2_DIANYA_A varchar(20), " +  // A相电压值
                "P2_DIANYA_B varchar(20), " +  // B相电压值
                "P2_DIANYA_C varchar(20), " +  // C相电压值
                "P2_DIANLIU_A varchar(20), " +  // A相电流值
                "P2_DIANLIU_B varchar(20), " +  // B相电流值
                "P2_DIANLIU_C varchar(20), " +  // C相电流值
                "P2_REMAIN_DIANLIU varchar(20), " +  // 剩余电流最大相
                "P2_REMAIN_DIANLIU_VALUE varchar(20), " +  // 剩余电流值
                "P2_REMAIN_DIANLIU_DONGZUO varchar(20), " +  // 剩余电流动作值
                "P2_JIXIAN_BUQUDONG_TIME varchar(20), " +  // 极限不驱动时间
                "P2_SANXIANG varchar(20), " +  // 三相电流方向
                "P2_SANXIANG_A varchar(20), " +  // 三相A相电流值
                "P2_SANXIANG_B varchar(20), " +  // 三相B相电流值
                "P2_SANXIANG_C varchar(20), " +  // 三相C相电流值
                "P2_DEVICE_1 varchar(20), " +  // 设备状态1
                "P2_DEVICE_2 varchar(20))");//设备状态2
    }

    //创建累计记录表
    public void createTableParams3(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS "+TAB_PARAMS_3 +
                "(P3_ID varchar(20) primary key, " +
                "P3_DATA_CLEAR_COUNT varchar(20), " +  // 数据清零总次数
                "P3_ALL_TIAOZHA_COUNT varchar(20), " + // 总跳闸次数
                "P3_LOUDIANBISUO_TIAOZHA_COUNT varchar(20), " +  //  漏电闭锁跳闸次数
                "P3_LOUDIANBAOHU_TIAOZHA_COUNT varchar(20), " +  //  漏电保护跳闸次数
                "P3_GUOZHAI_TIAOZHA_COUNT varchar(20), " +  //  过载跳闸次数
                "P3_GUOYA_TIAOZHA_COUNT varchar(20), " +  //  过压跳闸次数
                "P3_SHOUDONG_TIAOZHA_COUNT varchar(20), " +  //  手动跳闸次数
                "P3_QUELING_TIAOZHA_COUNT varchar(20), " +  //  缺零跳闸次数
                "P3_SHIYAN_TIAOZHA_COUNT varchar(20), " +  //  实验跳闸次数
                "P3_DUANLU_TIAOZHA_COUNT varchar(20), " +  //  短路延时跳闸次数
                "P3_DUANLU_SHUNSHI_COUNT varchar(20), " +  //  短路瞬时次数
                "P3_QIANYA_TIAOZHA_COUNT varchar(20), " +  //  欠压跳闸次数
                "P3_QUEXIANG_TIAOZHA_COUNT varchar(20), " +  //  缺相跳闸次数
                "P3_EXCEP_INCREATE_COUNT varchar(20), " +  //  异常告警新增次数
                "P3_BAOHU_TOUTUI_COUNT varchar(20), " +  //  保护功能投退次数
                "P3_GAOYASHIFU_COUNT varchar(20), " +  //  高压失复电次数
                "P3_ZHAWEI_INCREATE_COUNT varchar(20), " +  //  闸位变化新增次数
                "P3_ZIJIAN_INCREATE_COUNT varchar(20), " +  //  自检保护新增次数
                "P3_BAOHUSHJIAN_INCREATE_COUNT varchar(20), " +  //  保护时间新增次数
                "P3_TUICHULOUDIANBAOHU_COUNT varchar(20), " +  //  退出漏电保护次数
                "P3_SHEBEIYUNXINGSHIJIAN_COUNT varchar(20))");// 设备运行时间累计
    }
}
