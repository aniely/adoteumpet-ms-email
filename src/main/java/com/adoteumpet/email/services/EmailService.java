package com.adoteumpet.email.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.adoteumpet.email.dtos.EmailDto;
import com.adoteumpet.email.entities.Email;
import com.adoteumpet.email.enums.StatusEmail;
import com.adoteumpet.email.mappers.EmailMapper;
import com.adoteumpet.email.repositories.EmailRepository;

@Service
public class EmailService {

	private EmailRepository repository;
	private	EmailMapper mapper;
	private JavaMailSender emailSender;

	
	@Autowired
	public EmailService(EmailRepository repository, EmailMapper mapper,JavaMailSender emailSender) {
		this.repository = repository;
        this.mapper = mapper;
        this.emailSender = emailSender;
       
	}
	
	public EmailDto enviarEmail(EmailDto dto) {
		Email email = mapper.toEntity(dto, new Email());
		email.setDataEnvio(LocalDateTime.now());
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(email.getEmailDe());
			message.setTo(email.getEmailPara());
			message.setSubject(email.getAssunto());
			message.setText(email.getTexto());
			emailSender.send(message);

			email.setStatusEmail(StatusEmail.ENVIADO);
		} catch (MailException e) {
			email.setStatusEmail(StatusEmail.ERRO);
		} finally {
			email = repository.save(email);
		}
		return mapper.toDTO(email);
	}
}
