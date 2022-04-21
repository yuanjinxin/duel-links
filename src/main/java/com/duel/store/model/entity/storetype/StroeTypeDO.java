package com.duel.store.model.entity.storetype;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: yuanjx
 * @Date: 2021/11/26 16:02
 * @Desc：商品类型
 */
public class StroeTypeDO {

    //商品类型id
    private String storeTypeId;
    //商品类型编码
    private String storeTypeCode;
    //商品类型名称
    private String storeTypeName;
    //是否内置
    private String isSystem = "FALSE";
    //状态
    private String status;
    //版本
    private long version = 1L;
    //创建时间
    private LocalDateTime createDate = LocalDateTime.now();
    //修改时间
    private LocalDateTime updateDate = LocalDateTime.now();

    public String getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(String storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public String getStoreTypeCode() {
        return storeTypeCode;
    }

    public void setStoreTypeCode(String storeTypeCode) {
        this.storeTypeCode = storeTypeCode;
    }

    public String getStoreTypeName() {
        return storeTypeName;
    }

    public void setStoreTypeName(String storeTypeName) {
        this.storeTypeName = storeTypeName;
    }

    public String getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
