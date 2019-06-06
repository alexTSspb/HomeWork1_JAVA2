import java.util.ArrayList;

public class Course {
    ArrayList<Obstacle> course = new ArrayList<Obstacle>();
    Course(Obstacle ... obstacles)
    {
        for(Obstacle o:obstacles){
            course.add(o);
        }
    }
    public void do_it(Team team)
    {
        for (Competitor t : team.team)
        {
            for (Obstacle o : course){
                o.doIt(t);
                if(!t.isOnDistance())
                    break;
            }
        }

    }

}
