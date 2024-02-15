import java.util.Objects;

public class Flood {
    private String name;
    private String description;
    private String new_descpr = "уже так";

    Flood(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Flood(String name) {
        this.name = name;
        this.description = "";
    }

    @Override
    public String toString() {
        return description + " " + name;
    }

    public void Started() {
        System.out.println(this.toString() + " началось");
    }

    public void Begin() {
        Place bathroom = new Place("Ванная");
        Place lobby = new Place("прихожая");
        Thing water = new Thing("водой", "залиты");
        System.out.println(bathroom.toString() + " " + lobby.toString() + " были " + water.toString());
        Water();
    }

    public void Water() {
        System.out.println(Pronouns.SHE + " стояла " + new_descpr + Feels.HIGH);
        Swim();
    }

    public void Swim() {
        System.out.println("что " + Pronouns.HER + " можно было плескаться");
        Hunt();
    }

    public void Hunt() {
        Thing hunt = new Thing("охота");
        System.out.println("если была " + hunt.toString());
        Karlson.Hunt_want(hunt);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Flood flood = (Flood) obj;
        return Objects.equals(name, flood.name) && Objects.equals(description, flood.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
