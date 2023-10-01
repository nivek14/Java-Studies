package ClassesMetodos;

public class User {
    public String nome;
    public String email;

    public User(){
        this("");
    }

    public User(String nome){
        this(nome, "");
    }
    public User(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

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

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
