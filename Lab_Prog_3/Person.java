import java.util.Objects;

public abstract class Person {
    private String name;
    private String description;
    private final Feeling feel;
    private final Feeling high;
    private final Feeling right;
    private final Feeling exciting;

    Person(String name) {
        this.name = name;
        high = new Feeling(Feels.HIGH);
        feel = new Feeling(Feels.MERCILESSLY);
        right = new Feeling(Feels.RIGHT);
        exciting = new Feeling(Feels.UNBEARABLY);

    }

    Person() {
        this.name = "Карлсон";
        high = new Feeling(Feels.HIGH, true);
        feel = new Feeling(Feels.MERCILESSLY, true);
        right = new Feeling(Feels.RIGHT, true);
        exciting = new Feeling(Feels.UNBEARABLY, true);
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name) && Objects.equals(description, person.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
