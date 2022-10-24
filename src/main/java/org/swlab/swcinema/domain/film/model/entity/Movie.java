package org.swlab.swcinema.domain.film.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.swlab.swcinema.domain.film.model.Age;
import org.swlab.swcinema.domain.film.model.Genre;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	@Enumerated(EnumType.STRING)
	private Genre genre;

	@Enumerated(EnumType.STRING)
	private Age age;

	private int runtime;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	protected Movie() {
	}
}
