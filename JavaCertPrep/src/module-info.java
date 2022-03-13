module com.roitraining.cert { //note package style naming convention
    exports com.roitraining.cert.classes_and_objects;
    //exports com.roitraining.cert.core to com.roitraining.sales; //export, but only sales module
    exports com.roitraining.cert.core;
    exports com.roitraining.cert.shared;
    exports com.roitraining.cert.annotations_generics_collections_lambdas;

    //cannot have a requires, and requires transitive on same package
    //requires java.sql; would mean these packages need it, but the caller may not
    requires transitive java.sql; //Makes sure the module is transitively available to caller
}