//package org.bhp.first_extreceice.client;
//
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import jdk.jshell.spi.ExecutionControl;
//import org.modelmapper.ModelMapper;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//import com.fasterxml.jackson.core.type.TypeReference;
//
//
//import java.util.List;
//import java.util.Map;
//
//@Service
//public abstract class ExternalApiClient<T> implements IExternalApiClient {
//
//
//    @Value("${api.external.posts-suffix}")
//    private String postSuffix;
//    @Value("${api.external.coments-suffix}")
//    private String commentSuffix;
//
//
//    private final Map<String, String> urlMap;
//    private final RestTemplate restTemplate;
//    private final ObjectMapper objectMapper;
//
//    @Autowired
//    public ExternalApiClient(Map<String, String> urlMap, RestTemplate restTemplate, ObjectMapper objectMapper) {
//        this.urlMap = urlMap;
//        this.restTemplate = restTemplate;
//        this.objectMapper = objectMapper;
//    }
//
//    public <T> List<T> callToPostApi(String postSource) throws ExecutionControl.NotImplementedException {
//        String url = urlMap.get(postSource) + postSuffix;
//        String postsJson = restTemplate.getForEntity(url, String.class).getBody();
//        List<T> posts = null;
//        try {
//            posts = objectMapper.readValue(postsJson, new TypeReference<List<T>>() {
//            });
//        } catch (JsonProcessingException e) {
//            System.out.println(e.getMessage());
//        }
//
//        return posts;
//    }
//
//    @Override
//    public String callToCommentApi(String commentSource) {
//        String url = urlMap.getOrDefault(commentSource, urlMap.get("dummy")) + commentSuffix;
//
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
//
//        return responseEntity.getBody();
//    }
//}
