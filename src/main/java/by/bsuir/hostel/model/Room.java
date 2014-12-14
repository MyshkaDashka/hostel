package by.bsuir.hostel.model;

import javax.persistence.*;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table (name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private  Integer id;
    @Column
    private Integer id_type;
    @Column
    private  Integer floor;
    @Column
    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_type() {
        return id_type;
    }

    public void setId_type(Integer id_type) {
        this.id_type = id_type;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
