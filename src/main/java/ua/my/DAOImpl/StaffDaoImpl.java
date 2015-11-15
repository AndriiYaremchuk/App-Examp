package ua.my.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ua.my.DAOInterface.StaffDaoInterface;
import ua.my.model.Staff;


//@Repository
public class StaffDaoImpl extends MainDaoDb<Staff> implements StaffDaoInterface {

//	@Override
//	public List<Staff> getAll() {
//		return em.createQuery("From Staff").getResultList();
//	}

}
