public enum Pronouns {
    SHE("она"), HER("в ней"), HE("он");
    private String value;

    Pronouns(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
