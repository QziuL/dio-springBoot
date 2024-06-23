package qziul_web_api.repository;

import org.springframework.stereotype.Repository;
import qziul_web_api.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if(user.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário.", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - List usuários no sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("luiz", "password"));
        users.add(new User("ronildo", "senha"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para encontrar um usuário.", id));
        return new User("luiz", "password");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para encontrar um usuário.", username));
        return new User("luiz", "password");
    }
}
