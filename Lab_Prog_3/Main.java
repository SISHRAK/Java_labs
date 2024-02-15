public class Main {
    public static void main(String[] args) {
        Karlson karlson = new Karlson("Карлсон");
        Boy boy = new Boy("Малыш");
        boy.MoveHead();
        Thing door = new Thing("дверь");
        Place place = new Place("прихожую");
        boy.Open(place, boy, door);
        karlson.Right();
        Flood flood = new Flood("наводнение", "Великое");
        flood.Started();
        flood.Begin();
        karlson.Jump();
    }
}