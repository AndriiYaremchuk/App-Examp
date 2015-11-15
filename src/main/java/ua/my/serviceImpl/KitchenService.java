package ua.my.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.my.DAOInterface.KitchenDaoInterface;
import ua.my.DAOInterface.StaffDaoInterface;
import ua.my.model.Kitchen;
import ua.my.serviceInterface.KitchenServiceInterface;

@Service
public class KitchenService implements KitchenServiceInterface {
	
	@Autowired
	private StaffDaoInterface stDao;
	
	@Autowired
	private KitchenDaoInterface kDao;
	
	public String getVeganlMenu (int id){
		return kDao.getAll().get(id).getVeganMenu();
	}
	
	public String getClassicMenu (int id){
		return kDao.getAll().get(id).getClassicMenu();
	}
	
	public String getStaffById (int id){
		return stDao.findByid(id).toString();
	}
	
	public void pasteIntoDB(Kitchen k) {
		kDao.pasteIntoDB(k);
		
	}

	public Kitchen findByid(int id) {
		return kDao.findByid(id);
	}

	public void deleteFromDb(Kitchen k) {
		kDao.deleteFromDb(k);
		
	}

	public List<Kitchen> getAll() {
		return kDao.getAll();
	}
}
