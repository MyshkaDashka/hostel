package by.bsuir.hostel.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table (name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private Integer id_student;
    @Column
    private Integer id_educator;
    @Column
    private Date date;
    @Column
    private String name;

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

    public Integer getId_educator() {
        return id_educator;
    }

    public void setId_educator(Integer id_educator) {
        this.id_educator = id_educator;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
