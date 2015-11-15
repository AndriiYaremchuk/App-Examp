package ua.my.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import ua.my.DAOInterface.HallDaoInterface;
import ua.my.model.Hall;

@Repository
public class HallDao extends MainDaoDb<Hall> implements HallDaoInterface {


	
	@SuppressWarnings("unchecked")
	@Override
	public List<Hall> getAll() {
		return getEm().createQuery("From Hall").getResultList();
	}
}
