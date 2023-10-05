package org.bhp.first_extreceice.client.factory;

import org.bhp.first_extreceice.client.IExternalApiClient;

public interface IExternalClientFactory<T extends IExternalApiClient> {
    T createInstance(String sourceKeyWord);
}
