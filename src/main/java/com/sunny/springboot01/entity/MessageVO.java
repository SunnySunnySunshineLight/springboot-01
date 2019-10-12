package com.sunny.springboot01.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description TODO
 * @Author sunny
 * @Date 2019-9-4 17:55
 * @Version 1.0
 **/
@Data
//@ImportResource("classpath:msg.yml")
//@PropertySource(value = {"classpath:msg.properties"})
@Component
@ConfigurationProperties(prefix = "msg")
public class MessageVO {
    public String content;
    public List<String> telnumber;
}
