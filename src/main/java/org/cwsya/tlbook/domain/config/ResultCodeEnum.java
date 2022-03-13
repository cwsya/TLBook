package org.cwsya.tlbook.domain.config;

public enum ResultCodeEnum {
    /**
     * 成功
     */
    SUCCESS(100,"成功"),
    USER_ERROR(101,"账号或密码错误");
    private int resultCode;
    private String message;

    ResultCodeEnum(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
