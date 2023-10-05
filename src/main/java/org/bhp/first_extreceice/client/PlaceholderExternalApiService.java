//package org.bhp.first_extreceice.client;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import jdk.jshell.spi.ExecutionControl;
//import org.bhp.first_extreceice.dto.BaseJsonDto;
//import org.bhp.first_extreceice.dto.DummyPostsJsonDto;
//import org.modelmapper.ModelMapper;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//import java.util.Map;
//@Component
//public class PlaceholderExternalApiService extends ExternalApiClient<BaseJsonDto> {
//    public PlaceholderExternalApiService(Map<String, String> urlMap,
//                                         RestTemplate restTemplate,
//                                         ModelMapper mapper,
//                                         ObjectMapper objectMapper) {
//        super(urlMap, restTemplate, mapper, objectMapper);
//    }
//
//    @Override  public <BaseJsonDto> List<BaseJsonDto> callToPostApi(String postSource) throws ExecutionControl.NotImplementedException {
//// write here your unique implimnetation of get posts
//     throw new  ExecutionControl.NotImplementedException("");
//    }
//}
