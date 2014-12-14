package by.bsuir.hostel.model;

import javax.persistence.*;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table(name = "Mobilephones")
public class MobilePhones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private  Integer id_student;
    @Column
    private Integer mobilePhone;

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

    public Integer getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Integer mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
