package com.bloodconnect.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bloodconnect.Hibernate.util.HibernateUtil;
import com.bloodconnect.model.Recipient;

//import com.javawebtutor.hibernate.util.HibernateUtil;


public class RecipientLoginService {

    public boolean authenticateUser(String userId, String password) {
        Recipient recipient = getUserByUserId(userId);        
        if(recipient!=null && recipient.getRecipientUserId().equals(userId) && recipient.getPassword().equals(password)){
            return true;
        }else{ 
            return false;
        }
    }

    public Recipient getUserByUserId(String userId) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        Recipient user = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Recipient where userId='"+userId+"'");
            user = (Recipient)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user;
    }
    
    public List<Recipient> getListOfUsers(){
        List<Recipient> list = new ArrayList<Recipient>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Recipient").list();                        
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
}
