package com.jira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jira.entity.StoryEntity;
@Repository
public interface StoryRepository extends JpaRepository<StoryEntity, Integer> {

}
