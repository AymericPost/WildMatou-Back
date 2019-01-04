package fr.wild.matou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.wild.matou.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
