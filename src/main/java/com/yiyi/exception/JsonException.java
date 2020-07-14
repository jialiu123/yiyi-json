package com.yiyi.exception;

/**
 * @author ：liujia
 * @date ：Created in 2020/7/14 15:32
 * @description：TODO
 * @version: 1.0
 */
public class JsonException extends Exception {


    public JsonException(Throwable e) {
        super(e);
    }

    public JsonException(String message) {
        super(message);
    }

//    public JsonException(String messageTemplate, Object... params) {
//        super(StrUtil.format(messageTemplate, params));
//    }

    public JsonException(String message, Throwable cause) {
        super(message, cause);
    }

//    public JsonException(Throwable throwable, String messageTemplate, Object... params) {
//        super(StrUtil.format(messageTemplate, params), throwable);
//    }
}
