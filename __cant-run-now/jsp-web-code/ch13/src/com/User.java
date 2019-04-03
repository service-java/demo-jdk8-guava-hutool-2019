package com;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {
	
	private String name;
    private UserList ul=UserList.getInstance();

	public User() {	}
	
	public User(String name){
        this.name=name;
    }
	
	public void setName(String name){
        this.name=name;
    }
	
    public String getName(){
        return name;
    }    

	

	public void valueBound(HttpSessionBindingEvent arg0) {
		
		ul.addUser(name);
	}

	public void valueUnbound(HttpSessionBindingEvent arg0) {
		ul.removeUser(name);
		
	}

}
