package com.zl.common.exception;

import com.zl.constant.MessageCode;

/**
 * 业务相关异常
 * <p/>
 * Created by jacky on 2017/2/16.
 */
public class BusinessException extends Exception {

    private String message;

    private MessageCode msgCode;

    public BusinessException(MessageCode msgCode, Object... args) {
        this.msgCode = msgCode;
        this.message = String.format(msgCode.msg(), args);
    }

    public String getMessage() {
        return this.message;
    }

    public MessageCode getMessageCode() {
        return this.msgCode;
    }
}
