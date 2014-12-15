package by.bsuir.hostel.dao.student;

import by.bsuir.hostel.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
@Repository
@Transactional
public class StudentDAO implements IStudentDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("JpaQlInspection")
    public List<Student> getAllStudent() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list() ;
    }
    @SuppressWarnings("JpaQlInspection")
    public List<Student> getAllStudentByType(Integer id_t) {
        return sessionFactory.getCurrentSession().createQuery("from Student where id_type = '" + id_t + "'").list() ;
    }
}
