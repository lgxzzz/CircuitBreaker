package com.circuit.breaker.bean;

import java.io.Serializable;
import java.util.LinkedHashMap;

public class Params3 implements Serializable {
    String P3_ID;
    String P3_DATA_CLEAR_COUNT;
    String P3_ALL_TIAOZHA_COUNT;
    String P3_LOUDIANBISUO_TIAOZHA_COUNT;
    String P3_LOUDIANBAOHU_TIAOZHA_COUNT;
    String P3_GUOZHAI_TIAOZHA_COUNT;
    String P3_GUOYA_TIAOZHA_COUNT;
    String P3_SHOUDONG_TIAOZHA_COUNT;
    String P3_QUELING_TIAOZHA_COUNT;
    String P3_SHIYAN_TIAOZHA_COUNT;
    String P3_DUANLU_TIAOZHA_COUNT;
    String P3_DUANLU_SHUNSHI_COUNT;
    String P3_QIANYA_TIAOZHA_COUNT;
    String P3_QUEXIANG_TIAOZHA_COUNT;
    String P3_EXCEP_INCREATE_COUNT;
    String P3_BAOHU_TOUTUI_COUNT;
    String P3_GAOYASHIFU_COUNT;
    String P3_ZHAWEI_INCREATE_COUNT;
    String P3_ZIJIAN_INCREATE_COUNT;
    String P3_BAOHUSHJIAN_INCREATE_COUNT;
    String P3_TUICHULOUDIANBAOHU_COUNT;
    String P3_SHEBEIYUNXINGSHIJIAN_COUNT;

    LinkedHashMap<String,Param> mNameMap = new LinkedHashMap<>();

    public LinkedHashMap<String,Param> getNameMap(){
        mNameMap.clear();
        mNameMap.put("P3_DATA_CLEAR_COUNT", new Param("数据清零总次数",P3_DATA_CLEAR_COUNT));
        mNameMap.put("P3_ALL_TIAOZHA_COUNT", new Param("总跳闸次数",P3_ALL_TIAOZHA_COUNT));
        mNameMap.put("P3_LOUDIANBISUO_TIAOZHA_COUNT", new Param("漏电闭锁跳闸次数",P3_LOUDIANBISUO_TIAOZHA_COUNT));
        mNameMap.put("P3_LOUDIANBAOHU_TIAOZHA_COUNT", new Param("漏电保护跳闸次数",P3_LOUDIANBAOHU_TIAOZHA_COUNT));
        mNameMap.put("P3_GUOZHAI_TIAOZHA_COUNT", new Param("过载跳闸次数",P3_GUOZHAI_TIAOZHA_COUNT));
        mNameMap.put("P3_GUOYA_TIAOZHA_COUNT", new Param("过压跳闸次数",P3_GUOYA_TIAOZHA_COUNT));
        mNameMap.put("P3_SHOUDONG_TIAOZHA_COUNT", new Param("手动跳闸次数",P3_SHOUDONG_TIAOZHA_COUNT));
        mNameMap.put("P3_QUELING_TIAOZHA_COUNT", new Param("缺零跳闸次数",P3_QUELING_TIAOZHA_COUNT));
        mNameMap.put("P3_SHIYAN_TIAOZHA_COUNT", new Param("实验跳闸次数",P3_SHIYAN_TIAOZHA_COUNT));
        mNameMap.put("P3_DUANLU_TIAOZHA_COUNT", new Param("短路延时跳闸次数",P3_DUANLU_TIAOZHA_COUNT));
        mNameMap.put("P3_DUANLU_SHUNSHI_COUNT", new Param("短路瞬时次数",P3_DUANLU_SHUNSHI_COUNT));
        mNameMap.put("P3_QIANYA_TIAOZHA_COUNT", new Param("欠压跳闸次数",P3_QIANYA_TIAOZHA_COUNT));
        mNameMap.put("P3_QUEXIANG_TIAOZHA_COUNT", new Param("缺相跳闸次数",P3_QUEXIANG_TIAOZHA_COUNT));
        mNameMap.put("P3_EXCEP_INCREATE_COUNT", new Param("异常告警新增次数",P3_EXCEP_INCREATE_COUNT));
        mNameMap.put("P3_BAOHU_TOUTUI_COUNT", new Param("保护功能投退次数",P3_BAOHU_TOUTUI_COUNT));
        mNameMap.put("P3_GAOYASHIFU_COUNT", new Param("高压失复电次数",P3_GAOYASHIFU_COUNT));
        mNameMap.put("P3_ZHAWEI_INCREATE_COUNT", new Param("闸位变化新增次数",P3_ZHAWEI_INCREATE_COUNT));
        mNameMap.put("P3_ZIJIAN_INCREATE_COUNT", new Param("自检保护新增次数",P3_ZIJIAN_INCREATE_COUNT));
        mNameMap.put("P3_BAOHUSHJIAN_INCREATE_COUNT", new Param("保护时间新增次数",P3_BAOHUSHJIAN_INCREATE_COUNT));
        mNameMap.put("P3_TUICHULOUDIANBAOHU_COUNT", new Param("退出漏电保护次数",P3_TUICHULOUDIANBAOHU_COUNT));
        mNameMap.put("P3_SHEBEIYUNXINGSHIJIAN_COUNT", new Param("设备运行时间累计",P3_SHEBEIYUNXINGSHIJIAN_COUNT));

        return mNameMap;
    }

