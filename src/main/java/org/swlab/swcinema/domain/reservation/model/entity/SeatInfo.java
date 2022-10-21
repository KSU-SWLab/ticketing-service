package org.swlab.swcinema.domain.reservation.model.entity;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.swlab.swcinema.domain.cinema.model.Rank;

@Embeddable
public class SeatInfo {
	@Enumerated(EnumType.STRING)
	private Rank seatRank;

	private int price;

	private int rowAlpha;

	private int seatNum;
}
