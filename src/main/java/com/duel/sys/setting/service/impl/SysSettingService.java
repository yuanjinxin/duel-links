package com.duel.sys.setting.service.impl;

import com.duel.sys.setting.dao.SysSettingDao;
import com.duel.sys.setting.model.vo.SysSettingVo;
import com.duel.sys.setting.service.ISysSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yuanjx
 * @Date: 2022/4/2 14:08
 * @Desc：系统设置
 */
@Service("sysSettingService")
public class SysSettingService implements ISysSettingService {

    @Autowired
    private SysSettingDao sysSettingDao;

    @Override
    public SysSettingVo getSysSettingById(String id) {
        return sysSettingDao.getSysSettingById(id);
    }

}
