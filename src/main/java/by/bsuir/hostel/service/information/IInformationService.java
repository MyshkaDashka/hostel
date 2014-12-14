package by.bsuir.hostel.service.information;

import by.bsuir.hostel.model.Hostels;
import by.bsuir.hostel.model.Informations;

import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
public interface IInformationService {
    public List<Informations> informationsList();
    public List<Informations> informationsListOne(Integer number);
}
