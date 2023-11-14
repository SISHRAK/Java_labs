public class Main {
  public static void main(String[] args) {
    final var pyatachok = new Pyatachok();
    final var sova = new Sova();
    final var mailbox = new Mailbox("проволочный", "для писем и газет");
    // try {
    //   sova.changeLast_name("умновна");
    // } catch (NoUpperCaseException ex){
    //   System.out.println(ex.getMessage());
    // }
    // System.out.println(sova.getLastName());
    // try{
    //   sova.changeLast_name(null);
    // } catch (NoUpperCaseException ex){
    //   System.out.println(ex.getMessage());
    // }
    System.out.println(sova.getLastName());

    Door door = new Door();
    door.setMailbox(mailbox);
    Door.Gap gap = door.new Gap();
    System.out.println(door.getMailbox());

    System.out.println(pyatachok.bow("ним."));
    System.out.println(sova.admire("почтовым ящиком"));
    System.out.println(sova.getFirstName() + sova.fly());

    System.out.print(sova.sleep());
    System.out.print(", a ");
    System.out.println(pyatachok.sleep());

    var textInParentheses = new ParenthesesWrapper(){        // Анонимный класс
      public String get(){
        return mailbox.getName() + " был" + mailbox.getMaterial() + ", и " + door.getName() + " имела " +
                gap.getName() + ", а на ней была " + gap.getTitle() + ": \"" + gap.getLabel() + '\"' +
                ", только эту " + gap.getTitle() + ' ' + gap.isVisible(false) + ", потому что " +
                gap.getTitle() + " была снаружи";
      }
    };
    System.out.println(textInParentheses.wrap());

    System.out.print(pyatachok.push());
    System.out.print(" и ");
    System.out.println(sova.push());
    Hero.Work thisBook = new Hero.Work();
    System.out.println(thisBook.toString());


    //System.out.println(door.getMailbox());


  }
}

