package com.duel.store.model.entity.storedata;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: yuanjx
 * @Date: 2021/11/26 16:01
 * @Desc：商品主表
 */
public class StoreMainDataDO {

    //主表id
    private String storeMainId;
    //商品类型id
    private String storeTypeId;
    //商品编码
    private String storeCode;
    //商品名称
    private String storeName;
    //说明
    private String description;
    //创建人
    private String creatorId;
    //数量
    private int quantity;
    //单位
    private String unit;
    //单价
    private BigDecimal unitPrice;
    //状态
    private String status;
    //版本
    private long version = 1L;
    //创建时间
    private LocalDateTime createDate = LocalDateTime.now();
    //修改时间
    private LocalDateTime updateDate = LocalDateTime.now();

    public String getStoreMainId() {
        return storeMainId;
    }

    public void setStoreMainId(String storeMainId) {
        this.storeMainId = storeMainId;
    }

    public String getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(String storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
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
