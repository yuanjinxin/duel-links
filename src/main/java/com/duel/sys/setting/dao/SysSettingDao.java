package com.duel.sys.setting.dao;

import com.duel.sys.setting.model.vo.SysSettingVo;
import org.springframework.stereotype.Repository;

@Repository
public interface SysSettingDao {

    // 根据ID获取系统设置
    SysSettingVo getSysSettingById(String id);

}
