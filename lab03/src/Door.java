public class Door {
  private final String name = "дверь";
  private Mailbox mailbox = null; // чекед исключение

  public void setMailbox(Mailbox mailbox){
    this.mailbox = mailbox;
  }
  public String getMailbox(){                                         // чекед исключение чтоб у налла не вызывали
    return this.mailbox.getName() + ' ' + this.mailbox.toString();
  }
  public String getName(){
    return this.name;
  }

  public class Gap implements Labeled {             // Вложенный non-static
    private String name = "щель";
    private String label = mailbox.getTarget();
    private final String title = "надпись"; // вложенный статик можно сделать тут

    public String getName() {
      return name;
    }
    public String getLabel() {
      return label;
    }
    public String getTitle(){
      return title;
    }

    public String isVisible(boolean a) {
      if (a) return "было видно";
      else return "не было видно";
    }

  }

}

