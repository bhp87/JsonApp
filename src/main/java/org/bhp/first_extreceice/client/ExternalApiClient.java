package org.bhp.first_extreceice.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ExternalApiClient implements IExternalApiClient {


    @Value("${api.external.posts-suffix}")
    private String postSuffix;
    @Value("${api.external.coments-suffix}")
    private String commentSuffix;


    private final Map<String, String> urlMap;
    private final RestTemplate restTemplate;

    public ExternalApiClient(Map<String, String> urlMap, RestTemplate restTemplate) {
        this.urlMap = urlMap;
        this.restTemplate = restTemplate;
    }

    public String callToPostApi(String postSource) {

        String url = urlMap.getOrDefault(postSource, urlMap.get("dummy")) + postSuffix;

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        return responseEntity.getBody();
    }

    @Override
    public String callToCommentApi(String commentSource) {
        String url = urlMap.getOrDefault(commentSource, urlMap.get("dummy")) + commentSuffix;

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        return responseEntity.getBody();
    }
}
