package ua.my.serviceInterface;

import java.util.List;

import ua.my.model.Hall;

public interface HallServiceInterface extends MainServiceInterface<Hall> {
	String getShedule(int id);
	String getNumberOfSeats(int id);
	String getStaffById (int id);
	void pasteIntoDB(Hall h);
	Hall findByid(int id);
	void deleteFromDb(Hall t);
	List<Hall> getAll();
}
