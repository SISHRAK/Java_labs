import exception.KarlsonSeeBoyException;

public class Karlson extends Person implements Fly_Lap{

    Karlson(String name) {
       super(name);
       //this.name = name;
    }
    private boolean seen = false;

    public void Was(){
        Karlson karlson = new Karlson("Карлсон");
        System.out.println("Это и был" + karlson + ", ");
        Live();

    }
    public void Live(){
        Place place = new Place("крыше", "на");
        System.out.println("который живет" + place);
    }
    public void See() throws KarlsonSeeBoyException {
        if(!seen){
            ChangeSeen();
            // local done
            class Eyes {
                private String name;
                 Eyes(String name){
                     this.name = name;
                 }
                 @Override
                public String toString(){
                     return name;
                 }
            }
            Eyes eye = new Eyes("взглядом");
            Boy boy1 = new Boy("Малыша");
            System.out.println(GetName() + " окинул " + boy1.GetName() + " " + View.ATTENTIVE + ", " + View.LONG + " " + eye + " полетел дальше");
        } else{
            throw new KarlsonSeeBoyException("Карлсон уже окинул голову");
        }
    }
    public boolean ChangeSeen(){
        seen = !seen;
        return seen;
    }
    public void Fly(){
        High high = new High(){
            private String name = "высоту";
            @Override
            public String toString(){
                return name;
            }


        };
        System.out.println("набрал " + high);
        Lap lap = new Lap("круг","небольшой");
        lap.Fly();
        Thing pipe = new Thing("трубы", "вокруг");
        System.out.println("облетел " + pipe + " и ");
        Thing window = new Thing("окну", "к");
        Back(window);
    }
    public void Back(Thing window){
        System.out.println("повернул назад, " + window);
    }
    public void Faster(Boy boy){
        Speed speed = new Speed("скорость");
        Plane plane = new Plane("самолет", "маленький");
        System.out.println("Затем " + Pronouns.HE + " " + speed + " и пронесся мимо " + boy);
        System.out.println("как " + Feels.REAL + " " + plane);

    }

}
