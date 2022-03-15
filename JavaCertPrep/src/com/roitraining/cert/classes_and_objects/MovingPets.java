package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.servicefun.spi.TransportService;
import com.roitraining.cert.shared.OwnerBuilder;

import java.util.List;

public class MovingPets {
    public static void main(String[] args) {
        List<TransportService> transports = TransportLocator.getInstance().getTransports();
        //You could get the list and perhaps, explore options.
        for (TransportService transport : transports) {
            System.out.println("Transport Option: " + transport);
        }
        //We conly have one, so let's book the transport
        TransportService service = transports.get(0);
        System.out.println("Transport price: " + service.moveEstimate(51,0, 30,88));
        System.out.println("Let's do it! Do the move: " + service.bookMove("Patrick's pets", 51,0, 30,88));
    }
}
