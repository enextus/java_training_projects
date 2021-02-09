public class Employee {

    private final String nickname;
    private final int shortiesTime;
    private final int longestTime;
    private final IntRandomNumberGenerator sequenceGenerator;
    private final boolean turboPossibility;

    public Employee(String nickname, int shortiesTime, int longestTime, boolean turboPossibility) {
        this.nickname = nickname;
        this.shortiesTime = shortiesTime;
        this.longestTime = longestTime;
        this.turboPossibility = turboPossibility;
        this.sequenceGenerator = new IntRandomNumberGenerator(shortiesTime, longestTime);
    }


    String getNickname() {
        return nickname;
    }



}
