import exception.MoreLapsException;

public class Lap extends Thing implements Fly_Lap {
    private String name;
    private String description;
    private Integer laps = 0;
    //non-static class done вложенный
    public class First_Lap extends Lap{
        public First_Lap(String name, String description){
            super(name,description);
        }
    }
    Lap(String name, String description) {
        super(name, description);
    }

    Lap(String name) {
        super(name);
    }

    public void Fly() {
        //OneMoreLap();
        Thing thing = new Thing("крышей", "над");
        Lap lap = new First_Lap("круг", "первый");
        System.out.println(Pronouns.HE + " сделал небольшой " + lap + " " + thing);
    }

    public void Second_Lap(Lap lap) {
        if (laps < 2) {
            OneMoreLap();
            System.out.println("Потом сделал " + lap);
            Last_Lap();
        } else{
            throw new MoreLapsException("Он пролетел 2 круг уже");
        }

    }

    public void Last_Lap() {
        if (laps < 2) {
            System.out.println("Потом третий");
            OneMoreLap();
        } else {
            throw new MoreLapsException("Он пролетел все круги");
        }

    }

    public Integer OneMoreLap() {
        laps++;
        return laps;
    }

}
