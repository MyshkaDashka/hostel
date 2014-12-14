package by.bsuir.hostel.dao.hostel;

import by.bsuir.hostel.model.Hostels;
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
public class HostelDAO implements IHostelDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("JpaQlInspection")
    public List<Hostels> getHostels(){
        return sessionFactory.getCurrentSession().createQuery("from Hostels").list();
    }

    @SuppressWarnings("JpaQlInspection")
    public  List<Hostels>getHostelOne(Integer number){
        return  sessionFactory.getCurrentSession().createQuery("from Hostels where id = '"+number+"'").list();
    }


}
