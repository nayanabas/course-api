package com.example.courseapi.topics;

import com.example.courseapi.Topic;
import com.example.courseapi.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class Topics {
    @Autowired
   private TopicService topicService;

    @GetMapping("/topics")
    List<Topic> getAllTopics(){

        return topicService.getAllTopic();

    }

    @GetMapping("/topics/{id}")
    Optional<Topic> getOneTopic(@PathVariable String id){
        return topicService.getOneTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    void saveTopic(@RequestBody Topic topic){
        topicService.saveTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
            void updateTopic(@RequestBody Topic topic , @PathVariable String id){
        topicService.update(id,topic);

    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
