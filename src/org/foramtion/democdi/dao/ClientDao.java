package org.foramtion.democdi.dao;

import javax.annotation.PostConstruct;

public class ClientDao implements IClientDao {

	@Override
	public String insertClient() {
		return "Cr�ation client en BDD avec JDBC pur";
	}
	
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Apr�s cr�ation du client");
	}

}
