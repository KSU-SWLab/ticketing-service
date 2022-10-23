package org.swlab.swcinema.domain.filmOffical.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.swlab.swcinema.domain.filmOffical.model.Job;

@Entity
public class People {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private Job job;

	protected People() {
	}
}
