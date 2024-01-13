package com.projectz.projectz.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicsController {
    
	@Autowired
	private TopicService topicservice;
	
    @RequestMapping("/topics")
    public List<Topics> topics() {
    	
    	return topicservice.getAllTopics();
        
    }
    
    //This {id_of_topic} is subjective I can make it same as the variable name 
    // in the function like {id} but if I want it different than the variable name
    // than I need to add this in the as the argument to @Pathvariable
    @RequestMapping("/topics/{id_of_topic}")
	public Topics getTopicById(@PathVariable("id_of_topic") String id) {
		return topicservice.getTopicById(id);
	}
    
    @PostMapping("/topics")
    public boolean addTopic(@RequestBody Topics topic) {
    	return topicservice.addTopic(topic);
    }
    
    @PutMapping("/topics/{id}")
    public boolean putTopics(@PathVariable("id") String id, @RequestBody Topics topic) {
    	return topicservice.updateTopic(id, topic);
    }
    
    @DeleteMapping("/topics/{id}")
    public boolean deleteTopics(@PathVariable("id") String id) {
    	
    	return topicservice.deleteTopic(id);
    	
    }
}
