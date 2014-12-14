package by.bsuir.hostel.model;

import javax.persistence.*;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table (name = "Administration")
public class Administration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_type", referencedColumnName = "id")
    private PersonalType type;
    @Column
    private String lastName;
    @Column
    private String name;
    @Column
    private  String fatherName;
    @Column
    private Integer phone;
    @Column
    private Integer mobilePhone;

    @Column
    private Integer id_room;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonalType getType() {
        return type;
    }

    public void setType(PersonalType type) {
        this.type = type;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Integer mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getId_room() {
        return id_room;
    }

    public void setId_room(Integer id_room) {
        this.id_room = id_room;
    }
}
