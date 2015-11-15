package ua.my.serviceInterface;

import java.util.List;

import ua.my.model.Respond;

public interface RespondServiceInterface extends MainServiceInterface<Respond> {
	void pasteIntoDB(Respond r);
	Respond findByid(int id);
	void deleteFromDb(Respond r);
	List<Respond> getAll();
}
