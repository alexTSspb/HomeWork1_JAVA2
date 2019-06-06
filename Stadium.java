public class Stadium extends Obstacle {
    int length;
    Stadium(int length)
    {
        this.length = length;
    }
    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);

    }
}
