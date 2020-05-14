package cn.linkztop.fastbusinesssystem.common.response;

/**
 * 响应代码枚举
 * @author nasico
 */

public enum ResponseEnum {
    SUCCESS(0,"success")
    ;
    private int code;
    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
