package ua.my.serviceInterface;


import java.util.Set;

import org.springframework.stereotype.Service;

import ua.my.model.Bar;

public interface BarServiceInterface extends MainServiceInterface<Bar> {
	String getAlcoholMenu(int i);
	String getNonAlcoholMenu(int id);
	String isInAlcoholMenu(String str);
	String isInNonAlcoholMenu(String str);
	Set<String> randomAlcoholMenu(); 
	String getStaffById (int id);
}
