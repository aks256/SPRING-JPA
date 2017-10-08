package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Yoga;
import com.pluralsight.model.YogaReport;

public interface YogaRepository {

	Yoga save(Yoga yoga);

	List<Yoga> loadAll();

	List<YogaReport> findAllYogaReports();
}
