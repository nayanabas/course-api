package com.example.courseapi.service;

import com.example.courseapi.Topic;
import com.example.courseapi.repository.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {

    @Autowired
    TopicRepo topicRepo;

    List<Topic> topicList = new ArrayList<>(Arrays.asList(
            new Topic("spring","spring framework","spring framework description"),
            new Topic("java","core java","core java description"),
            new Topic("javascript","javascript","javascript description")
    ));

    public List<Topic> getAllTopic(){
        return (List<Topic>) topicRepo.findAll();
    }

    public Optional<Topic> getOneTopic(String id){
        return topicRepo.findById(id);
    }

    public void saveTopic(Topic topic) {
        topicRepo.save(topic);

    }

    public void update(String id, Topic topic) {
       /*for(int i=0;i<topicList.size(); i++){
           if(topicList.get(i).getId().equals(id)){
               topicList.set(i,topic);
               return;
           }
       }*/
        topicRepo.save(topic);

    }

    public void deleteTopic(String id) {
//        topicList.removeIf(topic -> topic.getId().equals(id));
        topicRepo.deleteById(id);
    }
}
