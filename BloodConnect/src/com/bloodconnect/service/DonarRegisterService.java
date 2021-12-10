package com.bloodconnect.service;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bloodconnect.Hibernate.util.HibernateUtil;
import com.bloodconnect.model.Donar;


public class DonarRegisterService {
	
public boolean register(Donar donar){
	 Session session = HibernateUtil.openSession();
	 if(isUserExists(donar)) return false;	
	
	 Transaction tx = null;	
	 try {
		 tx = session.getTransaction();
		 tx.begin();
		 session.saveOrUpdate(donar);		
		 tx.commit();
	 } catch (Exception e) {
		 if (tx != null) {
			 tx.rollback();
		 }
		 e.printStackTrace();
	 } finally {
		 session.close();
	 }	
	 return true;
}

public boolean isUserExists(Donar donar){
	 Session session = HibernateUtil.openSession();
	 boolean result = false;
	 Transaction tx = null;
	 try{
		 tx = session.getTransaction();
		 tx.begin();
		 Query query = session.createQuery("from User where userId='"+donar.getDonarUserId()+"'");
		 Donar d = (Donar)query.uniqueResult();
		
		 
		 tx.commit();
		 if(d!=null) result = true;
	 }catch(Exception ex){
		 if(tx!=null){
			 tx.rollback();
		 }
	 }finally{
		 session.close();
	 }
	 return result;
}
}