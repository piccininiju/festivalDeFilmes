package ad120252;

public class Participante extends Premiavel {
    protected String nome;
    protected int idade;
    protected String nacionalidade;

    public Participante(String nome, int idade, String nacionalidade, String nomeFilme) {
        super(nomeFilme);
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;

    }

    public String getNome() {
        return nome;
    }

    public String getTituloFilme() {
        return super.tituloFilme;
    }

    public void getNomeParticipante() {
        System.out.println("Nome participante: " + nome);
    }

    public void getIdadeParticipante() {
        System.out.println("O participante " + nome + "tem " + idade + " anos");
    }

    public void getNacionalidadeParticipante() {
        System.out.println("O participant " + nome + "eh " + nacionalidade);
    }
}