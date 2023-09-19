package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Frisbee extends BaseDisc implements VariableRPM {

    private final Map<String, Float> DIAMETERS = new HashMap<>() {{
        put("Ultimate disc", 10.75f);
        put("Disc Golf disc", 8.27f);
        put("Freestyle disc", 10.0f);
    }};

    public Frisbee(String name, String discType) {
        super(name, null, 0);
        setDiscType(discType);
    }

    @Override
    public void setDiscType(String discType) {
        String newline = System.lineSeparator();
        super.setDiscType(discType);
        if (isValid()) {
            setSpinRate(calculateSpinRate());
            System.out.println(newline + "Spin rate has been updated for " + getName() + ".");
        } else {
            System.out.println(newline + "WARNING: Spin rate was not updated for " + getName() + "." + newline +
                    "Please set a valid discType (Ultimate disc, Disc Golf disc, or Freestyle disc).");
        }
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Diameter: " + DIAMETERS.get(getDiscType()) + newline;
    }


    // Methods required by VariableRPM

    @Override
    public boolean isValid() {
        return DIAMETERS.containsKey(getDiscType());
    }

    @Override
    public int calculateSpinRate() {
        int avgFrisbeeMPH = 50;
        float diameter = DIAMETERS.get(getDiscType());
        return Math.round(avgFrisbeeMPH * INCHES_PER_MILE / (diameter * PI * 60));
    }

    // Instance method

    void throwFrisbee() {
        spinDisc();
        System.out.println("Hey, nice throw!");
    }
}
