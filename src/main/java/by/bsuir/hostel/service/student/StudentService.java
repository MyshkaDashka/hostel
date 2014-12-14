package by.bsuir.hostel.service.student;

import by.bsuir.hostel.dao.student.IStudentDAO;
import by.bsuir.hostel.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
@Repository
@javax.transaction.Transactional
public class StudentService implements IStudentService {

    @Autowired
    private IStudentDAO studentDAO;

    @Transactional
    public List<Student> studentList(){
        return studentDAO.getAllStudent();
    }
}
