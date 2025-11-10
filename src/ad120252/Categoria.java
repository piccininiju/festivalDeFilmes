package ad120252;

public class Categoria {
    protected String nome;
    protected TipoCategoria tipo;

    private Premiavel[] nomeados;
    private int index = 0;

    public Categoria(String nome, TipoCategoria tipo) {
        this.nome = nome;
        this.tipo = tipo;
        nomeados = new Premiavel[5];
    }

    public String getCategoria() {
        return nome;
    }

    public void addNomeado(Premiavel premiavel) {
        if (index < nomeados.length) {
            nomeados[index] = premiavel;
            index++;
        } else {
            System.out.println("Nao eh possível nomear mais.");
        }
    }

    public void addPremioFilme(Filme filme, String tipoPremio) {
        switch (tipoPremio.toUpperCase()) {
            case "OURO":
                filme.addPontos(10);
                filme.addPremio(tipoPremio);
                System.out.println("O filme " + filme.tituloFilme + " ganhou o premio de ouro");
                break;
            case "PRATA":
                filme.addPontos(8);
                filme.addPremio(tipoPremio);
                System.out.println("O filme " + filme.tituloFilme + " ganhou o premio de prata");
                break;
            case "BRONZE":
                filme.addPontos(6);
                filme.addPremio(tipoPremio);
                System.out.println("O filme " + filme.tituloFilme + " ganhou o premio de bronze");
                break;
            default:
                System.out.println("Tipo de premio invalido");
        }
    }

    public void addPremioParticipante(Filme filme, String tipoPremio, Participante participante) {
        switch (tipoPremio.toUpperCase()) {
            case "OURO":
                filme.addPontos(10);
                filme.addPremio(tipoPremio);
                participante.addPremio(tipoPremio);
                System.out.println(
                        "O ator " + participante.nome + " ganhou um premio de ouro, pelo filme " + filme.tituloFilme);
                break;
            case "PRATA":
                filme.addPontos(8);
                filme.addPremio(tipoPremio);
                participante.addPremio(tipoPremio);
                System.out.println(
                        "O ator " + participante.nome + " ganhou um premio de prata, pelo filme " + filme.tituloFilme);
                break;
            case "BRONZE":
                filme.addPontos(6);
                filme.addPremio(tipoPremio);
                participante.addPremio(tipoPremio);
                System.out.println(
                        "O ator " + participante.nome + " ganhou um premio de bronze, pelo filme " + filme.tituloFilme);
                break;
            default:
                System.out.println("Tipo de premio invalido");
        }
    }

    public void addPremioEquipe(Filme filme, String tipoPremio, Equipe equipe) {
        switch (tipoPremio.toUpperCase()) {
            case "OURO":
                filme.addPontos(10);
                filme.addPremio(tipoPremio);
                equipe.addPremio(tipoPremio);
                System.out.println(
                        "A equipe de " + equipe.tipo + " ganhou um premio de ouro, pelo filme "
                                + filme.tituloFilme);
                break;
            case "PRATA":
                filme.addPontos(8);
                filme.addPremio(tipoPremio);
                equipe.addPremio(tipoPremio);
                System.out.println(
                        "A equipe de " + equipe.tipo + " ganhou um premio de prata, pelo filme "
                                + filme.tituloFilme);
                break;
            case "BRONZE":
                filme.addPontos(6);
                filme.addPremio(tipoPremio);
                equipe.addPremio(tipoPremio);
                System.out.println(
                        "A equipe de " + equipe.tipo + " ganhou um premio de bronze, pelo filme "
                                + filme.tituloFilme);
                break;
            default:
                System.out.println("Tipo de premio invalido");
        }
    }

    public void getNomeados() {
        System.out.println("Os nomeados para a categoria " + nome + " sao:");
        for (int i = 0; i < index; i++) {
            System.out.println("- " + nomeados[i].getNome());
        }
    }

}
