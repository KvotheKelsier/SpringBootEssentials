package com.bootessentials.ControllerTopic;

import com.bootessentials.TopicModel.Topic;
import com.bootessentials.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> returnTopcs(){
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public  Topic getTopic(@PathVariable  String id){
        return topicService.getSingleTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topisc")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}

