package com.eazybytes.accounts.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
public record ConfigProperties(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
