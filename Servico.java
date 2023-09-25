import java.time.LocalDate;

public interface Servico {

    public LocalDate getData();
    public Integer getCodigo();
    public String getDescricao();
    public Double getPreco();
}
