package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	private static List<Topic> list = null;

	static {
		list = new ArrayList<>(Arrays.asList(
					new Topic(1, "topic1", "description1"),
					new Topic(2, "topic2", "description2"),
					new Topic(3, "topic3", "description3"),
					new Topic(4, "topic4", "description4")
					));
	}
	
	public Topic getTopic(Integer id) {
		return getMockData().stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public List<Topic> getAllTopics(){
		return getMockData();
	}
	
	private List<Topic> getMockData() {
		return list;
	}

	public void addTopic(Topic topic) {
		list.add(topic);
	}

	public void updateTopic(Topic topic, Integer id) {
		Topic t = getTopic(id);
		t.setId(topic.getId());
		t.setName(topic.getName());
		t.setDescription(topic.getDescription());
	}

	public void deleteTopic(Integer id) {
		getMockData().remove(getTopic(id));
	}

}
