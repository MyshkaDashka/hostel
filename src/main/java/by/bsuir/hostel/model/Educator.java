package by.bsuir.hostel.model;

import javax.persistence.*;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table (name = "Educator")
public class Educator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private  Integer id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private  String  fatherName;
    @Column
    private Integer mobilePhone;
    @Column
    private Integer phone;
    @Column
    private Integer id_room;

    @ManyToOne
    @JoinColumn(name = "id_event", referencedColumnName = "id")
    private Event eventEducator;

    public Event getEventEducator() {
        return eventEducator;
    }

    public void setEventEducator(Event eventEducator) {
        this.eventEducator = eventEducator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Integer getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Integer mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getId_room() {
        return id_room;
    }

    public void setId_room(Integer id_room) {
        this.id_room = id_room;
    }
}
