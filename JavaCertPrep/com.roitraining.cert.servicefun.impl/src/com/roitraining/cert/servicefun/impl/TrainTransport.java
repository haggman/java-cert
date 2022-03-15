package com.roitraining.cert.servicefun.impl;
import com.roitraining.cert.servicefun.spi.TransportService;
public class TrainTransport implements TransportService {

    @Override
    public double moveEstimate(double latStart, double lonStart, double latEnd, double lonEnd) {
        //do calculations
        return 1000;
    }

    @Override
    public boolean bookMove(String name, double latStart, double lonStart, double latEnd, double lonEnd) {
        System.out.println("Booking train transport for: " + name);
        return true;
    }

    @Override
    public String toString() {
        return "Train Transporter";
    }
}
