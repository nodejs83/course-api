package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public Topic getTopic(Integer id) {
		return topicRepository.findById(id).get();
	}
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, Integer id) {
		topicRepository.save(topic);
	}

	public void deleteTopic(Integer id) {
		topicRepository.deleteById(id);
	}

}
