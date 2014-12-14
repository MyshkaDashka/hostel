package by.bsuir.hostel.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table (name = "personal_type")
public class PersonalType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private  Integer id;

    @Column
    private String nameType;

    @OneToMany(mappedBy = "type")
    private List<Administration> administrationList;

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public List<Administration> getAdministrationList() {
        return administrationList;
    }

    public void setAdministrationList(List<Administration> administrationList) {
        this.administrationList = administrationList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
