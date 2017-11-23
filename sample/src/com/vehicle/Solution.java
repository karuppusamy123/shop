package com.vehicle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Vehicle vehicle=new Vehicle();
		vehicle.setName("car");
		TwoWheeler two=new TwoWheeler();
		two.setName("bike");
		two.setSteeringHandle("bikeSteering");
		FourWheeler four=new FourWheeler();
		four.setName("car");
		four.setSteeringWheel("carSteering");
		session.beginTransaction();
		session.save(vehicle);
		session.save(two);
		session.save(four);
		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
