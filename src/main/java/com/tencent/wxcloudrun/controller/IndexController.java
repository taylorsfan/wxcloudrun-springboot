package com.tencent.wxcloudrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

/**
 * index控制器
 */
@Controller
@Slf4j
public class IndexController {

    /**
     * 主页页面
     *
     * @return API response html
     */
    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/validate")
    @ResponseBody
    public String validate(String signature, String timestamp, String nonce, String echostr) {
        log.info("signature={},timestamp={},nonce={},echostr={}", signature, timestamp, nonce, echostr);
        return echostr;
    }

}
