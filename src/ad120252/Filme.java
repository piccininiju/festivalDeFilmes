package ad120252;

public class Filme extends Premiavel {
    protected String genero;
    private int pontos;

    public Filme(String titulo, String genero) {
        super(titulo);
        this.genero = genero;
        this.pontos = 0;

    }

    public String getNome() {
        return super.tituloFilme;
    }

    public void getGenero() {
        System.out.println("O filme " + super.tituloFilme + " eh do gênero " + genero);
    }

    public void addPontos(int pontos) {
        this.pontos += pontos;
    }

    public void getPontos() {
        System.out.println("O filme " + super.tituloFilme + " fez " + pontos + " pontos");
        if (premioOuro > 0) {
            System.out.println("O filme " + super.tituloFilme + " ganhou " + premioOuro + " premios de ouro");
        }
        if (premioPrata > 0) {
            System.out.println("O filme " + super.tituloFilme + " ganhou " + premioPrata + " premios de prata");
        }
        if (premioBronze > 0) {
            System.out.println("O filme " + super.tituloFilme + " ganhou " + premioBronze + " premios de bronze");
        }
        if (premioOuro == 0 && premioPrata == 0 && premioBronze == 0) {
            System.out.println("O filme " + super.tituloFilme + " nao ganhou premios");
        }
    }
}
