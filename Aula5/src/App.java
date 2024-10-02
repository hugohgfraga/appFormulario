public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Hugo");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Evelyn");
        Aluno aluno3 = new Aluno();
        aluno2.setNome("Evelyn");

        System.out.println(aluno2.getNome());
        System.out.println(aluno1.equals(aluno2));
        System.out.println(aluno2.equals(aluno3));

        Vetor vetor = new Vetor();
        vetor.adiciona(aluno1);
        vetor.adiciona(3, aluno2);
        vetor.adiciona(56, aluno3);

        System.out.println(vetor.toString());

        vetor
    }
}
