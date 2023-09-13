package org.bhp.first_extreceice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class JsonAppConfig {

    @Value("${jsonplaceholder.url:https://jsonplaceholder.typicode.com/posts}")
    private String jsonPlaceholderUrl;

    @Value("${dummy.url:https://dummyjson.com/posts}")
    private String dummyUrl;

    @Bean
    public Map<String, String> urlsMap() {
        Map<String, String> urlMap = new HashMap<>();
        urlMap.put("dummy", dummyUrl);
        urlMap.put("placeholder", jsonPlaceholderUrl);
        return urlMap;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
