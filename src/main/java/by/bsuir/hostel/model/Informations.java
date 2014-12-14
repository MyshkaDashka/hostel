package by.bsuir.hostel.model;

import javax.persistence.*;

/**
 * Created by Dashka on 14.12.2014.
 */
@Entity
@Table(name = "Information")
public class Informations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    private String criteriaList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCriteriaList() {
        return criteriaList;
    }

    public void setCriteriaList(String criteriaList) {
        this.criteriaList = criteriaList;
    }
}
