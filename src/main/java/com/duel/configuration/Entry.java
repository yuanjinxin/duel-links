package com.duel.configuration;

import com.duel.sys.setting.model.vo.SysSettingVo;
import com.duel.sys.setting.service.ISysSettingService;
import com.duel.sys.util.SysSettingUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@ComponentScan(basePackages = "com.duel.*")
@MapperScan(basePackages = "com.duel.*")
public class Entry {
    public static void main(String[] args) {
        SpringApplication.run(Entry.class, args);
    }
}

/**
 * 系统登录页、首页等controller控制器
 */
@RestController
@RequestMapping("/")
class IndexController{

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private ISysSettingService sysSettingService;

    /**
     * 启动类：加载系统参数
     */
    @Bean
    public ApplicationRunner applicationRunner() {
        return applicationArguments -> {
            logger.info("--- 初始化系统参数开始 ---");
            // 系统启动时获取数据库数据，设置到sysSettingService公用静态集合sysSettingMap
            SysSettingVo sysSettingVo = sysSettingService.getSysSettingById("1");
            SysSettingUtil.setSysSettingMap(sysSettingVo);
            logger.info("--- 初始化系统参数结束 ---");
        };
    }

    /**
     * 跳转登录页面
     */
    @GetMapping("loginPage")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("login");
        //系统信息
        modelAndView.addObject("sys", SysSettingUtil.getSysSetting());
        return modelAndView;
    }

    /**
     * 跳转首页
     */
    @GetMapping("index")
    public ModelAndView index(HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("index");
        //系统信息
        modelAndView.addObject("sys", "测试系统");

        //登录用户
        /*SysUserVo sysUserVo = sysUserService.findByLoginName(SecurityUtil.getLoginUser().getUsername()).getData();
        sysUserVo.setPassword(null);//隐藏部分属性
        modelAndView.addObject( "loginUser", sysUserVo);

        //登录用户系统菜单
        List<SysMenuVo> menuVoList = sysUserMenuService.findByUserId(sysUserVo.getUserId()).getData();
        modelAndView.addObject("menuList",menuVoList);

        //登录用户快捷菜单
        List<SysShortcutMenuVo> shortcutMenuVoList= sysShortcutMenuService.findByUserId(sysUserVo.getUserId()).getData();
        modelAndView.addObject("shortcutMenuList",shortcutMenuVoList);

        //后端公钥
        String publicKey = RsaUtil.getPublicKey();
        modelAndView.addObject("publicKey", publicKey);*/

        return modelAndView;
    }
}
