public class Employee {

    private final String nickname;
    private final int shortiesTime;
    private final int longestTime;
    private final IntRandomNumberGenerator sequenceGenerator;
    private final boolean turboPossibility;

    public Employee(String nickname, int shortestTime, int longestTime, boolean turboPossibility) {
        this.nickname = nickname;
        this.shortiesTime = shortestTime;
        this.longestTime = longestTime;
        this.turboPossibility = turboPossibility;
        this.sequenceGenerator = new IntRandomNumberGenerator(shortestTime, longestTime);
    }

    public String getNickname() {
        return nickname;
    }

    public IntRandomNumberGenerator getSequenceGenerator() {
        return sequenceGenerator;
    }

    public boolean isTurboPossibility() {
        return turboPossibility;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nickname='" + nickname + '\'' +
                ", shortiesTime=" + shortiesTime +
                ", longestTime=" + longestTime +
                ", sequenceGenerator=" + sequenceGenerator +
                ", turboPossibility=" + turboPossibility +
                '}';
    }

}
