import java.util.Objects;

abstract public class Hero implements Bowable, Loveable {
  private final String firstName;

  Hero(String name) {
    this.firstName = name;
  }

  public abstract String sleep();
  public abstract String getDescription();

  public String getFirstName() {
    return this.firstName;
  }

  public static class Work{                                 // Вложенный статик
    private final String name = "Винни-Пух";
    String getName(){
      return this.name;
    }
    @Override public String toString() {
      return "Рассматриваемое произведение называется " + this.getName();
    }
  }

  @Override public final boolean equals(Object compared_object) {
    if (this == compared_object) {
      return true;
    } else if (compared_object == null || this.getClass() != compared_object.getClass()) {
      return false;
    }
    Hero compared_hero = (Hero) compared_object;
    return Objects.equals(this.firstName, compared_hero.firstName);
  }
  @Override public final int hashCode() {
    int hash = 0;
    int position = 1;
    for (char ch : this.firstName.toCharArray()) {
      hash += ch * position;
      ++position;
    }
    return hash;
  }
  @Override public final String toString() {
    return "Имя выбранного персонажа: " + this.firstName;
  }

}










