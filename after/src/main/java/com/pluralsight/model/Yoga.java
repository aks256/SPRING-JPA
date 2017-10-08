package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

public class Yoga {

@Entity
@Table(name="yogas")
@NamedQueries({
	@NamedQuery(name=Yoga.FIND_YOGA_REPORTS, query="Select new com.pluralsight.model.YogaReport(g.minutes, e.minutes, e.activity) " +
				"from Yoga g, Exercise e where g.id = e.yoga.id"),
	@NamedQuery(name=Yoga.FIND_ALL_YOGAS, query="Select g from Yoga g")			
	
})
public class Goal {
	
	public static final String FIND_ALL_YOGAS = "findAllYogas";
	public static final String FIND_YOGA_REPORTS = "findYogaReports";
	
	@Id
	@GeneratedValue
	@Column(name="YOGA_ID")
	private Long id;

	@Range(min = 1, max = 120)
	@Column(name="MINUTES")
	private int minutes;
	
	@OneToMany(mappedBy="yoga", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Exercise> exercises = new ArrayList<Exercise>();
	
	public List<Exercise> getExercises() {
		return exercises;
	}

	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
}
