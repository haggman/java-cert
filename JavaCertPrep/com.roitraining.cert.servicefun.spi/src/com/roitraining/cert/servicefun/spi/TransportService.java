package com.roitraining.cert.servicefun.spi;

public interface TransportService {
    double moveEstimate(double latStart, double lonStart, double latEnd, double lonEnd);
    boolean bookMove(String name, double latStart, double lonStart, double latEnd, double lonEnd);
}
