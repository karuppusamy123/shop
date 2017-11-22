package org.library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "TICKETRESERVATION")
public class Library {

	@Id
	@GeneratedValue
	@Column(name = "Theater_Id", length = 100, nullable = false)
	private int id;
	@Column(name = "Movie_NAME", length = 150, nullable = false)
	private String name;
	@Column(name = "Director", length = 100, nullable = false, unique = true)
	private String director;
	@Column(name = "Total_Number_of_ticketd", length = 10, nullable = false, unique = true)
	private long count;
	@Column(name = "Ticket_price", length = 100, nullable = true)
	private float price;
	@Column(name = "Genre", length = 100, nullable = true)
	private String genre;

	public Library(String name, String director, long count,float price,String genre) {

		this.name = name;
		this.director = director;
		this.count = count;
		this.price=price;
		this.genre=genre;

	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String Author) {
		this.director = director;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
	public float getPrice() {
		return  price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
