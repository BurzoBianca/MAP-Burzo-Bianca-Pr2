package classes;

public class Mitarbeiter {

    private Long id;
    private String name;
    private int lohn;

    public Mitarbeiter(Long id, String name, int lohn) {
        this.id = id;
        this.name = name;
        this.lohn = lohn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLohn() {
        return lohn;
    }

    public void setLohn(int lohn) {
        this.lohn = lohn;
    }
}
