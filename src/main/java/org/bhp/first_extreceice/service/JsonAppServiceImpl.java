package org.bhp.first_extreceice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class JsonAppServiceImpl implements IJsonAppService {
    private final Map<String, String> urlMap;
    private final RestTemplate restTemplate;

    public JsonAppServiceImpl(Map<String, String> urlMap, RestTemplate restTemplate) {
        this.urlMap = urlMap;
        this.restTemplate = restTemplate;
    }

    @Override
    public String getPosts(String postSource) {
        String url = urlMap.getOrDefault(postSource, urlMap.get("dummy"));

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        return responseEntity.getBody();

    }
}
