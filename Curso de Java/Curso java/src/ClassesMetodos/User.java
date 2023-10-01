package ClassesMetodos;

public class User {
    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {
        boolean nome = false;
        boolean email= false;
        if (obj instanceof User) {
            User outro = (User) obj;
            nome = outro.nome.equals(this.nome);
            email = outro.email.equals(this.email);
        }
        return nome && email;
    }

}
