package by.bsuir.hostel.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

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
    private Date date;
    @Column
    private String name;
    @Column
    private String description;

    @OneToMany(mappedBy = "eventEducator")
    private List<Educator> educatorList;

    @OneToMany(mappedBy = "eventStudent")
    private List<Student> studentList;

    public List<Educator> getEducatorList() {
        return educatorList;
    }

    public void setEducatorList(List<Educator> educatorList) {
        this.educatorList = educatorList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
