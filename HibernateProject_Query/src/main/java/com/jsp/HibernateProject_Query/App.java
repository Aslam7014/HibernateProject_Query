package com.jsp.HibernateProject_Query;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Movie.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        
        Query<Movie> query = session.createQuery("FROM Movie");
        List<Movie> movies = query.list();
        for( Movie movie : movies) {
        	System.out.println(movie);
        	
        	tr.commit();
        	session.close();
        	sf.close();
        }
    }
}
