package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Editor;

public interface EditorRepo extends JpaRepository<Editor, Integer> {
	
	List<Editor> findBySurveyIdSurveyId(int id);
	
	Editor findByEmail(String email);
	
	

}
