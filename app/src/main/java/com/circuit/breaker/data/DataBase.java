package com.circuit.breaker.data;

import com.circuit.breaker.bean.Param;
import com.circuit.breaker.bean.Params;
import com.circuit.breaker.bean.Params1;
import com.circuit.breaker.bean.Params2;
import com.circuit.breaker.bean.Params3;

public class DataBase {

    static String [] mDefaultParams1 = new String[]{
            "00000000000011",
            "6C6916C20001",
            "-",
            "0400V",
            "0400A",
            "0400A",
            "10040001",
            "20190720",
            "DL645-2007",
            "A065769",
            "JSRCD-SOFT-A065769-1801-5.00.00",
            "JSRCD-HARD-A065769-1801-3.00.00",
            "300504451222444447794164FFFF",
            "6044444447794164FFFF",
            "2005544447794164FFFF",
            "20S-60S",
            "AC",
            "-"
    };

    static String [] mDefaultParams2 = new String[]{
            "215.0V",
            "000V",
            "000V",
            "0000.0A",
            "0010.0A",
            "0010.0A",
            "00mA",
            "000mA",
            "0300mA",
            "0060mS",
            "00",
            "0000.0A",
            "0010.0A",
            "0010.0A",
            "27",
            "48",
    };

    static String [] mDefaultParams3 = new String[]{
            "000000",
            "0862",
            "0002",
            "0811",
            "0000",
            "0000",
            "0017",
            "0000",
            "0031",
            "0000",
            "0000",
            "0000",
            "0000",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "01",
            "00000005"
    };

    static Params1 createDefaultParams1(){
        Params1 params1 = new Params1();
        params1.setP1_ID(getRandom_ID());
        params1.setP1_ADDRESS(mDefaultParams1[0]);
        params1.setP1_NUMBER(mDefaultParams1[1]);
        params1.setP1_ZICAN_NUMBER(mDefaultParams1[2]);
        params1.setP1_EX_VOL(mDefaultParams1[3]);
        params1.setP1_RATE_DIANLIU(mDefaultParams1[4]);
        params1.setP1_JIAKE_DIANLIU(mDefaultParams1[5]);
        params1.setP1_DEVICE_NUMBER(mDefaultParams1[6]);
        params1.setP1_PRODUCE_TIME(mDefaultParams1[7]);
        params1.setP1_AGREEN_VERSION(mDefaultParams1[8]);
        params1.setP1_FAC_NUMBER(mDefaultParams1[9]);
        params1.setP1_GUJIAN_VERSION(mDefaultParams1[10]);
        params1.setP1_YINGJIAN_VERSION(mDefaultParams1[11]);
        params1.setP1_EX_SHENGYUDIANLIU(mDefaultParams1[12]);
        params1.setP1_EX_JIXIAN(mDefaultParams1[13]);
        params1.setP1_EX_FENDUAN_TIME(mDefaultParams1[14]);
        params1.setP1_ZIDONGCHIONGHE_TIME(mDefaultParams1[15]);
        params1.setP1_TYPE(mDefaultParams1[16]);
        params1.setP1_ANZHUANG(mDefaultParams1[17]);
        return params1;
    }

    static Params2 createDefaultParams2(){
        Params2 params2 = new Params2();
        params2.setP2_ID(getRandom_ID());
        params2.setP2_DIANYA_A(mDefaultParams2[0]);
        params2.setP2_DIANYA_B(mDefaultParams2[1]);
        params2.setP2_DIANYA_C(mDefaultParams2[2]);
        params2.setP2_DIANLIU_A(mDefaultParams2[3]);
        params2.setP2_DIANLIU_B(mDefaultParams2[4]);
        params2.setP2_DIANLIU_C(mDefaultParams2[5]);
        params2.setP2_REMAIN_DIANLIU(mDefaultParams2[6]);
        params2.setP2_REMAIN_DIANLIU_VALUE(mDefaultParams2[7]);
        params2.setP2_REMAIN_DIANLIU_DONGZUO(mDefaultParams2[8]);
        params2.setP2_JIXIAN_BUQUDONG_TIME(mDefaultParams2[9]);
        params2.setP2_SANXIANG(mDefaultParams2[10]);
        params2.setP2_SANXIANG_A(mDefaultParams2[11]);
        params2.setP2_SANXIANG_B(mDefaultParams2[12]);
        params2.setP2_SANXIANG_C(mDefaultParams2[13]);
        params2.setP2_DEVICE_1(mDefaultParams2[14]);
        params2.setP2_DEVICE_2(mDefaultParams2[15]);
        return params2;
    }

    static Params3 createDefaultParams3(){
        Params3 params3 = new Params3();
        params3.setP3_ID(getRandom_ID());
        params3.setP3_DATA_CLEAR_COUNT(mDefaultParams3[0]);
        params3.setP3_ALL_TIAOZHA_COUNT(mDefaultParams3[1]);
        params3.setP3_LOUDIANBISUO_TIAOZHA_COUNT(mDefaultParams3[2]);
        params3.setP3_LOUDIANBAOHU_TIAOZHA_COUNT(mDefaultParams3[3]);
        params3.setP3_GUOZHAI_TIAOZHA_COUNT(mDefaultParams3[4]);
        params3.setP3_GUOYA_TIAOZHA_COUNT(mDefaultParams3[5]);
        params3.setP3_SHOUDONG_TIAOZHA_COUNT(mDefaultParams3[6]);
        params3.setP3_QUELING_TIAOZHA_COUNT(mDefaultParams3[7]);
        params3.setP3_SHIYAN_TIAOZHA_COUNT(mDefaultParams3[8]);
        params3.setP3_DUANLU_TIAOZHA_COUNT(mDefaultParams3[9]);
        params3.setP3_DUANLU_SHUNSHI_COUNT(mDefaultParams3[10]);
        params3.setP3_QIANYA_TIAOZHA_COUNT(mDefaultParams3[11]);
        params3.setP3_QUEXIANG_TIAOZHA_COUNT(mDefaultParams3[12]);
        params3.setP3_EXCEP_INCREATE_COUNT(mDefaultParams3[13]);
        params3.setP3_BAOHU_TOUTUI_COUNT(mDefaultParams3[14]);
        params3.setP3_GAOYASHIFU_COUNT(mDefaultParams3[15]);
        params3.setP3_ZHAWEI_INCREATE_COUNT(mDefaultParams3[16]);
        params3.setP3_ZIJIAN_INCREATE_COUNT(mDefaultParams3[17]);
        params3.setP3_BAOHUSHJIAN_INCREATE_COUNT(mDefaultParams3[18]);
        params3.setP3_TUICHULOUDIANBAOHU_COUNT(mDefaultParams3[19]);
        params3.setP3_SHEBEIYUNXINGSHIJIAN_COUNT(mDefaultParams3[20]);
        return params3;
    }

    //生成一个默认数据
    public static Params createDefaultParams(){
        Params params = new Params();
        params.setParams1(createDefaultParams1());
        params.setParams2(createDefaultParams2());
        params.setParams3(createDefaultParams3());
        return params;
    }

    //生成随机id
    static String getRandom_ID(){
        String strRand="P" ;
        for(int i=0;i<10;i++){
            strRand += String.valueOf((int)(Math.random() * 10)) ;
        }
        return strRand;
    }
}
