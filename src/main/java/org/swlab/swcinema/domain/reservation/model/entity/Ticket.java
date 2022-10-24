package org.swlab.swcinema.domain.reservation.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.swlab.swcinema.domain.film.model.entity.Round;
import org.swlab.swcinema.domain.reservation.model.Status;
import org.swlab.swcinema.domain.user.model.entity.User;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private SeatInfo seatInfo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "round_id")
	private Round round;

	private Status status;

	private LocalDateTime movieTime;

	protected Ticket() {
	}
}
