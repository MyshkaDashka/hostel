package by.bsuir.hostel.dao.administration;

import by.bsuir.hostel.model.Administration;
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
public class AdministrationDAO  implements IAdministrationDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("JpaQlInspection")
    public List<Administration> getAdministrations(){
        return sessionFactory.getCurrentSession().createQuery("from Administration").list();
    }
    @SuppressWarnings("JpaQlInspection")
    public List<Administration> getAdministrationsOne(Integer number){
        return  sessionFactory.getCurrentSession().createQuery("from Administration where id = '" + number + "'").list();
    }
}
