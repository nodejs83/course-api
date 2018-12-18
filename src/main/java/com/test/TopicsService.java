package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	
	
	public Topic getTopic(Integer id) {
		return getMockData().stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	
	public List<Topic> getAllTopics(){
		return getMockData();
	}
	
	private List<Topic> getMockData() {
		return Arrays.asList(
				new Topic(1, "topic1", "description1"),
				new Topic(2, "topic2", "description2"),
				new Topic(3, "topic3", "description3"),
				new Topic(4, "topic4", "description4")
				);
	}

}
