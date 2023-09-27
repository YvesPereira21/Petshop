import java.util.ArrayList;
import java.util.List;

public class RelatorioLista {
    private List<Servico> servicos = new ArrayList<>();

    public void adicionaServico(Servico serv){
        servicos.add(serv);
    }
    public Double somaTudo(){
        Double tudo = null;
        for (Servico soma: servicos) {
            tudo += soma.getPreco();
        }
        return tudo;
    }
    public String mostrar() {
        String s = "";
        for (Servico a : servicos) {
            s += a.getDescricao();
        }
        return s;
    }
}
