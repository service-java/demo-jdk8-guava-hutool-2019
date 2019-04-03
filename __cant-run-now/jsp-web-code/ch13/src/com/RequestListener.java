package com;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class RequestListener implements ServletRequestListener {

	synchronized  public void requestInitialized(ServletRequestEvent sre)
	{
		try
		{			
		    FileWriter file=new FileWriter("c:\\requestLog.txt",true);
   	 	    PrintWriter out=new PrintWriter(file);
   	 	    HttpServletRequest request=(HttpServletRequest)sre.getServletRequest();
   	    	out.println( new Date()+"  "+request.getRemoteAddr()
   	    		         +"   "+request.getRequestURI());
   	 	    out.close();
   	 	}catch(Exception e)
   	 	{
   	 		System.out.println(e);
   	 		}
   	 	
		}
	public void requestDestroyed(ServletRequestEvent sre)
	{		
	
	}
}
