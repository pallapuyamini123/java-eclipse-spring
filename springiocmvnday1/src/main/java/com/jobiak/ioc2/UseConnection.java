package com.jobiak.ioc2;

import com.jobiak.ioc.NewConnection;

public class UseConnection {
	public UseConnection() {
		NewConnection con=new NewConnection();
		con.getConnection();
		System.out.println("Connection obtained in "+this.getClass());
	}

}
