package com.jobiak.ioc;

public class NewConnection {
	public NewConnection getConnection() {
		System.out.println("Providing the Connection....");
		return new NewConnection();
	}

}
