package entidades;

public class Usuario {
    private String usuario;
    private Integer ID;
    private String senha;

    public Usuario() {

    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(Integer ID, String senha, String usuario) {
        this.ID = ID;
        this.senha = senha;
        this.usuario= usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   public static void MostrarMenu(){
       System.out.println("_________________________________________");
       System.out.println("|                                        |");
       System.out.println("|    Projeto de Cadastro de Usuarios     |");
       System.out.println("|                                        |");
       System.out.println("-----------------------------------------");
       System.out.println("|        1- Cadastrar Usuario            |");
       System.out.println("|        2- Remover Usuario              |");
       System.out.println("|        3- Entrar na conta              |");
       System.out.println("|        4- Painel Admin                 |");
       System.out.println("|        5- Sair                         |");
       System.out.println("-----------------------------------------");
   }
}

