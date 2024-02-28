import java.util.Objects;

public class Place {
    private String place;
    private String description;

    Place(String name){
        this.place = name;
    }
    Place(String name, String desc){
        this.place = name;
        description = desc;
    }
    @Override
    public String toString(){
        return description + " " + place;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Place place = (Place) obj;
        return Objects.equals(place.toString(), place.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place);
    }
}
