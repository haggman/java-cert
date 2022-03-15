package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.servicefun.spi.TransportService;

import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

//Notice, this is another example of the singleton design pattern
public class TransportLocator {
    private static TransportLocator instance;
    static{
        instance = new TransportLocator();
    }
    private TransportLocator(){ //Inaccessible from outside world
    }
    public static TransportLocator getInstance(){
        return instance;
    }

    public List<TransportService> getTransports(){
        ServiceLoader<TransportService> loader = ServiceLoader.load(TransportService.class);
        List<TransportService> services = loader.stream().
                map(ServiceLoader.Provider::get).collect(Collectors.toList());
        return services;
    }
}
