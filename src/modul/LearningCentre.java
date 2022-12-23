package modul;

import java.util.UUID;

public class LearningCentre {
    private UUID id;
    private String name;

    public LearningCentre() {

    }

    public LearningCentre(UUID id) {
        this.id = UUID.randomUUID();
    }

    public LearningCentre(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "LearningCentre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
