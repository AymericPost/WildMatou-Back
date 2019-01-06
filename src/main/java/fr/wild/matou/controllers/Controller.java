package fr.wild.matou.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.wild.matou.entities.Message;
import fr.wild.matou.repositories.MessageRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class Controller {

	@Autowired
	MessageRepository repo;
	
	@PostMapping("/send")
	public Message miaulement(@RequestBody Message miaou) {
		if (miaou.getPseudo() == null || miaou.getPseudo() == "") miaou.setPseudo( "Anonyme") ;
		if (miaou.getMessage()  == null || miaou.getMessage() == "") return null;
		
		Message saveIt = miaou;
		return repo.save(saveIt);
	}
	
	@RequestMapping("/get")
	public List<Message> cacophonie() {
		return repo.findAll();
	}
	
// Ces fonctions serviront plus tard, quand il y aura plus à faire avec l'arrivée /send "miaulement(@RequestBody Message miaou)" .
// Par exemple, avec des fonctionalités appellées avec slash "/", ou un chuchotement(message pour un seul utilisateur).	
//	public Message miaou(String matou, String miaulement) {
//		Message miaou = new Message(matou, miaulement);
//		return repo.save(miaou);
//	}
//	
//	public Message miaou(String matou, String miaulement, boolean miou) {
//		Message miaou = new Message(matou, miaulement, miou);
//		return repo.save(miaou);
//	}
}
