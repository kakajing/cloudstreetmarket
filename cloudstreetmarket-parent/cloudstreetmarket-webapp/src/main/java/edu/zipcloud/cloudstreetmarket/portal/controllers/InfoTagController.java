package edu.zipcloud.cloudstreetmarket.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

/**
 * Author 卡卡
 * Created by jing on 2017/7/29.
 */
@Controller
@RequestMapping("/info")
public class InfoTagController extends CloudstreetWebAppWCI {

    @Autowired
    private WebApplicationContext webAppContext;

    private final static LocalDateTime startDateTime = LocalDateTime.now();
    private final static DateTimeFormatter DT_FORMATTER = DateTimeFormatter.ofPattern("EEE, d MMM yyy h:mm a");

    @RequestMapping("/server")
    @ResponseBody
    public String infoTagServer() {
        return new StringJoiner("<br>")
                .add("-------------------------------------")
                .add(" Server: " + webAppContext.getServletContext().getServerInfo())
                .add(" Start date: " + startDateTime.format(DT_FORMATTER))
                .add(" Version: " + webAppContext.getBean("webAppVersion"))
                .add("--------------------------------------")
                .toString();
    }

    @RequestMapping("/helloHandler")
    @ResponseBody
    public String helloController() {
        return "hello";
    }
}
