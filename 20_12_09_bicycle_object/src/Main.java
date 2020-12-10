public class Main {
    public static void main(String[] args) {
        MountainBike mountainBikeOne = new MountainBike(15, 3, 10, 2);

        System.out.println(mountainBikeOne.toString());

        System.out.println(mountainBikeOne.cadence);
        System.out.println(mountainBikeOne.gear);
        System.out.println(mountainBikeOne.speed);

        mountainBikeOne.setCadence(11);

        System.out.println();

        System.out.println(mountainBikeOne.cadence);
        System.out.println(mountainBikeOne.gear);
        System.out.println(mountainBikeOne.speed);

        System.out.println();

        System.out.println(mountainBikeOne.seatHeight);
        mountainBikeOne.setHeight(17);
        System.out.println(mountainBikeOne.seatHeight);

        Bicycle bicycle = new Bicycle(10, 22, 6);
        System.out.println(bicycle.toString());

        Bicycle.PrivateMemberNested privateMemberNested = new Bicycle.PrivateMemberNested(6);
        System.out.println(bicycle.toString());

        System.out.println(privateMemberNested.toString());
        System.out.println(privateMemberNested.getIntTest());
        privateMemberNested.setIntTest(22);

        System.out.println(privateMemberNested.toString());
        System.out.println(privateMemberNested.getIntTest());

    }
}
