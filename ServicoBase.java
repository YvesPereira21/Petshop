import java.time.LocalDate;

public abstract class ServicoBase implements Servico{

    private LocalDate data;
    private Integer codigo;
    private Double preco;

    public ServicoBase(Integer codigo) {
        this.data = LocalDate.now();
        this.codigo = codigo;
        this.preco = (double) 0;
    }


}
