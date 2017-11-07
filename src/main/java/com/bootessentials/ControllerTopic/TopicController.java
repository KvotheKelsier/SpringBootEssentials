package com.bootessentials.ControllerTopic;

import com.bootessentials.TopicModel.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> returnTopcs(){
        return Arrays.asList(new Topic("ABC","123"), new Topic("Qwe","12"),new Topic("Adfds","3453"),new Topic("qweqw","123"));
    }
}

