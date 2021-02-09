public class Employee {

    private final String nickname;
    private final int shortiesTime;
    private final int longestTime;
    private final boolean turboPossibility;
    private int wholeTimeForAllContracts;

    public Employee(String nickname, int shortestTime, int longestTime, boolean turboPossibility) {
        this.nickname = nickname;
        this.shortiesTime = shortestTime;
        this.longestTime = longestTime;
        this.turboPossibility = turboPossibility;
    }

    void setWholeTimeForAllContracts(int wholeTimeForAllContracts) {
        this.wholeTimeForAllContracts = wholeTimeForAllContracts;
    }

    int getWholeTimeForAllContracts() {
        return wholeTimeForAllContracts;
    }

    public String getNickname() {
        return nickname;
    }

    public int getShortiesTime() {
        return shortiesTime;
    }

    public int getLongestTime() {
        return longestTime;
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
                ", turboPossibility=" + turboPossibility +
                '}';
    }

}
