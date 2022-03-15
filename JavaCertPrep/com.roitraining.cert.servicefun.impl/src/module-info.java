module com.roitraining.cert.servicefun.impl {
    requires com.roitraining.cert.servicefun.spi;
    exports com.roitraining.cert.servicefun.impl;

    provides com.roitraining.cert.servicefun.spi.TransportService
            with com.roitraining.cert.servicefun.impl.TrainTransport;
}