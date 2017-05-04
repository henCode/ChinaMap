package com.example.nemo.mapdemo.map;

/**
 * Description: 演示数据结构
 * @author nemo
 * @version 2.0
 * @since 2016/4/15
 */
public class ProvinceData implements IProvinceData {
    /**
     * 省份Id
     */
    private int provinceId;

    /**
     * 省份名称
     */
    private String provinceName;

    /**
     * 该省内人数
     */
    private int number;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getPersonNumber() {
        return number;
    }

    @Override
    public int getProvinceCode() {
        return provinceId;
    }
}