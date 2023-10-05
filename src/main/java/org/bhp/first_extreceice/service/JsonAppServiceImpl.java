package org.bhp.first_extreceice.service;

import jdk.jshell.spi.ExecutionControl;
import org.bhp.first_extreceice.client.factory.IExternalClientFactory;
import org.bhp.first_extreceice.dto.BaseJsonDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonAppServiceImpl implements IJsonAppService {

    private final IExternalClientFactory iExternalClientFactory;

    public JsonAppServiceImpl(IExternalClientFactory iExternalApiClient) {
        this.iExternalClientFactory = iExternalApiClient;
    }


    @Override
    public List<?> getPosts(String postSource) throws ExecutionControl.NotImplementedException {

        // use factory here
        //
        return iExternalClientFactory.createInstance(postSource).callToPostApi(postSource);
    }

    @Override
    public String getComments(String commentSource) {

//        return iExternalClientFactory.callToCommentApi(commentSource);
        return null;
    }
}
