final public class Pyatachok extends Hero implements Pushable{

  public Pyatachok() {
    super("Пятачок");
  }

  @Override public String sleep() {
    return "Пятачок спит лёжа";
  }


  public String bow(String description) {
    return this.getFirstName() + ' ' + "склонился над" + ' ' + description;
  }
  public String admire(String object) {
    return this.getFirstName() + ' ' + "залюбовался";
  }
  @Override
  public String push() {
    class ArmChair{                                       // Локальный класс
      final String name = "кресло";
      String getName() {
        return this.name;
      }
    };
    ArmChair SovaArmChair = new ArmChair();
    return this.getFirstName() + " толкает " + SovaArmChair.name;
  }

  @Override public String getDescription() {
    return "Пятачок очень сильно боится темноты и многих других вещей, " +
            "но очень часто совершает действительно " +
            "смелые поступки.";
  }
}
