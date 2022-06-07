package com.adoteumpet.email.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmailDto {

	@NotBlank
	private String  usuarioRef;
	@NotBlank
	@Email
	private String emailDe;
	@NotBlank
	@Email
	private String emailPara;
	@NotBlank
	private String assunto;
	@NotBlank
	private String texto;
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
	
	
}
