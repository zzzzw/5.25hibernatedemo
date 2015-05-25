package testsrc.util;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.Test;

import util.HibernateUtil;

public class HibernateUtilTest 
{
	@Test  
	public void testGetSession() {  
	    Session stion=HibernateUtil.getSession();  
	    System.out.println(stion);  
	}  

}
