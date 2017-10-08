package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.model.Yoga;
import com.pluralsight.model.YogaReport;

public class YogaRepositoryImpl {

	@PersistenceContext
	private EntityManager em;

	public Yoga save(Yoga yoga) {

		em.persist(yoga);

		em.flush();

		return yoga;
	}

	public List<Yoga> loadAll() {
		// Query query = em.createQuery("Select g from Goal g");

		TypedQuery<Yoga> query = em.createNamedQuery(Yoga.FIND_ALL_YOGAS, Yoga.class);

		return query.getResultList();
	}

	public List<YogaReport> findAllYogaReports() {
		//Query query = em.createQuery("Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) " +
		//		"from Goal g, Exercise e where g.id = e.goal.id");
		
		TypedQuery<YogaReport> query = em.createNamedQuery(Yoga.FIND_YOGA_REPORTS, YogaReport.class);
		
		return query.getResultList();
	}

}
