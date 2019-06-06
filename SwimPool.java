 class SwimPool extends Obstacle{
    private int length;
    SwimPool(int length)
    {
        this.length = length;
    }
    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}
