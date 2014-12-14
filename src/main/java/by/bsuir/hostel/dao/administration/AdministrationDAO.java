package by.bsuir.hostel.dao.administration;

import by.bsuir.hostel.model.Administration;
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


    public List<Administration> getAdministrations(){
        return sessionFactory.getCurrentSession().createQuery("from Administration").list();
    }
}
