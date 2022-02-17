package classes;

import java.util.List;

public class Team {
    private Long id;
    private String name;
    private List<Mitarbeiter> mitarbeiters;

    public Team(Long id, String name, List<Mitarbeiter> mitarbeiters) {
        this.id = id;
        this.name = name;
        this.mitarbeiters = mitarbeiters;
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

    public List<Mitarbeiter> getMitarbeiters() {
        return mitarbeiters;
    }

    public void setMitarbeiters(List<Mitarbeiter> mitarbeiters) {
        this.mitarbeiters = mitarbeiters;
    }
}



