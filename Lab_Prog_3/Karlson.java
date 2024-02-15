public class Karlson extends Person implements Hunt {
    private String name;
    private Feeling feel;
    private Feeling high;
    private Feeling right;
    private Feeling exciting;

    Karlson() {
        this.name = "Карлсон";
        high = new Feeling(Feels.HIGH);
        feel = new Feeling(Feels.MERCILESSLY);
        right = new Feeling(Feels.RIGHT);
        exciting = new Feeling(Feels.UNBEARABLY);
    }

    Karlson(String name) {
        this.name = name;
        high = new Feeling(Feels.HIGH, true);
        feel = new Feeling(Feels.MERCILESSLY, true);
        right = new Feeling(Feels.RIGHT, true);
        exciting = new Feeling(Feels.UNBEARABLY, true);
    }

    public Feeling GetFeel() {
        return feel;
    }

    public void Right() {
        System.out.println(this.name + " был " + this.right);
    }

    public void Jump() {
        Thing water = new Thing(" в воду");
        System.out.println(Pronouns.HE + " " + Feels.UNBEARABLY + " " + Feels.STRAIGHT + water.toString());
    }

    public static void Hunt_want(Thing thing) {
        Karlson karlson = new Karlson("Карлсону");
        System.out.println(karlson.toString() + " была " + thing.toString());
    }

}
