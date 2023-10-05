package org.bhp.first_extreceice.client;

import jdk.jshell.spi.ExecutionControl;
import org.bhp.first_extreceice.dto.BaseJsonDto;
import org.bhp.first_extreceice.dto.DummyPostsJsonDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

//public interface IExternalApiClient {
//    public<T> List<T> callToPostApi(String postSource) throws ExecutionControl.NotImplementedException;
//
//    public String callToCommentApi(String commentSource);
//}


public interface IExternalApiClient {
    public List<?> callToPostApi(String postSource) throws ExecutionControl.NotImplementedException;

    public String callToCommentApi(String commentSource);
}
