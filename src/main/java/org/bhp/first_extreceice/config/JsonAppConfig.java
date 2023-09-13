package org.bhp.first_extreceice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class JsonAppConfig {

    @Value("#{${simple.map}}")
    Map<String, String> simpleMap;

    @Bean
    public Map<String, String> urlsMap() {
        return new HashMap<>(simpleMap);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
