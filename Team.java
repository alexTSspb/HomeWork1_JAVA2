import java.util.ArrayList;

public class Team {
    String name;
    ArrayList <Competitor> team = new ArrayList<Competitor>();

    Team(String name,Competitor ... competitors)
    {
       this.name = name;
       for(Competitor c :competitors)
        {
            team.add(c);
        }
    }
    void showResultsAll()
    {
        System.out.println("Информация о всех участниках команды");
        for (int i = 0; i < team.size(); i++)
        {
            team.get(i).info();
        }

    }
    void showResultWinner()
    {
        System.out.println("Информация о Тех Кто Смог");
        for (int i = 0; i < team.size(); i++)
        {
            if (team.get(i).isOnDistance())
                team.get(i).info();
        }
    }


}
