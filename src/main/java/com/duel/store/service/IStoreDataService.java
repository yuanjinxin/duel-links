package com.duel.store.service;

import com.duel.store.model.entity.storedata.StoreMainDataDO;
import com.duel.util.model.ResultValue;

/**
 * @Author: yuanjx
 * @Date: 2021/12/6 9:57
 * @Desc：商品数据操作接口
 */
public interface IStoreDataService {
    /**
     * @Desc：保存商品数据
     * @Author: yuanjx
     * @Date: 2021/12/6 9:56
     * @param：storeMainDataDO 商品数据
     * @return：int
     */
    ResultValue saveStoreData(StoreMainDataDO storeMainDataDO);

    void init(String str);
}
