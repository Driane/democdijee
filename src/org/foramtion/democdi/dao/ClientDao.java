package org.foramtion.democdi.dao;

import javax.annotation.PostConstruct;

public class ClientDao implements IClientDao {

	@Override
	public String insertClient() {
		return "Création client en BDD avec JDBC pur";
	}
	
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Après création du client");
	}

}
