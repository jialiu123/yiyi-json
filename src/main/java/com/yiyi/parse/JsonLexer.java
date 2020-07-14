package com.yiyi.parse;

import com.yiyi.exception.JsonException;

import java.io.IOException;

/**
 * json 解释器
 *
 * @author ：liujia
 * @date ：Created in 2020/7/14 14:53
 * @version: 1.0
 */
public interface JsonLexer {


    /**
     * 当前token
     *
     * @return
     */
    int token();

    /**
     * 下一个token位置
     */
    void nextToken() throws IOException, JsonException;


}
