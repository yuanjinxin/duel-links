package com.duel.infrastructure.log.model.annotation;

import com.duel.infrastructure.log.model.enums.LogLevelEnum;
import com.duel.infrastructure.log.model.enums.OperateTypeEnum;

public @interface LogUserOperate {

    String value();

    OperateTypeEnum operateType() default OperateTypeEnum.UNKNOWN;

    LogLevelEnum logLevel() default LogLevelEnum.UNSPECIFIED;

}
