package com.adoteumpet.email.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.adoteumpet.email.dtos.EmailDto;
import com.adoteumpet.email.entities.Email;
import com.adoteumpet.email.services.EmailService;

@Component
public class EmailConsumer {

	@Autowired
	EmailService emailService;
	
	@RabbitListener(queues = "${spring.rabbitmq.queue}")
	public void listen(@Payload EmailDto emailDto) {
		Email email = new Email();
		BeanUtils.copyProperties(emailDto, email);
		emailService.enviarEmail(emailDto);
		
	}
	
}
