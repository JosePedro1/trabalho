import java.util.List;
public class Usuario {
    private String nome;
    private String email;
List<Conta> contas;
List<Meta> metas;
List<Orcamento> orcamentos;
List<Investimento> investimentos;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

}
