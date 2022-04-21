package com.duel.store;

import org.assertj.core.util.Maps;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: yuanjx
 * @Date: 2021/12/21 10:12
 * @description：开发规范
 */
public class standard {



    /**
     * @title：日期时间
     * @type：强制
     * @description：
     * 1.日期格式化时，传入 pattern 中表示年份统一使用小写的 y。
     * yyyy 表示当天所在的年，大写的 YYYY 代表是当天所在的周属于的年份（week in which year）
     * 一周从周日开始，周六结束，只要本周跨年，返回的 YYYY就是下一年
     * 2.
     */
    @Test
    public void dateTimeStandard(){

        Map<String, String> map = new HashMap<>();
        map.put("1", "fa");
        map.remove("2");
        System.out.println(map.get("1"));


    }
}
