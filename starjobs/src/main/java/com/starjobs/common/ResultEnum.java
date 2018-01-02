package com.starjobs.common;

public enum ResultEnum {
	UNKNOW_ERROR(-100, "系统异常,请联系管理员"),

    FAILURE(-101, "失败"),

    DUPLICATEKEY(-102, "该记录已存在"),

    PARAMS_ERROR(-103, "参数错误"),
    ;
	
	private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
