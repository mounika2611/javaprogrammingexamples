package com.bloodconnect.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bloodconnect.Hibernate.util.HibernateUtil;
//import com.javawebtutor.hibernate.util.HibernateUtil;
import com.bloodconnect.model.Donar;

public class DonarLoginService {

    public boolean authenticateUser(String userId, String password) {
        Donar donar = getUserByUserId(userId);        
        if(donar!=null && donar.getDonarUserId().equals(userId) && donar.getPassword().equals(password)){
            return true;
        }else{ 
            return false;
        }
    }

    public Donar getUserByUserId(String userId) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        Donar user = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from User where userId='"+userId+"'");
            user = (Donar)query.uniqueResult();
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
    
    public List<Donar> getListOfUsers(){
        List<Donar> list = new ArrayList<Donar>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Donar").list();                        
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
