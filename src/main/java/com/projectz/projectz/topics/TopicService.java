package com.projectz.projectz.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topics> topics = new ArrayList<Topics>();
	
	
	public TopicService() {
		super();
	    topics.add(new Topics("java","JavaAPI","The best selling course"));
	    topics.add(new Topics("dbms","RDBMS","The best selling course for SQL"));
	    topics.add(new Topics("node","Node JS","The best selling course for Node"));
	    topics.add(new Topics("node2","Node JS","The best selling course for Node2"));
	}



	public List<Topics> getAllTopics() {
        return topics;
	}
	
	public Topics getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public boolean addTopic(Topics topic) {
		return topics.add(topic);
	}
	
	public boolean updateTopic(String id, Topics topic_to_update) {
		
		for(Topics topic : topics) {
			if(topic.getId().equals(id)) {
				Integer index = topics.indexOf(topic);
				topics.set(index, topic_to_update);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteTopic(String id) {
		
		for(Topics topic : topics) {
			if(topic.getId().equals(id)) {
				topics.remove(topic);
				return true;
			}
		}
		return false;
	}
}
