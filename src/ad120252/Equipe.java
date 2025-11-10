package ad120252;

public class Equipe extends Premiavel {
    protected String tipo;
    protected Participante[] individuals;
    protected int qntParticipantes;
    protected int numParticipantes;

    public Equipe(String tipo, String nomeFilme, int qntParticipantes) {
        super(nomeFilme);
        this.tipo = tipo;
        this.qntParticipantes = qntParticipantes;
        this.individuals = new Participante[qntParticipantes];
        this.numParticipantes = 0;

    }

    public String getNome() {
        return tipo;
    }

    public void addParticipante(Participante individual) {
        if (numParticipantes < qntParticipantes) {
            individuals[numParticipantes] = individual;
            numParticipantes++;
        } else {
            System.out.println("Equipe ja possui a quantidade maxima de participantes.");
        }
    }
}