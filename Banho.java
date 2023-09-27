import java.time.LocalDate;

public class Banho extends ServicoBase{
    private char tamanhoPelo;
    private char tamanhoAnimal;

    public Banho(Integer codigo, char tamanhoPelo, char tamanhoAnimal) {
        super(codigo);
        this.tamanhoPelo = tamanhoPelo;
        this.tamanhoAnimal = tamanhoAnimal;
    }

    public char getTamanhoPelo() {
        return tamanhoPelo;
    }

    public char getTamanhoAnimal() {
        return tamanhoAnimal;
    }

    @Override
    public LocalDate getData() {
        return getData();
    }

    @Override
    public Integer getCodigo() {
        return this.getCodigo();
    }

    @Override
    public String getDescricao() {
        return "Animal tamanho: " + getTamanhoAnimal() + "\n" +
                getData() + "\n" + "Quantidade de horas que o animal vai ficar: " + "\n"
                + "Preço: " + getPreco();
    }
    public double acrescimo(){
        if (getTamanhoPelo() == 'c'){
            return 0.0;
        } else if (getTamanhoPelo() == 'm') {
            return 10.0;
        } else if (getTamanhoPelo() == 'g') {
            return 20.0;
        }
        return acrescimo();
    }

    @Override
    public Double getPreco() {
        Double preco = null;
        if (getTamanhoAnimal() == 'p' ) {
            preco = 20 + acrescimo();
        } else if (getTamanhoAnimal() == 'm') {
            preco = 30 + acrescimo();
        } else if (getTamanhoAnimal() == 'g') {
            preco = 40 + acrescimo();
        }
        return preco;
    }
}
