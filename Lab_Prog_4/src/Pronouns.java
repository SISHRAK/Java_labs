public enum Pronouns {
    SHE("она"), HER("в ней"), HE("он"), IT("оно"), ALL("все"), HIM("его");
    private String value;

    Pronouns(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
