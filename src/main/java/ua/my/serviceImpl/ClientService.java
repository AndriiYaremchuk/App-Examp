package ua.my.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.my.DAOInterface.ClientDaoInterface;
import ua.my.model.Client;
import ua.my.serviceInterface.ClientServiceInterface;

@Service
public class ClientService implements ClientServiceInterface {

	@Autowired
	private ClientDaoInterface cDao;

	public String getClientName(int id) {
		return cDao.getAll().get(id).getName();
	}

	public String getClientAge(int id) {
		Integer i = cDao.getAll().get(id).getAge();
		return i.toString();
	}

	public String getInfoByName(String name) {
		for (Client c : cDao.getAll())
			if (c.getName().equalsIgnoreCase(name)) {
				return c.toString();
			}

		return "Such client is missing in our database";
	}

	public void pasteIntoDB(Client c) {
		cDao.pasteIntoDB(c);
	}

	public Client findByid(int id) {
		return cDao.findByid(id);
	}

	public void deleteFromDb(Client c) {
		cDao.deleteFromDb(c);

	}

	public List<Client> getAll() {
		return cDao.getAll();
	}

}
