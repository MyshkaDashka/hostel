package by.bsuir.hostel.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table (name = "student_type")
public class StudentType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private String  type;

    @OneToMany(mappedBy = "type")
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
