import exception.KarlsonSeeBoyException;
import exception.MoreLapsException;

public class Main {
    public static void main(String[] args) throws KarlsonSeeBoyException {
        Boy boy = new Boy("Малыш");
        boy.Breathe();
        Buzz buzz = new Buzz();
        buzz.Buzz_start();
        Person.Man man = new Person.Man("человечек", "толстый");
        Place place = new Place("окна", "мимо");
        buzz.Fly_man(place, man);
        Karlson karlson = new Karlson("Карлсон");
        karlson.Was();
        boy.Not_Know();
        try{
            karlson.See();
            karlson.See();
        } catch (KarlsonSeeBoyException e){
            System.out.println(e.getMessage());
        }

        karlson.Fly();
        karlson.Faster(boy);
        Lap lap = new Lap("круг", "второй");
        try{
            lap.Second_Lap(lap);
            lap.Second_Lap(lap);
        } catch (MoreLapsException e){
            System.out.println(e.getMessage());
        }

    }
}