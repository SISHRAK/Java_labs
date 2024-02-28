public class Buzz {

    private String name;
    private String description;
    Buzz(){
        name = "жужжание";
    }
    public void Buzz_start(){
        System.out.println( "вдруг "+ Pronouns.HE + "услышал"  + " какое-то " + Feels.LOW + name);

        Countinue();

    }
    public void Countinue(){
        System.out.println(Pronouns.IT + " становилось " + Pronouns.ALL + " " + Feels.LOUDER + " и " + Feels.LOUDER + " и вот ");
        Dop_Info();
    }
    public void Dop_Info(){
        System.out.println(" как это ни покажется странным ");

    }
    public void Fly_man(Place place, Person.Man man){
        System.out.println(place + " пролетел " + man);
    }
}
