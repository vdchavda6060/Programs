
package hybrit;

public class person {
    private String name,city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public person(String name, String city) {
        this.name = name;
        this.city = city;
    }
    
}
