package ma.geo.local.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class NiveauEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String label;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "niveau")
    private List<StudentEntity> studentEntityList
            = new ArrayList<>();
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
