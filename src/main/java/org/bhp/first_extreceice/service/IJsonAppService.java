package org.bhp.first_extreceice.service;

import jdk.jshell.spi.ExecutionControl;
import org.bhp.first_extreceice.dto.DummyPostsJsonDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IJsonAppService {
    public <T> List<T> getPosts(String postSource) throws ExecutionControl.NotImplementedException;

    public String getComments(String commentSource);
}
