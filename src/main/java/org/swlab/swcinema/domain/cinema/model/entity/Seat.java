package org.swlab.swcinema.domain.cinema.model.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.swlab.swcinema.domain.reservation.model.entity.SeatInfo;

@Entity
public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private SeatInfo information;

	@OneToOne
	@JoinColumn(name = "hall_id")
	private Hall hall;

	protected Seat() {
	}
}
