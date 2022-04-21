package com.duel.common.model;

import lombok.Data;

import java.util.List;

@Data
public class PageInfo<T> {

    private int page;//当前页码
    private int pageSize;//页面大小
    private String sidx;//排序字段
    private String sord;//排序方式

    private List<T> rows;//分页结果
    private int records;//总记录数
    private int total;//总页数
}
