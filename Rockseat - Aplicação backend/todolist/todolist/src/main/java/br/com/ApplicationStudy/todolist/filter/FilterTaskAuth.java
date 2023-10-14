package br.com.ApplicationStudy.todolist.filter;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.ApplicationStudy.todolist.user.IUserRepository;
import br.com.ApplicationStudy.todolist.user.UserModel;

@Component
public class FilterTaskAuth  extends OncePerRequestFilter{

    @Autowired
    private IUserRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
    throws ServletException, IOException {

        // pegar autenticação (user e senha)
        String authorization = request.getHeader("Authorization");

        String authEncoded = authorization.substring("Basic".length()).trim(); // removendo o basis e os espaços com o trim

        byte[] authDecode = Base64.getDecoder().decode(authEncoded); // convertendo a autenticação de base64 para bytes

        String authString = new String(authDecode); // convertendo os bytes para string
        
        String[] credentials = authString.split(":"); // separamos os dados a partir dos ":"
        String username = credentials[0];
        String password = credentials[1];

        // validar usuário
        UserModel user = this.userRepository.findByUsername(username);
        if(user == null){
            response.sendError(401);
        }
        // validar senha
        else{
            BCrypt.Result passwordVerify = BCrypt.verifyer().verify(password.toCharArray(), user.getPassword());
            if(passwordVerify.verified){
                filterChain.doFilter(request, response);
            }
            else{
                response.sendError(401);
            }
        }

        // seguir fluxo

        
    }


    
}
