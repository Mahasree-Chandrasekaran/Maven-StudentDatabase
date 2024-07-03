package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Test {

    public static void main(String[] args) {
        Student st = new Student("Loka", "Mbbs", 677);
        Transaction tr = null;

        try (Session ses = HbUtil.getSessionFactory().openSession()) {
            tr = ses.beginTransaction();

            // Update an existing student record
            Query query = ses.createQuery("update Student set name = :n where roll = :i");
            query.setParameter("n", "Udit Kumar");
            query.setParameter("i", 1);  // Assuming roll number 1 exists
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);

            // Persist the new student object
            ses.persist(st);

            // Commit the transaction
            tr.commit();
            System.out.println("Data saved successfully");

        } catch (Exception e) {
            if (tr != null) {
                tr.rollback();
            }
            e.printStackTrace();
        } 
    }
}
