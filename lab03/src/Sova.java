// import java.util.Locale;
// import java.util.Objects;

final public class Sova extends Hero implements Flyable, Pushable {
  private String lastName = "Большеглазовна";

  public Sova() {
    super("Cова");
  }
  public Sova(String lastName) {
    this();
    this.lastName = lastName;
  }

  public String getLastName() {
    return this.lastName;
  }
  public void changeLast_name(String newLastName) throws NoUpperCaseException {
    if (newLastName == null){
      throw new LastNameIsNullException("Фамилия не может быть \"null\"");
    } else if (Character.isUpperCase(newLastName.charAt(0))){
      this.lastName = newLastName;
    } else {
      throw new NoUpperCaseException("Фамилия \"" + newLastName + "\" написана с маленькой буквы," +
              " фамилия не присвоена");
    }
  }

  @Override
  public String push() {
    class ArmChair{                     // Локальный класс
      final String name = "кресло";
      String getName() {
        return this.name;
      }
    };
    ArmChair SovaArmChair = new ArmChair();
    return this.getFirstName() + " толкает " + SovaArmChair.name;
  }

  public String bow(String description) {
    return this.getFirstName() + ' ' + "склонилась над " + description;
  }
  public String fly() {
    return " слетела" + ' ' + Sides.DOWN.toString();
  }
  public String admire(String object) {
    return this.getFirstName() + ' ' + "залюбовалась" + ' ' + object;
  }


  @Override public String sleep() {
    return "Сова спит сидя";
  }
  @Override public String getDescription() {
    return "Сова -- очень мудрая, самая старшая " +
            "жительница Стоакрового леса.";
  }


}
