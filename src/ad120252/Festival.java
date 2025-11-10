package ad120252;

public class Festival {
    private Categoria[] categorias;
    private Premiavel[] filmes;
    private Participante[] participantes;
    private int indexFilmes = 0;
    private int indexCategoras = 0;
    private int indexParticipantes = 0;

    public Festival(int qtdFilmes, int qtdParticipantes) {
        filmes = new Premiavel[qtdFilmes];
        categorias = new Categoria[10];
        participantes = new Participante[qtdParticipantes];
    }

    public void addParticipante(Participante participante) {
        if (indexParticipantes < participantes.length) {
            participantes[indexParticipantes] = participante;
            indexParticipantes++;
        } else {
            System.out.println("Nao eh possível adicionar mais participantes.");
        }
    }

    public void addCategoria(Categoria categoria) {
        if (indexCategoras < categorias.length) {
            categorias[indexCategoras] = categoria;
            indexCategoras++;
        } else {
            System.out.println("Nao eh possível adicionar mais categorias.");
        }
    }

    public void addFilme(Filme filme) {
        if (indexFilmes < filmes.length) {
            filmes[indexFilmes] = filme;
            indexFilmes++;
        } else {
            System.out.println("Nao eh possível adicionar mais filmes.");
        }
    }

    public void listarFilmes() {
        System.out.println("Filmes inscritos no festival: ");
        for (Premiavel f : filmes) {
            if (f != null) {
                System.out.println("- " + f.getNome());
            }
        }
    }

    public void listarCategorias() {
        System.out.println("As categorias do festival sao: ");
        for (Categoria c : categorias) {
            if (c != null) {
                System.out.println("- " + c.getCategoria());
            }
        }
    }

}
