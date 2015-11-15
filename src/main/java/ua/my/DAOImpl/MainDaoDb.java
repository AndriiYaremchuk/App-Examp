package ua.my.DAOImpl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import ua.my.DAOInterface.DaoBasicInterface;

public class MainDaoDb<T> implements DaoBasicInterface<T> {

	@PersistenceContext(unitName = "primary")
	protected EntityManager em;
	
	@Transactional
	public void pasteIntoDB(T t) {
		em.persist(t);
	}

	public T findByid(int id) {
		return em.find(getEntityClass(), id);
	}

	@Transactional
	public void deleteFromDb(T t) {
		em.remove(t);
	}

	public List<T> getAll() {
		return null;
	}

	@SuppressWarnings("unchecked")
	protected Class<T> getEntityClass() {
		final Type type = getClass().getGenericSuperclass() instanceof ParameterizedType ? getClass()
				.getGenericSuperclass() : getClass().getSuperclass()
				.getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			final ParameterizedType paramType = (ParameterizedType) type;
			return (Class<T>) paramType.getActualTypeArguments()[0];
		} else
			throw new IllegalArgumentException(
					"Could not guess entity class by reflection");
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
