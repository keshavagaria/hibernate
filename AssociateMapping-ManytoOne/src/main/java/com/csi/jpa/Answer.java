package com.csi.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
@Id
@GeneratedValue
private int id;

public Question getQues() {
	return ques;
}

public void setQues(Question ques) {
	this.ques = ques;
}

private String answer;
@ManyToOne(targetEntity=Question.class)
private Question ques;
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAnswer() {
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}

}
