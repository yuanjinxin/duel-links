package com.duel.store.controller;

import com.duel.infrastructure.log.model.annotation.LogUserOperate;
import com.duel.infrastructure.log.model.enums.LogLevelEnum;
import com.duel.infrastructure.log.model.enums.OperateTypeEnum;
import com.duel.store.model.entity.storetype.StroeTypeDO;
import com.duel.util.model.ResultValue;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "商品类型")
@RestController
@RequestMapping("store/storeType")
public class StoreTypeController {

    private static final Logger logger = LoggerFactory.getLogger(StoreTypeController.class);

    @PostMapping("saveStoreType")
    @LogUserOperate(value = "保存商品类型", operateType = OperateTypeEnum.SAVE, logLevel = LogLevelEnum.INFO)
    public ResultValue saveStoreType(@RequestBody StroeTypeDO storeTypeDO){
        logger.debug("[{}] METHOD START", "saveStoreType");
        logger.warn("开始保存商品数据，商品类型名称{0}，商品类型编码{1}。", storeTypeDO.getStoreTypeName(), storeTypeDO.getStoreTypeCode());
        logger.debug("[{}] METHOD END", "saveStoreType");
        return new ResultValue("保存成功");
    }
}
