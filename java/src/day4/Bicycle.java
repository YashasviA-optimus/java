package day4;

public interface Bicycle {

    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}


// Bicycle interface Contains method signatures that define actions a bicycle can perform, like changing cadence,
// gear, speed, and applying brakes.
