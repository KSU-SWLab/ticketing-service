package org.swlab.swcinema.domain.reservation.model.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.swlab.swcinema.domain.cinema.model.entity.Seat;
import org.swlab.swcinema.domain.film.model.entity.Round;
import org.swlab.swcinema.domain.reservation.model.Status;

@Entity
public class RoundSeat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private Status status;

	@OneToOne
	@JoinColumn(name = "round_id")
	private Round round;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seat_id")
	private Seat seat;

	protected RoundSeat() {
	}
}
