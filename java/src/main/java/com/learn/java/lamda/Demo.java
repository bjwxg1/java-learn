package com.learn.java.lamda;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wuxiaoguang
 * @description
 * @date
 */
public class Demo {
    public static void main(String[] args) {
        List<String> strings = Lists.newArrayList();
        strings.add("java");
        strings.add("c++");

        long a = strings.stream().filter(s -> s.endsWith("a")).count();
        System.out.println(a);
    }
}
