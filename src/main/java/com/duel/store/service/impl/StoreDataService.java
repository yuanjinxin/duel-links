package com.duel.store.service.impl;

import com.duel.store.dao.StoreDataDao;
import com.duel.store.model.entity.storedata.StoreMainDataDO;
import com.duel.store.service.IStoreDataService;
import com.duel.util.model.ResultValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("storeDataService")
public class StoreDataService implements IStoreDataService {

    private static final Logger logger = LoggerFactory.getLogger(StoreDataService.class);

    @Autowired
    StoreDataDao storeDataDao;

    @Override
    public ResultValue saveStoreData(StoreMainDataDO storeMainDataDO) {
        logger.info(storeMainDataDO.getStoreCode());

        return null;
    }

    @Override
    public void init(String str) {
        System.out.println("StoreDataService");
    }
}
