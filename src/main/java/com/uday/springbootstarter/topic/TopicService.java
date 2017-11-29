package com.uday.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Java Language", "Java Programming Language"),
			new Topic("JSP", "JSP framework", "JSP Framework Description"),
			new Topic("HTML5", "HTML5 tutorial", "HTML5 Tutorial Description"),
			new Topic("JavaScript", "Javascript", "Javascript Description"));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

}
