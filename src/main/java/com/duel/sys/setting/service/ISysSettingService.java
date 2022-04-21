package com.duel.sys.setting.service;

import com.duel.sys.setting.model.vo.SysSettingVo;

public interface ISysSettingService {

    /**
     * @Desc：根据ID获取系统设置
     * @Author: yuanjx
     * @param : id
     * @Date: 2022/4/2 13:43
     * @return：SysSettingVo
     */
    SysSettingVo getSysSettingById(String id);

}
