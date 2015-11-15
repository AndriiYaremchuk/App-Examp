package ua.my.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.my.DAOInterface.StaffDaoInterface;
import ua.my.model.Staff;
import ua.my.serviceInterface.StaffServiceInterface;

@Service
public class StaffService implements StaffServiceInterface {

	@Autowired
	private StaffDaoInterface stDao;


	public String getStaffAge(int id) {
		Integer i = stDao.getAll().get(id).getAge();
		return i.toString();
	}

	public void pasteIntoDB(Staff s) {
		stDao.pasteIntoDB(s);
	}

	public Staff findByid(int id) {
		return stDao.findByid(id);
	}

	public void deleteFromDb(Staff s) {
		stDao.deleteFromDb(s);
		
	}

	public List<Staff> getAll() {
		return stDao.getAll();
	}

}
