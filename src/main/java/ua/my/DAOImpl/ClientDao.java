package ua.my.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ua.my.DAOInterface.ClientDaoInterface;
import ua.my.model.Client;

@Repository
public class ClientDao extends MainDaoDb<Client> implements ClientDaoInterface {
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> getAll() {
		return em.createQuery("From Client").getResultList();
	}
	}
