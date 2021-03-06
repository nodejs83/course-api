package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicsService topicsService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicsService.getAllTopics();
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable Integer id){
		return topicsService.getTopic(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic){
		 topicsService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable Integer id){
		 topicsService.updateTopic(topic, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable Integer id){
		 topicsService.deleteTopic(id);
	}
	

}
