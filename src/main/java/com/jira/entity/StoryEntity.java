package com.jira.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StoryEntity {
	@Id
	private Integer storyId;
	private String summary;
	private String assignedTo;
	private Integer storyPoints;
	private Integer sprintNumber;
	private String label;
	private String discription;

	public StoryEntity() {
		super();

	}

	public StoryEntity(Integer storyId, String summary, String assignedTo, Integer storyPoints, Integer sprintNumber,
			String label, String discription) {
		super();
		this.storyId = storyId;
		this.summary = summary;
		this.assignedTo = assignedTo;
		this.storyPoints = storyPoints;
		this.sprintNumber = sprintNumber;
		this.label = label;
		this.discription = discription;
	}

	public Integer getStoryId() {
		return storyId;
	}

	public void setStoryId(Integer storyId) {
		this.storyId = storyId;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public Integer getStoryPoints() {
		return storyPoints;
	}

	public void setStoryPoints(Integer storyPoints) {
		this.storyPoints = storyPoints;
	}

	public Integer getSprintNumber() {
		return sprintNumber;
	}

	public void setSprintNumber(Integer sprintNumber) {
		this.sprintNumber = sprintNumber;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "StoryEntity [storyId=" + storyId + ", summary=" + summary + ", assignedTo=" + assignedTo
				+ ", storyPoints=" + storyPoints + ", sprintNumber=" + sprintNumber + ", label=" + label
				+ ", discription=" + discription + "]";
	}

	

}
