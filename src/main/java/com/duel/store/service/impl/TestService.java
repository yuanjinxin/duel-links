package com.duel.store.service.impl;

import com.duel.store.model.entity.storedata.StoreMainDataDO;
import com.duel.store.service.IStoreDataService;
import com.duel.util.model.ResultValue;
import org.springframework.stereotype.Service;

@Service("TestService")
public class TestService implements IStoreDataService {
    @Override
    public ResultValue saveStoreData(StoreMainDataDO storeMainDataDO) {
        return null;
    }

    @Override
    public void init(String str) {
        System.out.println("TestService");
    }
}
