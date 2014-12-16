package by.bsuir.hostel.service.event;

import by.bsuir.hostel.dao.educatoor.IEducatorDAO;
import by.bsuir.hostel.dao.event.IEventDAO;
import by.bsuir.hostel.model.Educator;
import by.bsuir.hostel.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
@Repository
@javax.transaction.Transactional
public class EventService implements IEventService {

    @Autowired
    private IEventDAO eventDAO;

    @Transactional
    public List<Event> eventList(){
        return eventDAO.getAllEvent();
    }
}
