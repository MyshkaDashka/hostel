package by.bsuir.hostel.dao.educatoor;

import by.bsuir.hostel.model.Educator;
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
public class EducatorDAO implements IEducatorDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("JpaQlInspection")
    public List<Educator> getEducators(){
        return sessionFactory.getCurrentSession().createQuery("from Educator").list();
    }
}
