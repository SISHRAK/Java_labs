import java.util.Objects;

public class Thing {
    private final String name;
    private final String description;
    class Window{

    }
    Thing(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Thing(String name) {
        this.name = name;
        this.description = "";
    }

    @Override
    public String toString() {
        return description + " " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Thing thing = (Thing) obj;
        return Objects.equals(name, thing.name) && Objects.equals(description, thing.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
