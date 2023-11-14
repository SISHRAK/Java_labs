public enum Sides {
  UP,
  DOWN {
    @Override public String toString() {
      return "вниз";
    }
  },
  LEFT,
  RIGHT
}
