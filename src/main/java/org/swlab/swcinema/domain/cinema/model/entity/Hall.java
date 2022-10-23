package org.swlab.swcinema.domain.cinema.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hall {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int totalSeat;

	private int floor;

	private int hallNumber;

	protected Hall() {
	}

	public Hall(int totalSeat, int floor, int hallNumber) {
		this.totalSeat = totalSeat;
		this.floor = floor;
		this.hallNumber = hallNumber;
	}

	public Long getId() {
		return id;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public int getFloor() {
		return floor;
	}

	public int getHallNumber() {
		return hallNumber;
	}
}
