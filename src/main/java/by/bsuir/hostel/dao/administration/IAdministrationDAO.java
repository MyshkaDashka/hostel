package by.bsuir.hostel.dao.administration;

import by.bsuir.hostel.model.Administration;

import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
public interface IAdministrationDAO {
    public List<Administration> getAdministrations();
    public List<Administration> getAdministrationsOne(Integer number);
}
