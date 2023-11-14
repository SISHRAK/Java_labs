// import java.lang.reflect.Field;
import java.util.Objects;

final public class Mailbox {
  private final String name = "Почтовый ящик";
  private final String material;
  private final String target;

  public Mailbox(String material, String target) {
    Objects.requireNonNull(material, "Поле \"материал\" обязано быть не null");
    this.material = material;
    this.target = Objects.requireNonNullElse(target, "Для всего");
  }

  public String getName(){
    return this.name;
  }
  public String getMaterial() {
    return ' ' + this.material;
  }
  public String getTarget() {
    return this.target;
  }


  @Override public boolean equals(Object compared_object) {
    if (this == compared_object) {
      return true;
    } else if (compared_object == null || this.getClass() != compared_object.getClass()) {
      return false;
    }
    Mailbox compared_mailbox = (Mailbox) compared_object;
    return Objects.equals(this.material, compared_mailbox.material);
  }

  @Override public int hashCode() {
    int hash = 0;
    int position = 1;
    for (char ch : this.material.toCharArray()) {
      hash += ch * position;
      ++position;
    }
    return hash;
  }

  @Override public String toString() {
    return this.material.toLowerCase() + ", с надписью " + this.target.toLowerCase();
  }


}
