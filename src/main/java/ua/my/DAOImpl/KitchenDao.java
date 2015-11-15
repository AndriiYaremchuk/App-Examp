package ua.my.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ua.my.DAOInterface.GetStaffInterface;
import ua.my.DAOInterface.KitchenDaoInterface;
import ua.my.model.Kitchen;
import ua.my.model.Staff;

@Repository
public class KitchenDao extends MainDaoDb<Kitchen> implements KitchenDaoInterface {
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Kitchen> getAll() {
		return em.createQuery("From Kitchten").getResultList();
	}

}
