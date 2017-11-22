package org.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Libsolution {

	public static void main(String[] args) throws IOException {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		for(int i=0;i<3;i++){
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("MOVIE NAME:");
		String name = bf.readLine();
		System.out.println("MOVIE DIRECTOR:");
		String director = bf.readLine();
		System.out.println("Ticketcount:");
		long count = Long.valueOf(bf.readLine());
		System.out.println("price:");
		float price = Float.valueOf(bf.readLine());
		System.out.println("Genre:");
		String genre = bf.readLine();

		Library library = new Library(name, director, count,price,genre);
		System.out.println("TheaterID:" + " " + library.getId());
		System.out.println("MovieNAME:" + " " + library.getName());
		System.out.println("Director:" + " " + library.getDirector());
		System.out.println("NoOfcount:" + " " + library.getCount());
		System.out.println("price:" + " " + library.getPrice());
		System.out.println("genre:" + " " + library.getGenre());
		

		session.save(library);
		session.getTransaction().commit();
        }
		session.close();
	}

}
