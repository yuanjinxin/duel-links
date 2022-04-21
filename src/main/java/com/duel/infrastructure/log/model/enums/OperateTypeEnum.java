package com.duel.infrastructure.log.model.enums;

public enum OperateTypeEnum {
    INSERT("新增"),
    UPDATE("修改"),
    SAVE("保存"),
    DELETE("删除"),
    SELECT("查询"),
    UNKNOWN("未知");

    private String title;

    private OperateTypeEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
