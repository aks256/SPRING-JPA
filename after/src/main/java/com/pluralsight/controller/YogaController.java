package com.pluralsight.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.model.Yoga;
import com.pluralsight.model.YogaReport;
import com.pluralsight.service.GoalService;
import com.pluralsight.service.YogaService;

public class YogaController {

	@Autowired
	private YogaService yogaService;

	@RequestMapping(value = "addYoga", method = RequestMethod.GET)
	public String addYoga(Model model) {
		Yoga yoga = new Yoga();
		yoga.setMinutes(10);
		model.addAttribute("yoga", yoga);

		return "addYoga";
	}

	@RequestMapping(value = "addYoga", method = RequestMethod.POST)
	public String updateYoga(@Valid @ModelAttribute("yoga") Yoga yoga, BindingResult result) {

		System.out.println("result has errors: " + result.hasErrors());

		System.out.println("Yoga set: " + yoga.getMinutes());

		if (result.hasErrors()) {
			return "addGoal";
		} else {
			yogaService.save(yoga);
		}

		return "redirect:index.jsp";
	}

	@RequestMapping(value = "getyoga", method = RequestMethod.GET)
	public String getYogas(Model model) {
		List<Yoga> yogas = yogaService.findAllYogas();

		model.addAttribute("yoga", yogas);

		return "getyoga";
	}

	@RequestMapping(value = "getYogaReports", method = RequestMethod.GET)
	public String getYogaReports(Model model) {
		List<YogaReport> yogaReports = yogaService.findAllYogaReports();

		model.addAttribute("yogaReports", yogaReports);

		return "getyogaReports";
	}
}
