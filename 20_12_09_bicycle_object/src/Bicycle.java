public class Bicycle {


    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    private static int iPrivVar;

    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.iPrivVar = 1;
    }

    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        this.cadence = newValue;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    private void speedUp(int increment) {
        this.speed += increment;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "cadence=" + cadence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    class B {
        void setPrivateOfA(int var) {
            Bicycle.iPrivVar = var;
        }
    }

    public static class PrivateMemberNested {

        int intTest = 23;

        public PrivateMemberNested(int intTest) {
            this.intTest = intTest;
        }

        public int getIntTest() {

            return this.intTest;
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
