package br.com.ApplicationStudy.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

// uma controller irá processar as requisições http e atuar como a primeira camada de acesso do usuário a aplicação
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;
    
    // usando o RequestBody, por baixo dos panos ele já irá setar os dados em um objeto do tipo UserModel
    // usando o reponseEntity conseguimos retornar algo que deu certo ou errado na requisição
    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel){

        // verificando se existe um user com username já cadastrado no db
        UserModel user = this.userRepository.findByUsername(userModel.getUsername());

        // se sim irá retornar um erro
        if(user != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
        }

        // usando a lib bcrypt para criptografar a senha
        String passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());
        userModel.setPassword(passwordHashred);

        // se não existe iremos criar esse novo user
        user = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
        
    }

}
