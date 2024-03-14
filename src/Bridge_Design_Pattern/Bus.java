package Bridge_Design_Pattern;

import Bridge_Design_Pattern.Vehicle;
import Bridge_Design_Pattern.Workshop;

// Refine abstraction 1 in bridge pattern
class Bus extends Vehicle {
    public Bus(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Bus ");
        workShop1.work();
        workShop2.work();
    }
}
