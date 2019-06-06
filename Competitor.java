public interface Competitor {
    //Interface for creating different kind of competitors ( human, beard, underWaterTeam =) )
    void run(int length);
    void swim(int length);
    void jump(int heigth);
    boolean isOnDistance();
    void info();
}
