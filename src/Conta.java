import java.util.List;

public class Conta {
     String banco;
     String descricao;
    List<Despesa> despesas;
    List<Receita> receitas;

    public Conta(String banco, String descricao) {
        this.banco = banco;
        this.descricao = descricao;
    }
}
