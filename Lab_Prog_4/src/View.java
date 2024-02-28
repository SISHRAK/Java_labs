public enum View {
    ATTENTIVE("внимательным"), LONG("долгим");

    private String value;

    View(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
