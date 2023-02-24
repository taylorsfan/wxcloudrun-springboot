package com.tencent.wxcloudrun.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class WxMsg implements Serializable {
    private String ToUserName;
    private String FromUserName;
    private long CreateTime;
    private String MsgType;
    private String Content;
    private long MsgId;
}
