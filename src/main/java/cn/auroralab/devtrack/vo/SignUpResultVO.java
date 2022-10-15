package cn.auroralab.devtrack.vo;

import lombok.Data;

@Data
public class SignUpResultVO {
    public static SignUpResultVO SUCCESS = new SignUpResultVO(0);
    public static SignUpResultVO USER_EXISTS = new SignUpResultVO(1);
    public static SignUpResultVO UNABLE_TO_CREATE_UUID = new SignUpResultVO(2);
    public static SignUpResultVO VERIFICATION_CODE_ERROR = new SignUpResultVO(3);
    public static SignUpResultVO UNKNOWN_ERROR = new SignUpResultVO(4);

    private final int statusCode;

    private SignUpResultVO(int statusCode) { this.statusCode = statusCode; }
}
