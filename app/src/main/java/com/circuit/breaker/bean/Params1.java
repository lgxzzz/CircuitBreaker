package com.circuit.breaker.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Params1 implements Serializable {
    String P1_ID;
    String P1_ADDRESS;
    String P1_NUMBER;
    String P1_ZICAN_NUMBER;
    String P1_EX_VOL;
    String P1_RATE_DIANLIU;
    String P1_JIAKE_DIANLIU;
    String P1_DEVICE_NUMBER;
    String P1_PRODUCE_TIME;
    String P1_AGREEN_VERSION;
    String P1_FAC_NUMBER;
    String P1_GUJIAN_VERSION;
    String P1_YINGJIAN_VERSION;
    String P1_EX_SHENGYUDIANLIU;
    String P1_EX_JIXIAN;
    String P1_EX_FENDUAN_TIME;
    String P1_ZIDONGCHIONGHE_TIME;
    String P1_TYPE;
    String P1_ANZHUANG;

    LinkedHashMap<String,Param> mNameMap = new LinkedHashMap<>();

    public LinkedHashMap<String,Param> getNameMap(){
        mNameMap.clear();
        mNameMap.put("P1_ADDRESS", new Param("通信地址",P1_ADDRESS));
        mNameMap.put("P1_NUMBER", new Param("设备号",P1_NUMBER));
        mNameMap.put("P1_ZICAN_NUMBER", new Param("资产管理编码",P1_ZICAN_NUMBER));
        mNameMap.put("P1_EX_VOL", new Param("额外电压",P1_EX_VOL));
        mNameMap.put("P1_RATE_DIANLIU", new Param("额定电流",P1_RATE_DIANLIU));
        mNameMap.put("P1_JIAKE_DIANLIU", new Param("壳架电流",P1_JIAKE_DIANLIU));
        mNameMap.put("P1_DEVICE_NUMBER", new Param("设备型号",P1_DEVICE_NUMBER));
        mNameMap.put("P1_PRODUCE_TIME", new Param("生产日期",P1_PRODUCE_TIME));
        mNameMap.put("P1_AGREEN_VERSION", new Param("协议版本号",P1_AGREEN_VERSION));
        mNameMap.put("P1_FAC_NUMBER", new Param("厂家工厂号码",P1_FAC_NUMBER));
        mNameMap.put("P1_GUJIAN_VERSION", new Param("固件版本号",P1_GUJIAN_VERSION));
        mNameMap.put("P1_YINGJIAN_VERSION", new Param("硬件版本号",P1_YINGJIAN_VERSION));
        mNameMap.put("P1_EX_SHENGYUDIANLIU", new Param("额定剩余电流动作值",P1_EX_SHENGYUDIANLIU));
        mNameMap.put("P1_EX_JIXIAN", new Param("额定极限不限定值",P1_EX_JIXIAN));
        mNameMap.put("P1_EX_FENDUAN_TIME", new Param("额定分段时间",P1_EX_FENDUAN_TIME));
        mNameMap.put("P1_ZIDONGCHIONGHE_TIME", new Param("自动重合闸时间范围",P1_ZIDONGCHIONGHE_TIME));
        mNameMap.put("P1_TYPE", new Param("使用类别",P1_TYPE));
        mNameMap.put("P1_ANZHUANG", new Param("安装相别",P1_ANZHUANG));

        return mNameMap;
    }

    public String getP1_ID() {
        return P1_ID;
    }

    public void setP1_ID(String p1_ID) {
        P1_ID = p1_ID;
    }

    public String getP1_ADDRESS() {
        return P1_ADDRESS;
    }

    public void setP1_ADDRESS(String p1_ADDRESS) {
        P1_ADDRESS = p1_ADDRESS;
    }

    public String getP1_NUMBER() {
        return P1_NUMBER;
    }

    public void setP1_NUMBER(String p1_NUMBER) {
        P1_NUMBER = p1_NUMBER;
    }

    public String getP1_ZICAN_NUMBER() {
        return P1_ZICAN_NUMBER;
    }

    public void setP1_ZICAN_NUMBER(String p1_ZICAN_NUMBER) {
        P1_ZICAN_NUMBER = p1_ZICAN_NUMBER;
    }

    public String getP1_EX_VOL() {
        return P1_EX_VOL;
    }

    public void setP1_EX_VOL(String p1_EX_VOL) {
        P1_EX_VOL = p1_EX_VOL;
    }

    public String getP1_RATE_DIANLIU() {
        return P1_RATE_DIANLIU;
    }

    public void setP1_RATE_DIANLIU(String p1_RATE_DIANLIU) {
        P1_RATE_DIANLIU = p1_RATE_DIANLIU;
    }

    public String getP1_JIAKE_DIANLIU() {
        return P1_JIAKE_DIANLIU;
    }

    public void setP1_JIAKE_DIANLIU(String p1_JIAKE_DIANLIU) {
        P1_JIAKE_DIANLIU = p1_JIAKE_DIANLIU;
    }

    public String getP1_DEVICE_NUMBER() {
        return P1_DEVICE_NUMBER;
    }

    public void setP1_DEVICE_NUMBER(String p1_DEVICE_NUMBER) {
        P1_DEVICE_NUMBER = p1_DEVICE_NUMBER;
    }

    public String getP1_PRODUCE_TIME() {
        return P1_PRODUCE_TIME;
    }

    public void setP1_PRODUCE_TIME(String p1_PRODUCE_TIME) {
        P1_PRODUCE_TIME = p1_PRODUCE_TIME;
    }

    public String getP1_AGREEN_VERSION() {
        return P1_AGREEN_VERSION;
    }

    public void setP1_AGREEN_VERSION(String p1_AGREEN_VERSION) {
        P1_AGREEN_VERSION = p1_AGREEN_VERSION;
    }

    public String getP1_FAC_NUMBER() {
        return P1_FAC_NUMBER;
    }

    public void setP1_FAC_NUMBER(String p1_FAC_NUMBER) {
        P1_FAC_NUMBER = p1_FAC_NUMBER;
    }

    public String getP1_GUJIAN_VERSION() {
        return P1_GUJIAN_VERSION;
    }

    public void setP1_GUJIAN_VERSION(String p1_GUJIAN_VERSION) {
        P1_GUJIAN_VERSION = p1_GUJIAN_VERSION;
    }

    public String getP1_YINGJIAN_VERSION() {
        return P1_YINGJIAN_VERSION;
    }

    public void setP1_YINGJIAN_VERSION(String p1_YINGJIAN_VERSION) {
        P1_YINGJIAN_VERSION = p1_YINGJIAN_VERSION;
    }

    public String getP1_EX_SHENGYUDIANLIU() {
        return P1_EX_SHENGYUDIANLIU;
    }

    public void setP1_EX_SHENGYUDIANLIU(String p1_EX_SHENGYUDIANLIU) {
        P1_EX_SHENGYUDIANLIU = p1_EX_SHENGYUDIANLIU;
    }

    public String getP1_EX_JIXIAN() {
        return P1_EX_JIXIAN;
    }

    public void setP1_EX_JIXIAN(String p1_EX_JIXIAN) {
        P1_EX_JIXIAN = p1_EX_JIXIAN;
    }

    public String getP1_EX_FENDUAN_TIME() {
        return P1_EX_FENDUAN_TIME;
    }

    public void setP1_EX_FENDUAN_TIME(String p1_EX_FENDUAN_TIME) {
        P1_EX_FENDUAN_TIME = p1_EX_FENDUAN_TIME;
    }

    public String getP1_ZIDONGCHIONGHE_TIME() {
        return P1_ZIDONGCHIONGHE_TIME;
    }

    public void setP1_ZIDONGCHIONGHE_TIME(String p1_ZIDONGCHIONGHE_TIME) {
        P1_ZIDONGCHIONGHE_TIME = p1_ZIDONGCHIONGHE_TIME;
    }

    public String getP1_TYPE() {
        return P1_TYPE;
    }

    public void setP1_TYPE(String p1_TYPE) {
        P1_TYPE = p1_TYPE;
    }

    public String getP1_ANZHUANG() {
        return P1_ANZHUANG;
    }

    public void setP1_ANZHUANG(String p1_ANZHUANG) {
        P1_ANZHUANG = p1_ANZHUANG;
    }
}
