package by.bsuir.hostel.model;

import javax.persistence.*;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table(name = "Oxch")
public class Oxch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer id_student;
    @Column
    private String name_job;
    @Column
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_student() {
        return id_student;
    }

    public void setId_student(Integer id_student) {
        this.id_student = id_student;
    }

    public String getName_job() {
        return name_job;
    }

    public void setName_job(String name_job) {
        this.name_job = name_job;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
