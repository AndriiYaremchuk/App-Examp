package ua.my.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ua.my.DAOInterface.BarDaoInterface;
import ua.my.model.Bar;

@Repository
public class BarDao extends MainDaoDb<Bar> implements
		BarDaoInterface {

	@SuppressWarnings("unchecked")
	@Override
	public List<Bar> getAll() {
		return em.createQuery("From Bar").getResultList();
	}
		
}
