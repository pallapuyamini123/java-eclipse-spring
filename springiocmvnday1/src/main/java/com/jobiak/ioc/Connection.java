package com.jobiak.ioc;

public class Connection {
	public Connection getConnection() {
		System.out.println("Providing the Connection....");
		return new Connection();
	}

}
