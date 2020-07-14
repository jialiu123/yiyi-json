package com.yiyi.parse;

import java.io.Reader;

/**
 * 默认json解释器
 *
 * @author ：liujia
 * @date ：Created in 2020/7/14 14:54
 * @version: 1.0
 */
public class DefaultJsonLexer extends AbstractJsonLexer {


    /**
     * 从Reader中构建
     *
     * @param reader Reader
     */
    public DefaultJsonLexer(Reader reader) {
        super(reader);
    }
}
