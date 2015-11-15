package ua.my.serviceInterface;

import java.util.List;

import ua.my.model.Kitchen;

public interface KitchenServiceInterface extends MainServiceInterface<Kitchen> {
	String getVeganlMenu (int id);
	String getClassicMenu (int id);
	String getStaffById (int id);
	void pasteIntoDB(Kitchen k);
	Kitchen findByid(int id);
	void deleteFromDb(Kitchen k);
	List<Kitchen> getAll();
}
