package ua.my.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.my.DAOInterface.BarDaoInterface;
import ua.my.DAOInterface.StaffDaoInterface;
import ua.my.model.Bar;
import ua.my.serviceInterface.BarServiceInterface;

@Service("barService")
public class BarService implements BarServiceInterface {
	@Autowired
	private StaffDaoInterface stDao;

	@Autowired
	private BarDaoInterface bDao;

	public String getAlcoholMenu(int id) {
		return bDao.getAll().get(id).getLiquorMenu();
	}

	public String getNonAlcoholMenu(int id) {
		return bDao.getAll().get(id).getNonAlcoholigMenu();
	}

	public String isInAlcoholMenu(String str) {
		for (Bar b : bDao.getAll())
			if (b.getLiquorMenu().equalsIgnoreCase(str)) {
				return "Here's your drink!";
			}
		return "Such drink is missing in our menu";
	}

	public String isInNonAlcoholMenu(String str) {
		for (Bar b : bDao.getAll())
			if (b.getNonAlcoholigMenu().equalsIgnoreCase(str)) {
				return "Yuor search is rewarded!";
			}

		return "Such drink is missing in our menu";
	}

	public Set<String> randomAlcoholMenu (){
		Random rand = new Random();
		Set<String> list = new HashSet<String>();
		List<Bar> barList = bDao.getAll();
		String s;
		for (int i = 0; i <10; i++){
			s = barList.get(rand.nextInt(10)).getLiquorMenu();
			list.add(s);
		}
		return list;
	}
	
	public String getStaffById (int id){
		return stDao.findByid(id).toString();
	}
	
	public void pasteIntoDB(Bar b) {
		bDao.pasteIntoDB(b);

	}

	public Bar findByid(int id) {
		return bDao.findByid(id);
	}

	public void deleteFromDb(Bar t) {
		bDao.deleteFromDb(t);

	}

	public List<Bar> getAll() {
		return bDao.getAll();
	}

}
