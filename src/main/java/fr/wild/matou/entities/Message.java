package fr.wild.matou.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messages")
public class Message {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=14)
	private String pseudo;
	
	@Column(length=8000)
	private String message;
	
	private boolean mumble = false;
	
	public Message() {}
	
	public Message(String pseudo, String message) {
		this.pseudo = pseudo;
		this.message = message;
	}
	
	public Message(String pseudo, String message, boolean mumble) {
		this.pseudo = pseudo;
		this.message = message;
		this.mumble = mumble;
	}


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean isMumble() {
		return mumble;
	}

	public void setMumble(boolean mumble) {
		this.mumble = mumble;
	}
	
}
