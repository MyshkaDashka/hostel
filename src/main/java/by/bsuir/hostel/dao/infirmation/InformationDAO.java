package by.bsuir.hostel.dao.infirmation;

import by.bsuir.hostel.model.Hostels;
import by.bsuir.hostel.model.Informations;
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
public class InformationDAO implements IInformationDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("JpaQlInspection")
    public List<Informations> getInformationses(){
        return sessionFactory.getCurrentSession().createQuery("from Informations").list();
    }

    @SuppressWarnings("JpaQlInspection")
    public List<Informations> getInformationsesOne(Integer number){
        return  sessionFactory.getCurrentSession().createQuery("from Informations where id = '" + number + "'").list();
    }


}
