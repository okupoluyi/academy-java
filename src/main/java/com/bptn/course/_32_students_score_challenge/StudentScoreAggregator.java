package com.bptn.course._32_students_score_challenge;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreAggregator {

	public static void calculateAverage(Student student, Map<String, Double> scores) {
		double sum;

		for (Double score : scores.values()) {

		}
	}

	public static void main(String[] args) {
		Map<String, Double> scores = new HashMap<>();
		scores.put("course1", 90.0);
		scores.put("course2", 75.5);
		scores.put("course3", 98.0);

		Student s1 = new Student("Student One", scores);
		calculateAverage(s1, scores);
	}

}