    public String getP3_ID() {
        return P3_ID;
    }

    public void setP3_ID(String p3_ID) {
        P3_ID = p3_ID;
    }

    public String getP3_DATA_CLEAR_COUNT() {
        return P3_DATA_CLEAR_COUNT;
    }

    public void setP3_DATA_CLEAR_COUNT(String p3_DATA_CLEAR_COUNT) {
        P3_DATA_CLEAR_COUNT = p3_DATA_CLEAR_COUNT;
    }

    public String getP3_ALL_TIAOZHA_COUNT() {
        return P3_ALL_TIAOZHA_COUNT;
    }

    public void setP3_ALL_TIAOZHA_COUNT(String p3_ALL_TIAOZHA_COUNT) {
        P3_ALL_TIAOZHA_COUNT = p3_ALL_TIAOZHA_COUNT;
    }

    public String getP3_LOUDIANBISUO_TIAOZHA_COUNT() {
        return P3_LOUDIANBISUO_TIAOZHA_COUNT;
    }

    public void setP3_LOUDIANBISUO_TIAOZHA_COUNT(String p3_LOUDIANBISUO_TIAOZHA_COUNT) {
        P3_LOUDIANBISUO_TIAOZHA_COUNT = p3_LOUDIANBISUO_TIAOZHA_COUNT;
    }

    public String getP3_LOUDIANBAOHU_TIAOZHA_COUNT() {
        return P3_LOUDIANBAOHU_TIAOZHA_COUNT;
    }

    public void setP3_LOUDIANBAOHU_TIAOZHA_COUNT(String p3_LOUDIANBAOHU_TIAOZHA_COUNT) {
        P3_LOUDIANBAOHU_TIAOZHA_COUNT = p3_LOUDIANBAOHU_TIAOZHA_COUNT;
    }

    public String getP3_GUOZHAI_TIAOZHA_COUNT() {
        return P3_GUOZHAI_TIAOZHA_COUNT;
    }

    public void setP3_GUOZHAI_TIAOZHA_COUNT(String p3_GUOZHAI_TIAOZHA_COUNT) {
        P3_GUOZHAI_TIAOZHA_COUNT = p3_GUOZHAI_TIAOZHA_COUNT;
    }

    public String getP3_GUOYA_TIAOZHA_COUNT() {
        return P3_GUOYA_TIAOZHA_COUNT;
    }

    public void setP3_GUOYA_TIAOZHA_COUNT(String p3_GUOYA_TIAOZHA_COUNT) {
        P3_GUOYA_TIAOZHA_COUNT = p3_GUOYA_TIAOZHA_COUNT;
    }

    public String getP3_SHOUDONG_TIAOZHA_COUNT() {
        return P3_SHOUDONG_TIAOZHA_COUNT;
    }

    public void setP3_SHOUDONG_TIAOZHA_COUNT(String p3_SHOUDONG_TIAOZHA_COUNT) {
        P3_SHOUDONG_TIAOZHA_COUNT = p3_SHOUDONG_TIAOZHA_COUNT;
    }

    public String getP3_QUELING_TIAOZHA_COUNT() {
        return P3_QUELING_TIAOZHA_COUNT;
    }

    public void setP3_QUELING_TIAOZHA_COUNT(String p3_QUELING_TIAOZHA_COUNT) {
        P3_QUELING_TIAOZHA_COUNT = p3_QUELING_TIAOZHA_COUNT;
    }

    public String getP3_SHIYAN_TIAOZHA_COUNT() {
        return P3_SHIYAN_TIAOZHA_COUNT;
    }

    public void setP3_SHIYAN_TIAOZHA_COUNT(String p3_SHIYAN_TIAOZHA_COUNT) {
        P3_SHIYAN_TIAOZHA_COUNT = p3_SHIYAN_TIAOZHA_COUNT;
    }

    public String getP3_DUANLU_TIAOZHA_COUNT() {
        return P3_DUANLU_TIAOZHA_COUNT;
    }

