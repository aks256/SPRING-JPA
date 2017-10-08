package com.pluralsight.model;

public class YogaReport {

	private int yogaMinutes;
	private int exerciseMinutes;
	private String exerciseActivity;

	YogaReport(int yogaMinutes, int exerciseMinutes, String exerciseActivity) {
		this.yogaMinutes = yogaMinutes;
		this.exerciseMinutes = exerciseMinutes;
		this.exerciseActivity = exerciseActivity;
	}

	public String getExerciseActivity() {
		return exerciseActivity;
	}

	public int getExerciseMinutes() {
		return exerciseMinutes;
	}

	public int getYogaMinutes() {
		return yogaMinutes;
	}

	public void setYogaMinutes(int yogaMinutes) {
		this.yogaMinutes = yogaMinutes;
	}

	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}

	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}

}
