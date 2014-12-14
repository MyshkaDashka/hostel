package by.bsuir.hostel.service.hostel;

import by.bsuir.hostel.dao.hostel.IHostelDAO;
import by.bsuir.hostel.model.Hostels;
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
public class HostelService implements IHostelService {

    @Autowired
    private IHostelDAO hostelDAO;

    @Transactional
    public List<Hostels> hostelsList(){
        return hostelDAO.getHostels();
    }

    @Transactional
    public List<Hostels> hostelOne(Integer number){
        return  hostelDAO.getHostelOne(number);
    }


}
