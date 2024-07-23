package com.example.demo.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class NewWord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String english;
 @Column(columnDefinition = "nvarchar(50)")
 private String vietnamese;
 @DateTimeFormat(pattern = "yyyy-MM-dd")
 private LocalDate newdate = LocalDate.now();
 
public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getEnglish() {
	return english;
}



public void setEnglish(String english) {
	this.english = english;
}



public String getVietnamese() {
	return vietnamese;
}



public void setVietnamese(String vietnamese) {
	this.vietnamese = vietnamese;
}



public LocalDate getNewdate() {
	return newdate;
}



public void setNewdate(LocalDate newdate) {
	this.newdate = newdate;
}



public NewWord() {
	super();
}



public NewWord(String english, String vietnamese) {
	super();
	this.english = english;
	this.vietnamese = vietnamese;
}



@Override
public String toString() {
	return "NewWord [ Id :: " + getId() + "English :: " + getEnglish() + " Vietnamese :: " + getVietnamese()
			+ "Newdate :: " + getNewdate() + "]";
}
 
}
