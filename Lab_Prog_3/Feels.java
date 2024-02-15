public enum Feels {
    MERCILESSLY("ласково"), RIGHT("прав"), HIGH("высоко"), UNBEARABLY("с восторгом"), STRAIGHT("прямо");
    private String value;
     Feels(String s){
        value = s;
    }
    @Override
    public String toString(){
        return value;
    }
}