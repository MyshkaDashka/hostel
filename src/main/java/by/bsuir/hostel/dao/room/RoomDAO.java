package by.bsuir.hostel.dao.room;

import by.bsuir.hostel.model.Room;
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
public class RoomDAO implements IRoomDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("JpaQlInspection")
    public List<Room> getRoom(){
        return sessionFactory.getCurrentSession().createQuery("from Room").list();
    }
}
