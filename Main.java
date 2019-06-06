public class Main {
    public static void main(String[] args) {
        start();
    }


    public static void start()
    {
        Course course1 = new Course(new Wall(2), new Wall(1),
                new Stadium(45),
                new SwimPool(30),
                new Wall(5));
        Team team1 = new Team("HomeLittle", new Animal("cat", "Мурзила", 50,0,2),
                new Animal("Dog","Bro", 150,50,3),
                new Animal("Dog","Killer", 1500,500,5),
                new Animal("Cat","Pushok", 10,1,1));
        course1.do_it(team1);
        team1.showResultsAll();
        team1.showResultWinner();
    }
}

