package com.adoteumpet.email.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.adoteumpet.email.enums.StatusEmail;

 
@Entity
@Table(name = Email.TABLE_NAME)
public class Email implements Serializable  {
    public static final String TABLE_NAME = "tb_email";
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String  usuarioRef;
	private String emailDe;
	private String emailPara;
	private String assunto;
	@Column(columnDefinition="TEXT")
	private String texto;
	private LocalDateTime dataEnvio;
	private StatusEmail  statusEmail;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuarioRef() {
		return usuarioRef;
	}
	public void setUsuarioRef(String usuarioRef) {
		this.usuarioRef = usuarioRef;
	}
	public String getEmailDe() {
		return emailDe;
	}
	public void setEmailDe(String emailDe) {
		this.emailDe = emailDe;
	}
	public String getEmailPara() {
		return emailPara;
	}
	public void setEmailPara(String emailPara) {
		this.emailPara = emailPara;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(LocalDateTime dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public StatusEmail getStatusEmail() {
		return statusEmail;
	}
	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}
	
	
	
}