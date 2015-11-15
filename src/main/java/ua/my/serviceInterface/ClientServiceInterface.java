package ua.my.serviceInterface;

import java.util.List;

import ua.my.model.Client;

public interface ClientServiceInterface extends MainServiceInterface<Client> {
	String getClientName(int id);
	String getClientAge(int id);
	String getInfoByName(String name);
	void pasteIntoDB(Client c);
	Client findByid(int id);
	void deleteFromDb(Client c);
	List<Client> getAll();
}
