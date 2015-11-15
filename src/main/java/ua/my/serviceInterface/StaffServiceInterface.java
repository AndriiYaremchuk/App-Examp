package ua.my.serviceInterface;

import java.util.List;

import ua.my.model.Staff;

public interface StaffServiceInterface extends MainServiceInterface<Staff> {
	String getStaffAge(int id);
	void pasteIntoDB(Staff s);
	Staff findByid(int id);
	void deleteFromDb(Staff s);
	List<Staff> getAll();
}
