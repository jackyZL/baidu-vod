package com.zl.constant;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

/**
 * Created by jacky on 2017/2/16.
 * <p/>
 * 业务操作信息类，根据相应的提示key，在messages文件中取得相应的提示语
 * 其中的msgCode会返回给调用端作为结果码
 */
public enum MessageCode {

    SUCCESS("成功", 200, HttpStatus.OK),
    INVALID_PARAM("无效参数", 400, HttpStatus.BAD_REQUEST),
    SERVER_ERROR("服务器内部错误", 500, HttpStatus.INTERNAL_SERVER_ERROR),
    SERVER_BUSY("系统繁忙", 500, HttpStatus.SERVICE_UNAVAILABLE);

    private String msg;

    private int msgCode;

    private HttpStatus httpStatus;

    private MessageCode(String msg, int msgCode, HttpStatus httpStatus) {
        this.msg = msg;
        this.msgCode = msgCode;
        this.httpStatus = httpStatus;
    }

    public String msg() {
        return msg;
    }

    public int msgCode() {
        return msgCode;
    }

    public HttpStatus httpStatus() {
        return httpStatus;
    }

    public String toString() {
        return Integer.valueOf(this.msgCode).toString();
    }

    /**
     * 通过错误信息，获取错误码
     * @param msgKey
     * @return
     */
    public static MessageCode getMessageCode(String msgKey) {
        if (StringUtils.isEmpty(msgKey)) {
            return null;
        }
        for (MessageCode msgCode : MessageCode.values()) {
            if (msgCode.msg().equals(msgKey)) {
                return msgCode;
            }
        }
        return null;
    }
}
