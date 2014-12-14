package by.bsuir.hostel.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Dashka on 12.12.2014.
 */

@Entity
@Table(name = "Duty")
public class Duty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private  Integer id_student;

    @Column
    private Date last_date;

    @Column
    private Integer dutyCount;

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

    public Date getLast_date() {
        return last_date;
    }

    public void setLast_date(Date last_date) {
        this.last_date = last_date;
    }

    public Integer getDutyCount() {
        return dutyCount;
    }

    public void setDutyCount(Integer dutyCount) {
        this.dutyCount = dutyCount;
    }
}
