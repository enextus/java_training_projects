public class Bicycle {
    @Override
    public String toString() {
        return "Bicycle{" +
                "cadence=" + cadence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    private void speedUp(int increment) {
        speed += increment;
    }

    public static class PrivateMemberNested{


        int intTest = 23;

        public PrivateMemberNested(int intTest) {
            this.intTest = intTest;
        }

        public int getIntTest() {

            return intTest;
        }

        public void setIntTest(int intTest) {
            this.intTest = intTest;
        }

        @Override
        public String toString() {
            return "PrivateMemberNested{" +
                    "intTest=" + intTest +
                    '}';
        }
    }
}
