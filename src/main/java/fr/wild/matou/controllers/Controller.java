package fr.wild.matou.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.wild.matou.entities.Message;
import fr.wild.matou.repositories.MessageRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class Controller {

	@Autowired
	MessageRepository repo;
	
	@RequestMapping("/send")
	public Message miaulement(String pseudo, String text) {
		if (pseudo == null || pseudo == "") pseudo = "Anonyme";
		if (text == null || text == "") return null;
		
		Message miaou = new Message(pseudo, text);
		return repo.save(miaou);
	}
	
	@RequestMapping("/get")
	public List<Message> cacophonie() {
		return repo.findAll();
	}
	

	public Message miaou(String matou, String miaulement) {
		Message miaou = new Message(matou, miaulement);
		return repo.save(miaou);
	}
	
	public Message miaou(String matou, String miaulement, boolean miou) {
		Message miaou = new Message(matou, miaulement, miou);
		return repo.save(miaou);
	}
}
