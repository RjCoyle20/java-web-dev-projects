package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, int capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }
    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
