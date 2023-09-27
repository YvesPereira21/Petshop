import java.time.LocalDate;

public class Hotel extends ServicoBase{
    private char animalTamanho;
    private Integer quantidadeHoras;

    public Hotel(Integer codigo, char animalTamanho, Integer quantidadeHoras) {
        super(codigo);
        this.animalTamanho = animalTamanho;
        this.quantidadeHoras = quantidadeHoras;
    }

    public char getAnimalTamanho() {
        return animalTamanho;
    }

    public Integer getQuantidadeHoras() {
        return quantidadeHoras;
    }

    @Override
    public LocalDate getData() {
        return this.getData();
    }

    @Override
    public Integer getCodigo() {
        return this.getCodigo();
    }

    @Override
    public String getDescricao() {
        return "Animal tamanho: " + getAnimalTamanho() + "\n" +
                getData() + "\n" + "Quantidade de horas que o animal vai ficar: "
                + getQuantidadeHoras() + "\n" + "Preço: " + getPreco();
    }

    @Override
    public Double getPreco() {
        Double preco = null;
        if (getAnimalTamanho() == 'p' ) {
            preco = (double) (12 * getQuantidadeHoras());
        } else if (getAnimalTamanho() == 'm') {
            preco = (double) (18 * getQuantidadeHoras());
        } else if (getAnimalTamanho() == 'g') {
            preco = (double) (25 * getQuantidadeHoras());
        }
        return preco;
    }
}