    public void setP3_DUANLU_TIAOZHA_COUNT(String p3_DUANLU_TIAOZHA_COUNT) {
        P3_DUANLU_TIAOZHA_COUNT = p3_DUANLU_TIAOZHA_COUNT;
    }

    public String getP3_DUANLU_SHUNSHI_COUNT() {
        return P3_DUANLU_SHUNSHI_COUNT;
    }

    public void setP3_DUANLU_SHUNSHI_COUNT(String p3_DUANLU_SHUNSHI_COUNT) {
        P3_DUANLU_SHUNSHI_COUNT = p3_DUANLU_SHUNSHI_COUNT;
    }

    public String getP3_QIANYA_TIAOZHA_COUNT() {
        return P3_QIANYA_TIAOZHA_COUNT;
    }

    public void setP3_QIANYA_TIAOZHA_COUNT(String p3_QIANYA_TIAOZHA_COUNT) {
        P3_QIANYA_TIAOZHA_COUNT = p3_QIANYA_TIAOZHA_COUNT;
    }

    public String getP3_QUEXIANG_TIAOZHA_COUNT() {
        return P3_QUEXIANG_TIAOZHA_COUNT;
    }

    public void setP3_QUEXIANG_TIAOZHA_COUNT(String p3_QUEXIANG_TIAOZHA_COUNT) {
        P3_QUEXIANG_TIAOZHA_COUNT = p3_QUEXIANG_TIAOZHA_COUNT;
    }

    public String getP3_EXCEP_INCREATE_COUNT() {
        return P3_EXCEP_INCREATE_COUNT;
    }

    public void setP3_EXCEP_INCREATE_COUNT(String p3_EXCEP_INCREATE_COUNT) {
        P3_EXCEP_INCREATE_COUNT = p3_EXCEP_INCREATE_COUNT;
    }

    public String getP3_BAOHU_TOUTUI_COUNT() {
        return P3_BAOHU_TOUTUI_COUNT;
    }

    public void setP3_BAOHU_TOUTUI_COUNT(String p3_BAOHU_TOUTUI_COUNT) {
        P3_BAOHU_TOUTUI_COUNT = p3_BAOHU_TOUTUI_COUNT;
    }

    public String getP3_GAOYASHIFU_COUNT() {
        return P3_GAOYASHIFU_COUNT;
    }

    public void setP3_GAOYASHIFU_COUNT(String p3_GAOYASHIFU_COUNT) {
        P3_GAOYASHIFU_COUNT = p3_GAOYASHIFU_COUNT;
    }

    public String getP3_ZHAWEI_INCREATE_COUNT() {
        return P3_ZHAWEI_INCREATE_COUNT;
    }

    public void setP3_ZHAWEI_INCREATE_COUNT(String p3_ZHAWEI_INCREATE_COUNT) {
        P3_ZHAWEI_INCREATE_COUNT = p3_ZHAWEI_INCREATE_COUNT;
    }

    public String getP3_ZIJIAN_INCREATE_COUNT() {
        return P3_ZIJIAN_INCREATE_COUNT;
    }

    public void setP3_ZIJIAN_INCREATE_COUNT(String p3_ZIJIAN_INCREATE_COUNT) {
        P3_ZIJIAN_INCREATE_COUNT = p3_ZIJIAN_INCREATE_COUNT;
    }

    public String getP3_BAOHUSHJIAN_INCREATE_COUNT() {
        return P3_BAOHUSHJIAN_INCREATE_COUNT;
    }

    public void setP3_BAOHUSHJIAN_INCREATE_COUNT(String p3_BAOHUSHJIAN_INCREATE_COUNT) {
        P3_BAOHUSHJIAN_INCREATE_COUNT = p3_BAOHUSHJIAN_INCREATE_COUNT;
    }

    public String getP3_TUICHULOUDIANBAOHU_COUNT() {
        return P3_TUICHULOUDIANBAOHU_COUNT;
    }

    public void setP3_TUICHULOUDIANBAOHU_COUNT(String p3_TUICHULOUDIANBAOHU_COUNT) {
        P3_TUICHULOUDIANBAOHU_COUNT = p3_TUICHULOUDIANBAOHU_COUNT;
    }

    public String getP3_SHEBEIYUNXINGSHIJIAN_COUNT() {
        return P3_SHEBEIYUNXINGSHIJIAN_COUNT;
    }

    public void setP3_SHEBEIYUNXINGSHIJIAN_COUNT(String p3_SHEBEIYUNXINGSHIJIAN_COUNT) {
        P3_SHEBEIYUNXINGSHIJIAN_COUNT = p3_SHEBEIYUNXINGSHIJIAN_COUNT;
    }
}
