package by.bsuir.hostel.dao.event;

import by.bsuir.hostel.model.Event;
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
public class EventDAO implements IEventDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("JpaQlInspection")
    public List<Event> getAllEvent() {
        return sessionFactory.getCurrentSession().createQuery("from Event").list() ;
    }
}
