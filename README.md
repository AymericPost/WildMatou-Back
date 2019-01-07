# WildMatou-Back


WildMatou est une chat-box développée à titre de projet personnel. Ce site permet de discuter avec tous ceux qui y ont accés.

Ce dépot contient la partie serveur back-end. La partie présentation front-end est sur le dépot [WildMatou-Front](https://github.com/AymericPost/WildMatou-Front).

![Chatbox Wild-Matou](https://i.ibb.co/MpzNcRR/matoubox.png)

## Execution

### Pré-requis

- MySQL
- Apache Tomcat
- Maven

### Installation

1) Téléchargez le projet ou entrez dans le terminal :
```Shell
git clone https://github.com/AymericPost/WildMatou-Back.git
```
2) Créez un utilisateur et une base de donnée pour l'application :
```Shell
mysql -u root -p
```

```SQL
CREATE DATABASE example_db;
CREATE USER "springdao"@"localhost" IDENTIFIED BY "Daodada0!";
GRANT ALL ON example_db.* TO 'springdao'@'localhost'; 
```

### Compiler l'application

Lancez le serveur et la compilation depuis le dossier téléchargé avec la commande :
```Shell
mvn spring-boot:run
```

Pour héberger cette chatbox sur votre réseau local :

1) Récupérez votre adresse ip avec par exemple la commande ```ifconfig```.
2) Rendez vous sur le fichier ```/src/main/resources/application.properties```
3) Ajoutez la ligne
```Java
server.adress=XXX.XXX.XXX.XXX
```
Remplacez "XXX.XXX.XXX.XXX" par votre IP.

4) Lancez le serveur et la compilation depuis le dossier téléchargé avec la commande :
```Shell
mvn spring-boot:run
```

N'oubliez pas de configurer [WildMatou-Front](https://github.com/AymericPost/WildMatou-Front) pour héberger la chatbox en local (voyez [WildMatou-Front/README.md](https://github.com/AymericPost/WildMatou-Front/blob/master/README.md)).

## Evolution du projet

~~Le seul verbe HTTP utilisé est GET.~~ POST est maintenant utilisé pour l'enregistrement de nouveaux messages. Dans des futures versions, le vocaburaire HTTP sera étoffé.

Les prochaines versions incluront :

1) Support des smileys (peut être aussi des emojis) avec possibilité de rajouter des smileys personnalisés
2) Support des liens/url
3) Notification de nouveaux messages
4) Salons de discussion
5) Authentification
6) Messages privés
7) Support des images

## Frameworks utilisés

- [Spring](https://spring.io/)
- [Hibernate](http://hibernate.org/)
