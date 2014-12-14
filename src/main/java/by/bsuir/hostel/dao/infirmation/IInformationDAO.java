package by.bsuir.hostel.dao.infirmation;

import by.bsuir.hostel.model.Hostels;
import by.bsuir.hostel.model.Informations;

import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
public interface IInformationDAO {
    public List<Informations> getInformationsesOne(Integer number);
    public List<Informations> getInformationses();
}
