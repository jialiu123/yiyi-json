package com.yiyi.parse;

import com.yiyi.exception.JsonException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 抽象类,方便后期扩展所用
 *
 * @author ：liujia
 * @date ：Created in 2020/7/14 14:56
 * @version: 1.0
 */
public abstract class AbstractJsonLexer implements JsonLexer {

    /*

     */
    protected int token;

    /**
     * 用于记录位置信息
     */
    protected int pos;

    /**
     * 用于记录是否到最后了
     */
    protected boolean eof;

    /**
     * 源
     */
    private Reader reader;

    /**
     * 从Reader中构建
     *
     * @param reader Reader
     */
    public AbstractJsonLexer(Reader reader) {
        this.reader = reader.markSupported() ? reader : new BufferedReader(reader);
    }

    @Override
    public int token() {
        return token;
    }

    @Override
    public void nextToken() throws JsonException {
        try {
            token = this.reader.read();
            pos++;
            System.out.println(token);
        } catch (IOException exception) {
            throw new JsonException(exception);
        }
        if (token <= 0) { // End of stream
            this.eof = true;
            token = 0;
        }

    }
}
