package ua.my.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ua.my.DAOInterface.StaffDaoInterface;
import ua.my.model.Staff;

@Repository
public class StaffDao extends MainDaoDb<Staff> implements StaffDaoInterface {

	@SuppressWarnings("unchecked")
	@Override
	public List<Staff> getAll() {
		return em.createQuery("From Staff").getResultList();
	}

}
