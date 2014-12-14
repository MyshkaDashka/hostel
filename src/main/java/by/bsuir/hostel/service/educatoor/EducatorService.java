package by.bsuir.hostel.service.educatoor;

import by.bsuir.hostel.dao.educatoor.IEducatorDAO;
import by.bsuir.hostel.model.Educator;
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
public class EducatorService implements IEducatorService {

    @Autowired
    private IEducatorDAO educatorDAO;

    @Transactional
    public List<Educator> educatorList(){
        return educatorDAO.getEducators();
    }
}
