import java.util.Objects;

public class Feeling {
    private final Feels name;
    private boolean activity;
    Feeling(Feels name, boolean activity){
        this.name = name;
        this.activity = activity;
    }
    Feeling(Feels name){
        this.name = name;
        activity = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Feeling feeling = (Feeling) obj;
        return activity == feeling.activity && name == feeling.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, activity);
    }

    @Override
    public String toString(){
        return name.toString();
    }
}