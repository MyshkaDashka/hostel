package by.bsuir.hostel.model;

import javax.persistence.*;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table (name = "student_council")
public class StudentCouncil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private Integer id_student;
    @Column
    private String job_title;
    @Column
    private String groupCouncil;

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

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getGroupCouncil() {
        return groupCouncil;
    }

    public void setGroupCouncil(String groupCouncil) {
        this.groupCouncil = groupCouncil;
    }
}
