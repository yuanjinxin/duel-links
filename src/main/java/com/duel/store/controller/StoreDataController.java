package com.duel.store.controller;

import com.duel.infrastructure.log.model.annotation.LogUserOperate;
import com.duel.infrastructure.log.model.enums.LogLevelEnum;
import com.duel.infrastructure.log.model.enums.OperateTypeEnum;
import com.duel.store.model.entity.storedata.StoreMainDataDO;
import com.duel.store.service.IStoreDataService;
import com.duel.util.model.ResultValue;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "商品数据")
@RestController
@RequestMapping("store/storedata")
public class StoreDataController {

    private static final Logger logger = LoggerFactory.getLogger(StoreDataController.class);

    @Autowired
    private IStoreDataService storeDataService;

    @PostMapping("saveStoreData")
    @LogUserOperate(value = "保存商品数据", operateType = OperateTypeEnum.SAVE, logLevel = LogLevelEnum.INFO)
    public ResultValue saveStoreData(@RequestBody StoreMainDataDO storeMainDataDO){
        logger.debug("[{}] METHOD START", "saveStoreData");
        logger.warn("开始保存商品数据，商品名称{0}，商品编码{1}。", storeMainDataDO.getStoreName(), storeMainDataDO.getStoreName());
        logger.debug("[{}] METHOD END", "saveStoreData");
        return new ResultValue("保存成功");
    }

    @GetMapping("removeStore")
    @LogUserOperate(value = "删除商品数据", operateType = OperateTypeEnum.DELETE, logLevel = LogLevelEnum.INFO)
    public ResultValue removeStore(@RequestParam String storeId){
        logger.debug("[{}] METHOD START", "removeStore");
        logger.warn("开始删除商品数据，商品ID{0}。", storeId);
        logger.debug("[{}] METHOD END", "removeStore");
        return new ResultValue("删除成功");
    }
}
