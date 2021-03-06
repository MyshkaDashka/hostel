package by.bsuir.hostel.service.administration;

import by.bsuir.hostel.dao.administration.IAdministrationDAO;
import by.bsuir.hostel.model.Administration;
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
public class AdministrationService implements IAdministrationService {

    @Autowired
    private IAdministrationDAO administrationDAO;

    @Transactional
    public List<Administration> administrationList(){
        return administrationDAO.getAdministrations();
    }

    @Transactional
    public List<Administration> administrationListOne(Integer number){
        return administrationDAO.getAdministrationsOne(number);
    }



}
