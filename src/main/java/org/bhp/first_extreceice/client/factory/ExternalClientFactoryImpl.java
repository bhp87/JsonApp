package org.bhp.first_extreceice.client.factory;

import org.bhp.first_extreceice.client.DummyExternalApiService;
import org.bhp.first_extreceice.client.IExternalApiClient;
//import org.bhp.first_extreceice.client.PlaceholderExternalApiService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ExternalClientFactoryImpl implements IExternalClientFactory {

    private final ApplicationContext applicationContext;

    public ExternalClientFactoryImpl(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public IExternalApiClient createInstance(String sourceKeyWord) {
        return switch (sourceKeyWord) {
            case "dummy" -> applicationContext.getBean(DummyExternalApiService.class);
           // case "placeholder" -> applicationContext.getBean(PlaceholderExternalApiService.class);

            default -> throw new IllegalStateException("Unexpected value: " + sourceKeyWord);
        };
    }
}
