public class Animal implements Competitor {
    //In this program, we create only ZOO-team
    private String type;
    private String name;
    private int maxRunDistance;
    private int maxJumpHeigth;
    private int maxSwimDistance;
    private boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeigth)
    {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int length) {
        if(length > maxRunDistance)
        {
            //System.out.println("К сожалению, " + type + " " + name + " не смог пробежать ");
            onDistance = false;
        }
        else
        {
            //System.out.println("Ура, " + type + " " + name + " смог пробежать ");
        }
    }

    @Override
    public void swim(int length) {
        if(maxSwimDistance == 0)
        {
            System.out.println(type + " " + name + " не умеет плавать ");
        }
        if(length > maxSwimDistance)
        {
            //System.out.println("К сожалению, " + type + " " + name + " не смог проплыть ");
            onDistance = false;
        }
        else
        {
            //System.out.println("Ура, " + type + " " + name + " смог проплыть ");
        }
    }

    @Override
    public void jump(int heigth) {
        if(heigth > maxRunDistance)
        {
          //  System.out.println("К сожалению, " + type + " " + name + " не смог перепрыгнуть ");
            onDistance = false;
        }
        else
        {
           // System.out.println("Ура, " + type + " " + name + " смог перепрыгнуть ");
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + ". Can run " + maxRunDistance + ". Can swim "
                + maxSwimDistance + ". Can jump " + maxJumpHeigth);

    }
}
