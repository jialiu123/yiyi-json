package com.yiyi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ：liujia
 * @date ：Created in 2020/6/8 10:39
 * @version: 1.0
 */
public class JsonObject extends AbstractJson {

    private final Map<String, Object> map;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;


    public JsonObject() {
        this(DEFAULT_INITIAL_CAPACITY, false);
    }

    public JsonObject(Map<String, Object> map) {
        if (map == null) {
            throw new IllegalArgumentException("map is null.");
        }
        this.map = map;
    }

    public JsonObject(int defaultInitialCapacity, boolean order) {
        if (order) {
            map = new LinkedHashMap<String, Object>(defaultInitialCapacity);
        } else {
            map = new HashMap<String, Object>(defaultInitialCapacity);
        }
    }


}
