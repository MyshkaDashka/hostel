package by.bsuir.hostel.service.room;

import by.bsuir.hostel.dao.room.IRoomDAO;
import by.bsuir.hostel.model.Room;
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
public class RoomService implements IRoomService {

    @Autowired
    private IRoomDAO roomDAO;

    @Transactional
    public List<Room> roomList(){
        return roomDAO.getRoom();
    }
}
