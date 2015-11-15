package ua.my.model;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import ua.my.model.Bar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.my.serviceImpl.BarService;
import ua.my.serviceInterface.BarServiceInterface;

public class App {
	
	public static void main(String[] args) {
		 ConfigurableApplicationContext context = new
		 ClassPathXmlApplicationContext("appContext.xml");
		
		 BarServiceInterface barserv = (BarService) context.getBean("barService");
		
		 Staff barman = new Staff ("Andy", 25, 5, "BurgerKing");
		 
		 Hall hall = new Hall(54, "from 8:00 till 22:00");
		 
		 Respond respond = new Respond ();
		 Bar bar = new Bar ( "Vodka", "Soda");
	
		
		 barserv.pasteIntoDB(bar);
		 //barserv.deleteFromDb(bar);

		// System.out.println(barserv.getAll());
		// System.out.println(service.getAuthorByName("Tolkin"));
		// BookService bService = (BookService) context.getBean("bookService");
		// Book b = new Book("Master");
		// System.out.println(service.getAuthorByName("Bulgakov").get(0));
		// b.setAuthor(service.getAuthorByName("Bulgakov").get(0));
		// bService.insertBook(b);
		 context.close();

	}
}
