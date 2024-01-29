package com.kodnest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Bike;
import com.kodnest.entity.Student;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
		System.out.println(session + "sucess");

      Transaction tr = session.beginTransaction();// transaction started

        Bike bike = new Bike("KTM", 3);

        session.save(bike);
        Student student = new Student(1, "john", bike);
        session.save(student);

        tr.commit(); // commit
        session.close();
        factory.close();
    }
}







