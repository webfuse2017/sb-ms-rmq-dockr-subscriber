package com.webfuse.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.webfuse.model.Employee;

@Component
public class RabbitMQListener {

	@RabbitListener(queues = "${webfuse.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}