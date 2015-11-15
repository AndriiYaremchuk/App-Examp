package ua.my.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.my.DAOInterface.RespondDaoInterface;
import ua.my.model.Respond;
import ua.my.serviceInterface.RespondServiceInterface;

@Service
public class RespondService implements RespondServiceInterface {
	@Autowired
	private RespondDaoInterface rDao;

	
	public void pasteIntoDB(Respond r) {
		rDao.pasteIntoDB(r);
		
	}

	public Respond findByid(int id) {
		return (Respond) rDao.findByid(id);
	}

	public void deleteFromDb(Respond r) {
		rDao.deleteFromDb(r);
		
	}

	public List<Respond> getAll() {
		return rDao.getAll();
	}
}
