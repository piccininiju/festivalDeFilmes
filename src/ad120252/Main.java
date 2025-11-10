package ad120252;

public class Main {
    public static void main(String[] args) throws Exception {

        Festival festival = new Festival(10, 10);

        System.out.println("\n=== FESTIVAL DE PREMIACAO DE FILMES ===");

        // Categorias
        Categoria melhorFilme = new Categoria("Melhor Filme", TipoCategoria.FILME);
        Categoria melhorAtor = new Categoria("Melhor Ator", TipoCategoria.INDIVIDUAL);
        Categoria melhoresEfeitosVisuais = new Categoria("Melhores Efeitos Visuais", TipoCategoria.EQUIPE);

        // Filmes
        Filme f1 = new Filme("A Origem", "Ficcao Científica");
        Filme f2 = new Filme("Pulp Fiction", "Crime/Drama");
        Filme f3 = new Filme("Clube da Luta", "Drama/Suspense");
        Filme f4 = new Filme("Cidade de Deus", "Crime/Drama");
        Filme f5 = new Filme("Parasita", "Drama/Suspense");

        festival.addFilme(f1);
        festival.addFilme(f2);
        festival.addFilme(f3);
        festival.addFilme(f4);
        festival.addFilme(f5);

        // Atores principais
        Participante ator1 = new Participante("Leonardo DiCaprio", 50, "Americano", f1.tituloFilme);
        Participante ator2 = new Participante("John Travolta", 70, "Americano", f2.tituloFilme);
        Participante ator3 = new Participante("Edward Norton", 55, "Americano", f3.tituloFilme);
        Participante ator4 = new Participante("Alexandre Rodrigues", 40, "Brasileiro", f4.tituloFilme);
        Participante ator5 = new Participante("Song Kang-ho", 58, "Sul-coreano", f5.tituloFilme);

        // Equipe de efeitos visuais inventada
        Equipe equipeEfeitos = new Equipe("Dream FX Studios", f5.tituloFilme, 3);
        equipeEfeitos.addParticipante(new Participante("Alice Martins", 32, "Brasileira", "Equipe FX"));
        equipeEfeitos.addParticipante(new Participante("Carlos Souza", 41, "Brasileiro", "Equipe FX"));
        equipeEfeitos.addParticipante(new Participante("Marta Kim", 29, "Sul-coreana", "Equipe FX"));

        Equipe equipeEfeitos2 = new Equipe("Visionary Effects", f2.tituloFilme, 3);
        equipeEfeitos2.addParticipante(new Participante("Ricardo Alves", 37, "Brasileiro", "Equipe FX"));
        equipeEfeitos2.addParticipante(new Participante("Sofia Hernandez", 33, "Mexicana", "Equipe FX"));
        equipeEfeitos2.addParticipante(new Participante("Oliver Wang", 40, "Chinês", "Equipe FX"));

        festival.addCategoria(melhorFilme);
        festival.addCategoria(melhorAtor);
        festival.addCategoria(melhoresEfeitosVisuais);

        // === Listar categorias ===
        System.out.println("\n=== Categorias do Festival ===");
        festival.listarCategorias();

        // === Listar filmes ===
        System.out.println("\n=== Filmes no Festival ===");
        festival.listarFilmes();

        // === Equipes ===
        System.out.println("\n=== Nomeacao Equipe ===");

        melhoresEfeitosVisuais.addNomeado(equipeEfeitos2);
        melhoresEfeitosVisuais.addNomeado(equipeEfeitos);
        melhoresEfeitosVisuais.getNomeados();

        System.out.println("\n=== Premiacao Equipe ===");

        melhoresEfeitosVisuais.addPremioEquipe(f4, "OURO", equipeEfeitos);

        // === Atores ===

        System.out.println("\n=== Nomeacao Melhor Ator ===");

        melhorAtor.addNomeado(ator1);
        melhorAtor.addNomeado(ator2);
        melhorAtor.addNomeado(ator3);
        melhorAtor.addNomeado(ator4);
        melhorAtor.addNomeado(ator5);
        melhorAtor.getNomeados();

        System.out.println("\n=== Premiacao Melhor Ator ===");

        melhorAtor.addPremioParticipante(f4, "OURO", ator4);
        melhorAtor.addPremioParticipante(f2, "PRATA", ator3);
        melhorAtor.addPremioParticipante(f3, "BRONZE", ator2);

        // === Filmes ===

        System.out.println("\n=== Nomeacao Melhor Filme ===");

        melhorFilme.addNomeado(f1);
        melhorFilme.addNomeado(f2);
        melhorFilme.addNomeado(f3);
        melhorFilme.addNomeado(f4);
        melhorFilme.addNomeado(f5);
        melhorFilme.getNomeados();

        System.out.println("\n=== Premiacao Melhor Filme ===");

        melhorFilme.addPremioFilme(f5, "OURO");
        melhorFilme.addPremioFilme(f3, "PRATA");
        melhorFilme.addPremioFilme(f2, "BRONZE");

        // === Pontuacao final ===
        System.out.println("\n=== Pontuacao Total dos Filmes ===");
        f1.getPontos();
        System.out.println("\n");
        f2.getPontos();
        System.out.println("\n");
        f3.getPontos();
        System.out.println("\n");
        f4.getPontos();
        System.out.println("\n");
        f5.getPontos();
    }
}
