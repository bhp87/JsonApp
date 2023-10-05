package org.bhp.first_extreceice.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.jshell.spi.ExecutionControl;
import org.bhp.first_extreceice.dto.BaseJsonDto;
import org.bhp.first_extreceice.dto.DummyPostsJsonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

//@Component
//public class DummyExternalApiService extends ExternalApiClient<DummyPostsJsonDto> {
//
//    public DummyExternalApiService(Map<String, String> urlMap, RestTemplate restTemplate , ObjectMapper objectMapper) {
//        super(urlMap, restTemplate, objectMapper);
//    }
//}

@Component
public class DummyExternalApiService implements IExternalApiClient {


    @Value("${api.external.posts-suffix}")
    private String postSuffix;
    @Value("${api.external.coments-suffix}")
    private String commentSuffix;


    private final Map<String, String> urlMap;
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    @Autowired
    public DummyExternalApiService(Map<String, String> urlMap, RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.urlMap = urlMap;
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    public List<?> callToPostApi(String postSource) throws ExecutionControl.NotImplementedException {
        String url = urlMap.get(postSource) + postSuffix;
        String postsJson = restTemplate.getForEntity(url, String.class).getBody();
        List<DummyPostsJsonDto> posts = null;
        try {
            posts = objectMapper.readValue(postsJson, new TypeReference<List<DummyPostsJsonDto>>() {
            });
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }

        return posts;
    }


    //   @Override
    public String callToCommentApi(String commentSource) {
        return null;
    }
}
