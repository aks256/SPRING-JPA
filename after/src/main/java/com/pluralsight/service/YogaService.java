package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.model.Yoga;
import com.pluralsight.model.YogaReport;

public interface YogaService {

	Yoga save(Yoga yoga);

	List<Yoga> findAllYogas();

	List<YogaReport> findAllGoalReports();

	List<YogaReport> findAllYogaReports();

}
