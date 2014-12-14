package by.bsuir.hostel.service.information;

import by.bsuir.hostel.dao.infirmation.IInformationDAO;
import by.bsuir.hostel.model.Informations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
@Repository
@javax.transaction.Transactional
public class InformationService implements IInformationService {

    @Autowired
    private IInformationDAO informationDAO;

    @Transactional
    public List<Informations> informationsList(){
        return informationDAO.getInformationses();
    }

    @Transactional
    public List<Informations> informationsListOne(Integer number){
        return informationDAO.getInformationsesOne(number);
    }
}
