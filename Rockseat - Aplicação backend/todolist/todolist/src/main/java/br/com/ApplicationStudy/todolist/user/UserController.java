package br.com.ApplicationStudy.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// uma controller irá processar as requisições http e atuar como a primeira camada de acesso do usuário a aplicação
@RestController
@RequestMapping("/users")
public class UserController {
    
    // usando o RequestBody, por baixo dos panos ele já irá setar os dados em um objeto do tipo UserModel
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){;
        System.out.println(userModel.getName());
    }

}
