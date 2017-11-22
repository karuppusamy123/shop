package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Emp {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("NAME:");
		String name = bf.readLine();
		System.out.print("EMAIL:");
		String email = bf.readLine();
		System.out.print("PHONE:");
		long phone = Long.valueOf(bf.readLine());

		Employee employee = new Employee(name, email, phone);
		System.out.print("ID:" + " " + employee.getId());
		System.out.print("NAME:" + " " + employee.getName());
		System.out.print("EMAILID:" + " " + employee.getEmail());
		System.out.print("PHONE:" + " " + employee.getPhone());

		session.save(employee);
		session.getTransaction().commit();

		session.close();

	}

}
