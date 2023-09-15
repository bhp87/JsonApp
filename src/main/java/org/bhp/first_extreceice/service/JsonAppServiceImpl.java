package org.bhp.first_extreceice.service;

import org.bhp.first_extreceice.client.ExternalApiClient;
import org.bhp.first_extreceice.client.IExternalApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonAppServiceImpl implements IJsonAppService {

    private final IExternalApiClient iExternalApiClient;

    @Autowired
    public JsonAppServiceImpl(ExternalApiClient externalApiClient) {
        this.iExternalApiClient = externalApiClient;
    }

    @Override
    public String getPosts(String postSource) {

        return iExternalApiClient.callToPostApi(postSource);
    }

    @Override
    public String getComments(String commentSource) {

        return iExternalApiClient.callToCommentApi(commentSource);
    }
}
