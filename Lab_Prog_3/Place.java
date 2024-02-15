import java.util.Objects;

public class Place {
    private final String place;

    Place(String name){
        this.place = name;
    }
    @Override
    public String toString(){
        return place;
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
