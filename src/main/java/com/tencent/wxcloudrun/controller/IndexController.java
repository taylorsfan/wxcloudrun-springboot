package com.tencent.wxcloudrun.controller;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;

/**
 * index控制器
 */
@Controller
@Slf4j
public class IndexController {
    private static final OkHttpClient okHttpClient = new Builder().callTimeout(60, TimeUnit.SECONDS).build();

    /**
     * 主页页面
     *
     * @return API response html
     */
    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/msg")
    @ResponseBody
    public String validate(Map<String, String> map) {
        map.forEach((k, v) -> {
            log.info("k={},v={}", k, v);
        });
        return "";
    }


}
