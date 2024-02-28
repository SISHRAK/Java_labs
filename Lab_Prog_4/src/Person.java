import java.util.Objects;

public abstract class Person {
    private String name;
    private String description;
    Person(String name) {
        this.name = name;
    }
    Person(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String GetName(){
        return name;
    }
    public String GetDescription(){
        return description;
    }
    //static class done
     static class Man extends Person {
        private String name;
        private String description;

        Man(String name, String description) {
            super(name,description);
            this.name = name;
            this.description = description;
        }
        @Override
        public String toString(){
            return description + " " + name;
        }
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
