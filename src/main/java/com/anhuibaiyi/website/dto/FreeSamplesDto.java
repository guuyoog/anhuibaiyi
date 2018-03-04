package com.anhuibaiyi.website.dto;

import java.io.Serializable;

/**
 * @author guy
 */
public class FreeSamplesDto implements Serializable {
    /**
     *姓名
     */
    private String name;
    /**
     * 公司名称
     */
    private String company;
    /**
     *联系电话
     */
    private String mobile;
    /**
     *联系地址
     */
    private String address;
    /**
     * 样品
     */
    private String sample;
    /**
     * 备注
     */
    private String remark;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return  "姓名:" + name +
                ",公司名称:" + company +
                ", 联系电话:" + mobile +
                ", 联系地址:" + address +
                ", 样品:" + sample +
                ", 备注:" + remark;
    }
}
