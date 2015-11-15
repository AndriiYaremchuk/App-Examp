package ua.my.DAOInterface;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface DaoBasicInterface <T>{
	@Transactional
	void pasteIntoDB (T t);
	T findByid (int id);
	@Transactional
	void deleteFromDb (T t);
	List<T> getAll();
}
