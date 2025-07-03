package Modulo02;
import java.util.ArrayList;
import java.util.List;

public class extrato {
    private List<String> transcacoes = new ArrayList<>();
    
    public void adicionarTransacao(String descricao){
        transcacoes.add(descricao);
    }
    
    public List<String> obterExtrato(){
        return transcacoes;
    }
}
