package com.cj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName StartController
 * @Description TODO
 * @Author ChownWang
 * @Date 2020/7/10 9:20
 * @Version 1.0lok, .
 */
@Controller
public class StartController {

    @RequestMapping("/")
    public String startIndex() {

        return "starter";
    }
    /* @RequestMapping("log/log_list")
    public String doLogUI_logList() {
        return "sys/log_list";
    }
    @RequestMapping("menu/menu_list")
    public String doLoadUI_menuList(){
        return "sys/menu_list";
    } */

    @RequestMapping("{module}/{moduleUI}")
    public String doLoadUI(@PathVariable(value = "moduleUI") String url, @PathVariable("module") String module) {
        return "sys/" + url;
    }

    @RequestMapping("doPageUI")
    public String doPageUI() {
        return "common/page";
    }


}
