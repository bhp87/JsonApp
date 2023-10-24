package org.bhp.first_extreceice.client;

public interface IExternalApiClient {
    public String callToPostApi(String postSource);

    public String callToCommentApi(String commentSource);
}
