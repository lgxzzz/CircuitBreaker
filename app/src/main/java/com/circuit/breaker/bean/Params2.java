package com.circuit.breaker.bean;

import java.io.Serializable;
import java.util.LinkedHashMap;

public class Params2 implements Serializable {
    String P2_ID;
    String P2_DIANYA_A;
    String P2_DIANYA_B;
    String P2_DIANYA_C;
    String P2_DIANLIU_A;
    String P2_DIANLIU_B;
    String P2_DIANLIU_C;
    String P2_REMAIN_DIANLIU;
    String P2_REMAIN_DIANLIU_VALUE;
    String P2_REMAIN_DIANLIU_DONGZUO;
    String P2_JIXIAN_BUQUDONG_TIME;
    String P2_SANXIANG;
    String P2_SANXIANG_A;
    String P2_SANXIANG_B;
    String P2_SANXIANG_C;
    String P2_DEVICE_1;
    String P2_DEVICE_2;

    LinkedHashMap<String,Param> mNameMap = new LinkedHashMap<>();

    public LinkedHashMap<String,Param> getNameMap(){
        mNameMap.clear();
        mNameMap.put("P2_DIANYA_A", new Param("A相电压值",P2_DIANYA_A));
        mNameMap.put("P2_DIANYA_B", new Param("B相电压值",P2_DIANYA_B));
        mNameMap.put("P2_DIANYA_C", new Param("C相电压值",P2_DIANYA_C));
        mNameMap.put("P2_DIANLIU_A", new Param("A相电流值",P2_DIANLIU_A));
        mNameMap.put("P2_DIANLIU_B", new Param("B相电流值",P2_DIANLIU_B));
        mNameMap.put("P2_DIANLIU_C", new Param("C相电流值",P2_DIANLIU_C));
        mNameMap.put("P2_REMAIN_DIANLIU", new Param("剩余电流最大相",P2_REMAIN_DIANLIU));
        mNameMap.put("P2_REMAIN_DIANLIU_VALUE", new Param("剩余电流值",P2_REMAIN_DIANLIU_VALUE));
        mNameMap.put("P2_REMAIN_DIANLIU_DONGZUO", new Param("剩余电流动作值",P2_REMAIN_DIANLIU_DONGZUO));
        mNameMap.put("P2_JIXIAN_BUQUDONG_TIME", new Param("极限不驱动时间",P2_JIXIAN_BUQUDONG_TIME));
        mNameMap.put("P2_SANXIANG", new Param("三相电流方向",P2_SANXIANG));
        mNameMap.put("P2_SANXIANG_A", new Param("三相A相电流值",P2_SANXIANG_A));
        mNameMap.put("P2_SANXIANG_B", new Param("三相B相电流值",P2_SANXIANG_B));
        mNameMap.put("P2_SANXIANG_C", new Param("三相C相电流值",P2_SANXIANG_C));
        mNameMap.put("P2_DEVICE_1", new Param("设备状态1",P2_DEVICE_1));
        mNameMap.put("P2_DEVICE_2", new Param("设备状态2",P2_DEVICE_2));

        return mNameMap;
    }

    public String getP2_ID() {
        return P2_ID;
    }

    public void setP2_ID(String p2_ID) {
        P2_ID = p2_ID;
    }

    public String getP2_DIANYA_A() {
        return P2_DIANYA_A;
    }

    public void setP2_DIANYA_A(String p2_DIANYA_A) {
        P2_DIANYA_A = p2_DIANYA_A;
    }

    public String getP2_DIANYA_B() {
        return P2_DIANYA_B;
    }

    public void setP2_DIANYA_B(String p2_DIANYA_B) {
        P2_DIANYA_B = p2_DIANYA_B;
    }

    public String getP2_DIANYA_C() {
        return P2_DIANYA_C;
    }

    public void setP2_DIANYA_C(String p2_DIANYA_C) {
        P2_DIANYA_C = p2_DIANYA_C;
    }

    public String getP2_DIANLIU_A() {
        return P2_DIANLIU_A;
    }

    public void setP2_DIANLIU_A(String p2_DIANLIU_A) {
        P2_DIANLIU_A = p2_DIANLIU_A;
    }

    public String getP2_DIANLIU_B() {
        return P2_DIANLIU_B;
    }

    public void setP2_DIANLIU_B(String p2_DIANLIU_B) {
        P2_DIANLIU_B = p2_DIANLIU_B;
    }

    public String getP2_DIANLIU_C() {
        return P2_DIANLIU_C;
    }

    public void setP2_DIANLIU_C(String p2_DIANLIU_C) {
        P2_DIANLIU_C = p2_DIANLIU_C;
    }

    public String getP2_REMAIN_DIANLIU() {
        return P2_REMAIN_DIANLIU;
    }

    public void setP2_REMAIN_DIANLIU(String p2_REMAIN_DIANLIU) {
        P2_REMAIN_DIANLIU = p2_REMAIN_DIANLIU;
    }

    public String getP2_REMAIN_DIANLIU_VALUE() {
        return P2_REMAIN_DIANLIU_VALUE;
    }

    public void setP2_REMAIN_DIANLIU_VALUE(String p2_REMAIN_DIANLIU_VALUE) {
        P2_REMAIN_DIANLIU_VALUE = p2_REMAIN_DIANLIU_VALUE;
    }

    public String getP2_REMAIN_DIANLIU_DONGZUO() {
        return P2_REMAIN_DIANLIU_DONGZUO;
    }

    public void setP2_REMAIN_DIANLIU_DONGZUO(String p2_REMAIN_DIANLIU_DONGZUO) {
        P2_REMAIN_DIANLIU_DONGZUO = p2_REMAIN_DIANLIU_DONGZUO;
    }

    public String getP2_JIXIAN_BUQUDONG_TIME() {
        return P2_JIXIAN_BUQUDONG_TIME;
    }

    public void setP2_JIXIAN_BUQUDONG_TIME(String p2_JIXIAN_BUQUDONG_TIME) {
        P2_JIXIAN_BUQUDONG_TIME = p2_JIXIAN_BUQUDONG_TIME;
    }

    public String getP2_SANXIANG() {
        return P2_SANXIANG;
    }

    public void setP2_SANXIANG(String p2_SANXIANG) {
        P2_SANXIANG = p2_SANXIANG;
    }

    public String getP2_SANXIANG_A() {
        return P2_SANXIANG_A;
    }

    public void setP2_SANXIANG_A(String p2_SANXIANG_A) {
        P2_SANXIANG_A = p2_SANXIANG_A;
    }

    public String getP2_SANXIANG_B() {
        return P2_SANXIANG_B;
    }

    public void setP2_SANXIANG_B(String p2_SANXIANG_B) {
        P2_SANXIANG_B = p2_SANXIANG_B;
    }

    public String getP2_SANXIANG_C() {
        return P2_SANXIANG_C;
    }

    public void setP2_SANXIANG_C(String p2_SANXIANG_C) {
        P2_SANXIANG_C = p2_SANXIANG_C;
    }

    public String getP2_DEVICE_1() {
        return P2_DEVICE_1;
    }

    public void setP2_DEVICE_1(String p2_DEVICE_1) {
        P2_DEVICE_1 = p2_DEVICE_1;
    }

    public String getP2_DEVICE_2() {
        return P2_DEVICE_2;
    }

    public void setP2_DEVICE_2(String p2_DEVICE_2) {
        P2_DEVICE_2 = p2_DEVICE_2;
    }
}
