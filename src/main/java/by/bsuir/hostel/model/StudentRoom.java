package by.bsuir.hostel.model;

import javax.persistence.*;

/**
 * Created by Dashka on 12.12.2014.
 */
@Entity
@Table(name = "student_room")
public class StudentRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer id_student;
    @Column
    private Integer id_room;

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

    public Integer getId_room() {
        return id_room;
    }

    public void setId_room(Integer id_room) {
        this.id_room = id_room;
    }
}
