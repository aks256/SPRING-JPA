package com.pluralsight.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.model.Yoga;
import com.pluralsight.model.YogaReport;
import com.pluralsight.repository.GoalRepository;
import com.pluralsight.repository.YogaRepository;




@Service("yogaService")
public class YogaServiceImpl implements YogaService {

	
		@Autowired
		private YogaRepository yogaRepository;

		@Transactional
		public Yoga save(Yoga yoga) {
		return yogaRepository.save(yoga);
		}

		public List<Yoga> findAllYogas() {
			return yogaRepository.loadAll();
		}

		public List<YogaReport> findAllYogaReports() {
			return yogaRepository.findAllYogaReports();
		}

		@Override
		public List<YogaReport> findAllGoalReports() {
			// TODO Auto-generated method stub
			return null;
		}

		
	}
