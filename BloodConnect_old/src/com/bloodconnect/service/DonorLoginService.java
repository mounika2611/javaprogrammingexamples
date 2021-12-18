package com.bloodconnect.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bloodconnect.Hibernate.util.HibernateUtil;


import com.bloodconnect.model.Donor;

public class DonorLoginService {

    public boolean authenticateUser(String userId, String password) {
        Donor donor = getUserByUserId(userId);        
        if(donor!=null && donor.getDonorUserId().equals(userId) && donor.getPassword().equals(password)){
            return true;
        }else{ 
            return false;
        }
    }

    public Donor getUserByUserId(String userId) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        Donor user = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from User where userId='"+userId+"'");
            user = (Donor)query.uniqueResult();
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
    
    public List<Donor> getListOfUsers(){
        List<Donor> list = new ArrayList<Donor>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Donor").list();                        
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
