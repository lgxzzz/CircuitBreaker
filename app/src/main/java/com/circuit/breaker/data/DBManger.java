package com.circuit.breaker.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.circuit.breaker.bean.Params1;
import com.circuit.breaker.bean.Params2;
import com.circuit.breaker.bean.Params3;
import com.circuit.breaker.bean.User;
import com.circuit.breaker.util.SharedPreferenceUtil;


import java.util.ArrayList;
import java.util.List;

public class DBManger {
    private Context mContext;
    private SQLiteDbHelper mDBHelper;
    public User mUser;
    public DataBase mDataBase;
    public static  DBManger instance;
    public static DBManger getInstance(Context mContext){
        if (instance == null){
            instance = new DBManger(mContext);
        }
        return instance;
    };

    public DBManger(final Context mContext){
        this.mContext = mContext;
        mDBHelper = new SQLiteDbHelper(mContext);
        mDataBase = new DataBase();
        if (SharedPreferenceUtil.getFirstTimeUse(mContext)){
            initDefaultData();
            SharedPreferenceUtil.setFirstTimeUse(false,mContext);
        }
    }


    //用户登陆
    public void login(String name, String password, IListener listener){
        try{
            SQLiteDatabase db = mDBHelper.getWritableDatabase();
            Cursor cursor = db.rawQuery("select * from UserInfo where USER_NAME =? and USER_PASSWORD=?",new String[]{name,password});
            if (cursor.moveToFirst()){
                String USER_ID = cursor.getString(cursor.getColumnIndex("USER_ID"));
                String USER_NAME = cursor.getString(cursor.getColumnIndex("USER_NAME"));
                String USER_MAIL = cursor.getString(cursor.getColumnIndex("USER_MAIL"));
                String USER_TEL = cursor.getString(cursor.getColumnIndex("USER_TEL"));
                String USER_ROLE = cursor.getString(cursor.getColumnIndex("USER_ROLE"));

                mUser = new User();
                mUser.setUserId(USER_ID);
                mUser.setUserName(USER_NAME);
                mUser.setTelephone(USER_TEL);
                listener.onSuccess();
            }else{
                listener.onError("未查询到该用户");
            }
            db.close();
            return;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        listener.onError("未查询到该用户");
    }

    //修改用户信息
    public void updateUser(User user,IListener listener){
        try{
            SQLiteDatabase db = mDBHelper.getWritableDatabase();
            Cursor cursor = db.rawQuery("select * from UserInfo where USER_NAME=?",new String[]{user.getUserName()});
            if (cursor.moveToFirst()){
                ContentValues values = new ContentValues();
                values.put("USER_NAME",user.getUserName());
                values.put("USER_TEL",user.getTelephone());
                values.put("USER_PASSWORD",user.getPassword());

                int code = db.update(SQLiteDbHelper.TAB_USER,values,"USER_NAME =?",new String[]{user.getUserName()+""});
                listener.onSuccess();
            }else {
                insertUser(user,listener);
            }
            db.close();
        }catch (Exception e){

        }
    }

    //注册用户
    public void registerUser(User user,IListener listener){
        try{
            SQLiteDatabase db = mDBHelper.getWritableDatabase();
            Cursor cursor = db.rawQuery("select * from UserInfo where USER_NAME=?",new String[]{user.getUserName()});
            if (cursor.moveToFirst()){
                listener.onError("用户名已经被注册！");
            }else{
                String userid = getRandomUSER_ID();
                ContentValues values = new ContentValues();
                values.put("USER_ID",userid);
                values.put("USER_NAME",user.getUserName());
                values.put("USER_PASSWORD",user.getPassword());
                mUser = user;
                mUser.setUserId(userid);
                mUser.setUserName(user.getUserName());
                mUser.setTelephone(user.getTelephone());
                long code = db.insert(SQLiteDbHelper.TAB_USER,null,values);
                listener.onSuccess();
            }
            db.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    };

    //注册用户
    public void insertUser(User user,IListener listener){
        try{
            SQLiteDatabase db = mDBHelper.getWritableDatabase();
            Cursor cursor = db.rawQuery("select * from UserInfo where USER_NAME=?",new String[]{user.getUserName()});
            if (cursor.moveToFirst()){
                listener.onError("用户名已经被注册！");
            }else{
                String userid = getRandomUSER_ID();
                ContentValues values = new ContentValues();
                values.put("USER_ID",userid);
                values.put("USER_NAME",user.getUserName());
                values.put("USER_PASSWORD",user.getPassword());
                values.put("USER_TEL",user.getTelephone());
                long code = db.insert(SQLiteDbHelper.TAB_USER,null,values);
                listener.onSuccess();
            }
            db.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    };


    //生成随机userid
    public String getRandomUSER_ID(){
        String strRand="LF" ;
        for(int i=0;i<10;i++){
            strRand += String.valueOf((int)(Math.random() * 10)) ;
        }
        return strRand;
    }

    //获取所有用户
    public List<User> getAllUsers(){
        List<User> mUsers = new ArrayList<>();
        try{
            SQLiteDatabase db = mDBHelper.getWritableDatabase();
            Cursor cursor = db.query(SQLiteDbHelper.TAB_USER,null,null,null,null,null,null);
            while (cursor.moveToNext()){
                String USER_ID = cursor.getString(cursor.getColumnIndex("USER_ID"));
                String USER_NAME = cursor.getString(cursor.getColumnIndex("USER_NAME"));
                String USER_PASSWORD = cursor.getString(cursor.getColumnIndex("USER_PASSWORD"));
                String USER_TEL = cursor.getString(cursor.getColumnIndex("USER_TEL"));
                String USER_MAIL = cursor.getString(cursor.getColumnIndex("USER_MAIL"));
                String USER_ROLE = cursor.getString(cursor.getColumnIndex("USER_ROLE"));

                User user = new User();
                user.setUserId(USER_ID);
                user.setUserName(USER_NAME);
                user.setPassword(USER_PASSWORD);
                user.setTelephone(USER_TEL);
                mUsers.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return mUsers;
    }

    //添加参数变量
    public void insertParams1(Params1 params1){
        try{
            SQLiteDatabase db = mDBHelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("P1_ID",params1.getP1_ID());
            values.put("P1_ADDRESS",params1.getP1_ADDRESS());
            values.put("P1_NUMBER",params1.getP1_NUMBER());
            values.put("P1_ZICAN_NUMBER",params1.getP1_ZICAN_NUMBER());
            values.put("P1_EX_VOL",params1.getP1_EX_VOL());
            values.put("P1_RATE_DIANLIU",params1.getP1_RATE_DIANLIU());
            values.put("P1_JIAKE_DIANLIU",params1.getP1_JIAKE_DIANLIU());
            values.put("P1_DEVICE_NUMBER",params1.getP1_DEVICE_NUMBER());
            values.put("P1_PRODUCE_TIME",params1.getP1_PRODUCE_TIME());
            values.put("P1_AGREEN_VERSION",params1.getP1_AGREEN_VERSION());
            values.put("P1_FAC_NUMBER",params1.getP1_FAC_NUMBER());
            values.put("P1_GUJIAN_VERSION",params1.getP1_GUJIAN_VERSION());
            values.put("P1_YINGJIAN_VERSION",params1.getP1_YINGJIAN_VERSION());
            values.put("P1_EX_SHENGYUDIANLIU",params1.getP1_EX_SHENGYUDIANLIU());
            values.put("P1_EX_JIXIAN",params1.getP1_EX_JIXIAN());
            values.put("P1_EX_FENDUAN_TIME",params1.getP1_EX_FENDUAN_TIME());
            values.put("P1_ZIDONGCHIONGHE_TIME",params1.getP1_ZIDONGCHIONGHE_TIME());
            values.put("P1_TYPE",params1.getP1_TYPE());
            values.put("P1_ANZHUANG",params1.getP1_ANZHUANG());
            long code = db.insert(SQLiteDbHelper.TAB_PARAMS_1,null,values);
            db.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //添加当前变量
    public void insertParams2(Params2 params2){
        try{
            SQLiteDatabase db = mDBHelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("P2_ID",params2.getP2_ID());
            values.put("P2_DIANYA_A",params2.getP2_DIANYA_A());
            values.put("P2_DIANYA_B",params2.getP2_DIANYA_B());
            values.put("P2_DIANYA_C",params2.getP2_DIANYA_C());
            values.put("P2_DIANLIU_A",params2.getP2_DIANLIU_A());
            values.put("P2_DIANLIU_B",params2.getP2_DIANLIU_B());
            values.put("P2_DIANLIU_C",params2.getP2_DIANLIU_C());
            values.put("P2_REMAIN_DIANLIU",params2.getP2_REMAIN_DIANLIU());
            values.put("P2_REMAIN_DIANLIU_VALUE",params2.getP2_REMAIN_DIANLIU_VALUE());
            values.put("P2_REMAIN_DIANLIU_DONGZUO",params2.getP2_REMAIN_DIANLIU_DONGZUO());
            values.put("P2_JIXIAN_BUQUDONG_TIME",params2.getP2_JIXIAN_BUQUDONG_TIME());
            values.put("P2_SANXIANG",params2.getP2_SANXIANG());
            values.put("P2_SANXIANG_A",params2.getP2_SANXIANG_A());
            values.put("P2_SANXIANG_B",params2.getP2_SANXIANG_B());
            values.put("P2_SANXIANG_C",params2.getP2_SANXIANG_C());
            values.put("P2_DEVICE_1",params2.getP2_DEVICE_1());
            values.put("P2_DEVICE_2",params2.getP2_DEVICE_2());
            long code = db.insert(SQLiteDbHelper.TAB_PARAMS_2,null,values);
            db.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //添加累计记录
    public void insertParams3(Params3 params3){
        try{
            SQLiteDatabase db = mDBHelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("P3_ID",params3.getP3_ID());
            values.put("P3_DATA_CLEAR_COUNT",params3.getP3_DATA_CLEAR_COUNT());
            values.put("P3_ALL_TIAOZHA_COUNT",params3.getP3_ALL_TIAOZHA_COUNT());
            values.put("P3_LOUDIANBISUO_TIAOZHA_COUNT",params3.getP3_LOUDIANBISUO_TIAOZHA_COUNT());
            values.put("P3_LOUDIANBAOHU_TIAOZHA_COUNT",params3.getP3_LOUDIANBAOHU_TIAOZHA_COUNT());
            values.put("P3_GUOZHAI_TIAOZHA_COUNT",params3.getP3_GUOZHAI_TIAOZHA_COUNT());
            values.put("P3_GUOYA_TIAOZHA_COUNT",params3.getP3_GUOYA_TIAOZHA_COUNT());
            values.put("P3_SHOUDONG_TIAOZHA_COUNT",params3.getP3_SHOUDONG_TIAOZHA_COUNT());
            values.put("P3_QUELING_TIAOZHA_COUNT",params3.getP3_QUELING_TIAOZHA_COUNT());
            values.put("P3_SHIYAN_TIAOZHA_COUNT",params3.getP3_SHIYAN_TIAOZHA_COUNT());
            values.put("P3_DUANLU_TIAOZHA_COUNT",params3.getP3_DUANLU_TIAOZHA_COUNT());
            values.put("P3_DUANLU_SHUNSHI_COUNT",params3.getP3_DUANLU_SHUNSHI_COUNT());
            values.put("P3_QIANYA_TIAOZHA_COUNT",params3.getP3_QIANYA_TIAOZHA_COUNT());
            values.put("P3_QUEXIANG_TIAOZHA_COUNT",params3.getP3_QUEXIANG_TIAOZHA_COUNT());
            values.put("P3_EXCEP_INCREATE_COUNT",params3.getP3_EXCEP_INCREATE_COUNT());
            values.put("P3_BAOHU_TOUTUI_COUNT",params3.getP3_BAOHU_TOUTUI_COUNT());
            values.put("P3_GAOYASHIFU_COUNT",params3.getP3_GAOYASHIFU_COUNT());
            values.put("P3_ZHAWEI_INCREATE_COUNT",params3.getP3_ZHAWEI_INCREATE_COUNT());
            values.put("P3_ZIJIAN_INCREATE_COUNT",params3.getP3_ZIJIAN_INCREATE_COUNT());
            values.put("P3_BAOHUSHJIAN_INCREATE_COUNT",params3.getP3_BAOHUSHJIAN_INCREATE_COUNT());
            values.put("P3_TUICHULOUDIANBAOHU_COUNT",params3.getP3_TUICHULOUDIANBAOHU_COUNT());
            values.put("P3_SHEBEIYUNXINGSHIJIAN_COUNT",params3.getP3_SHEBEIYUNXINGSHIJIAN_COUNT());

            long code = db.insert(SQLiteDbHelper.TAB_PARAMS_3,null,values);
            db.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void initDefaultData(){

    }

    public interface IListener{
        public void onSuccess();
        public void onError(String error);
    };


}
