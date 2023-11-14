public abstract class ParenthesesWrapper {
  public abstract String get();
  public String wrap(){
    return '(' + get() + ')';
  }
}
