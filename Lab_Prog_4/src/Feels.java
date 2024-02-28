public enum Feels {
    MERCILESSLY("ласково"), RIGHT("прав"), HIGH("высоко"), UNBEARABLY("с восторгом"), STRAIGHT("прямо"),
    DIFFICULT("тяжело"), SUDDENLY("неожиданно"), LOW("слабое"), LOUDER("громче"), REAL("настоящий");
    private String value;

    Feels(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}