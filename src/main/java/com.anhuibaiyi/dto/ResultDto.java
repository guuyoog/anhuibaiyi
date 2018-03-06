package com.anhuibaiyi.dto;

import java.io.Serializable;

public class ResultDto implements Serializable {

    private int resultCode;
    private String resultMsg;
    private Object resultData;

    public ResultDto(){
        resultCode = ResultCode.ERROR_CODE;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

}
