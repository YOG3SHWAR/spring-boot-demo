package com.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

// Getting value from application.yaml

@Data
@Component
@ConfigurationProperties(prefix = "vehicle")
public class ServerProperties {

    private Map<String, List<String>> attributes;

}