package br.com.marinafe.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    //recebe dados do usuário
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.name);
    }
}
