package ua.my.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.my.DAOInterface.HallDaoInterface;
import ua.my.DAOInterface.StaffDaoInterface;
import ua.my.model.Hall;
import ua.my.serviceInterface.HallServiceInterface;

@Service
public class HallService implements HallServiceInterface {
	
	@Autowired
	private StaffDaoInterface stDao;
	
	@Autowired
	private HallDaoInterface hDao;

	public String getShedule(int id) {
		return hDao.getAll().get(id).getShedule();
	}

	public String getNumberOfSeats(int id) {
		Integer i = hDao.getAll().get(id).getNumberOfSeats();
		return i.toString();
	}

	public String getStaffById (int id){
		return stDao.findByid(id).toString();
	}
	
	public void pasteIntoDB(Hall h) {
		hDao.pasteIntoDB(h);
	}

	public Hall findByid(int id) {
		return hDao.findByid(id);
	}

	public void deleteFromDb(Hall t) {
		hDao.deleteFromDb(t);

	}

	public List<Hall> getAll() {
		return hDao.getAll();
	}

}
