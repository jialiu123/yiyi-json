package com.yiyi;

import com.yiyi.exception.JsonException;
import com.yiyi.parse.AbstractJsonLexer;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：liujia
 * @date ：Created in 2020/6/8 10:59
 * @version: 1.0
 */

public abstract class AbstractJson implements Json {

    public static void parse(String jsonString, AbstractJsonLexer jsonLexer) throws JsonException {
        List<Character> charList = jsonString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

//        charList.stream().forEach(item -> {
//            try {
//                jsonLexer.nextToken();
//            } catch (JsonException e) {
//                e.printStackTrace();
//            }
//        });

        for (Character character : charList) {
            jsonLexer.nextToken();
        }

    }

}
