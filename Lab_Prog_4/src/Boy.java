public class Boy extends Person {
    Boy(String name) {
        super(name);
        //this.name = name;
    }
    public void Breathe(){
        System.out.println(GetName() + " " + Feels.DIFFICULT + " вздохнул");
    }
    public void Not_Know(){
        Thing thing = new Thing("время");
        System.out.println("Но ведь в то " + thing + " " + GetName() + " еще не знал " + Pronouns.HIM);

    }



}
