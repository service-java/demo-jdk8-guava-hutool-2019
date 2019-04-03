package com;


import java.util.Vector;
import java.util.Enumeration;

public class UserList
{
    private static final UserList userList=new UserList();
    private Vector<String> vector;
    
	private UserList()
	{
	    vector=new Vector<String>();
	}

	public static UserList getInstance()
	{
		return userList;
	}
    
    public void addUser(String name)
    {
        if(name!=null)
            vector.addElement(name);
    }
    
    public void removeUser(String name)
    {
        if(name!=null)
            vector.remove(name);
    }
    
    public Enumeration<String> getUserList()
    {
        return vector.elements();
    }
    
    public int getUserCount()
    {
        return vector.size();
    }
}

