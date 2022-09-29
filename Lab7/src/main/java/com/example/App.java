/*Write a program to create a tbale Agent with fields
 * (id,name,city,commission amount) using hibernate and add three rows 
 * in it ,read and display it
  */

package com.example;

import java.util.List;

//importing all the packages required for performing hibernate
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class App       //class APP
{
    public static void main( String[] args )     //main() class
    {
    	
    	/*--Making configuration--*/
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Agent.class);   //mentioning annotated class
        
        
        /*--Creating SessionFactory obj --*/
        SessionFactory sf=cfg.buildSessionFactory();
        
        
        /*--Creating Session obj to create session for mysql--*/
        Session ses=sf.openSession();
        
        
        /*--Creating transaction obj to execute transactions--*/
        Transaction tct=ses.beginTransaction();
        
        
        /*--creating Agent class obj to add data into the table--*/
        Agent ag=new Agent();
        
        
        /*--Adding data into Agent table through object ag--*/
        ag.setId(3);
        ag.setName("Pradeep Kumar");
        ag.setCity("Pune");
        ag.setCommission_amount(15);
        
        
        /*--Saving session data--*/
        ses.save(ag);
      
        
        /*--to read and display data from table--*/
        Query q=ses.createQuery("from Agent");
        List<Agent> a=q.list();
        System.out.println("---------Displaying Data From Agent table--------\n");
        for(Agent s1:a)
        {
        	System.out.println("Id: "+s1.getId()+"   Name: "+s1.getName()+"   City: "+s1.getCity()+"   Commission Amount: "+s1.getCommission_amount());
        }
        
        
        tct.commit();      //commiting the transaction to makes the changes permanent
         ses.close();      //closing the session
    }
}
/*--END-OF-PROGRAM--*/
