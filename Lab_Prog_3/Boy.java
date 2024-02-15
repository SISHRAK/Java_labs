public class Boy extends Person implements Head{

    private String name;
    private String des;

    Boy(String name) {
        this.name = name;
    }
    Boy(){
        this.name = "Малыш";
    }

    public void Open(Place place, Boy boy, Thing door){
        System.out.println(boy + " распахнул " + door + " в " + place);
    }
    public void See(Boy boy, Karlson karlson) {
        System.out.println(karlson.toString() + " " + karlson.GetFeel() + " поглядел на " + boy.toString() + "а");
    }

    public void MoveHead() {
        System.out.println(this.toString() + " наклонил голову");
        this.See(this, new Karlson("Карлсон"));
    }
}
