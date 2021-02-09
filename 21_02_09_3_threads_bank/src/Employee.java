public class Employee {

    private final String nickname;
    private final int shortiesTime;
    private final int longestTime;
    private final IntRandomNumberGenerator sequenceGenerator;

    public Employee(String nickname, int shortiesTime, int longestTime) {
        this.nickname = nickname;
        this.shortiesTime = shortiesTime;
        this.longestTime = longestTime;
        this.sequenceGenerator = new IntRandomNumberGenerator(shortiesTime, longestTime);
    }


    String getNickname() {
        return nickname;
    }



}
