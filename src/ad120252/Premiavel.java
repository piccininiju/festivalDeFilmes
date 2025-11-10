package ad120252;

public abstract class Premiavel {
    protected String tituloFilme;
    protected int premioOuro;
    protected int premioPrata;
    protected int premioBronze;

    protected Premiavel(String tituloFilme) {
        this.tituloFilme = tituloFilme;
        this.premioOuro = 0;
        this.premioPrata = 0;
        this.premioBronze = 0;

    }

    public String getNome() {
        return tituloFilme;
    }

    public void addPremio(String premio) {
        if (premio == "OURO") {
            premioOuro++;
        } else if (premio == "PRATA") {
            premioPrata++;
        } else {
            premioBronze++;
        }
    }

}
