package ua.my.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ua.my.DAOInterface.RespondDaoInterface;
import ua.my.model.Respond;

@Repository
public class RespondDao extends MainDaoDb<Respond> implements RespondDaoInterface{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Respond> getAll() {
		return em.createQuery("From Respond").getResultList();
	}
}
