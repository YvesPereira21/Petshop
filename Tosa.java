import java.time.LocalDate;

public class Tosa extends ServicoBase{

    private char animalTamanho;

    public Tosa(Integer codigo, char animalTamanho) {
        super(codigo);
        this.animalTamanho = animalTamanho;
    }

    public char getAnimalTamanho() {
        return animalTamanho;
    }

    @Override
    public LocalDate getData() {
        return null;
    }

    @Override
    public Integer getCodigo() {
        return null;
    }

    @Override
    public String getDescricao() {
        return "Animal tamanho: " + getAnimalTamanho() + "\n" +
                getData() + "\n" + "Preço: " + getPreco();
    }

    @Override
    public Double getPreco() {
        Double preco = null;
        if (getAnimalTamanho() == 'p' ) {
            preco = 22.0;
        } else if (getAnimalTamanho() == 'm') {
            preco = 30.0;
        } else if (getAnimalTamanho() == 'g') {
            preco = 40.0;
        }
        return preco;
    }
}
