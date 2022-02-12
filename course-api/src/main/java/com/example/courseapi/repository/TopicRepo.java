package com.example.courseapi.repository;

import com.example.courseapi.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepo extends CrudRepository<Topic,String> {
}
