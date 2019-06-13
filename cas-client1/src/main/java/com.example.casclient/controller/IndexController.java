package com.example.casclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(ModelMap map) {
        map.addAttribute("name", "clien B");
        return "index";
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    /**
     * 退出
     * @param session
     * @return
     */
    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();//销毁session
        //使用cas退出成功后,跳转到http://cas.client1.com:9001/logout/success
        return "redirect:https://cas.server.com:8443/cas/logout?service=http://cas.client1.com:8088/logout/success";
    }

    /**
     * 退出成功页
     * @param session
     * @return
     */
    @RequestMapping("logout/success")
    public String logoutsuccess(HttpSession session) {
        return "logoutsuccess";
    }

}
