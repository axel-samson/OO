package OO._3_Relacao_n_para_n;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("WEB");
        Curso curso3 = new Curso("REACT native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso1.alunos) {
            System.out.println("Estou matriculado no curso " + curso1.nome);
            System.out.println(" meu nome é " + aluno.nome + "\n");
        }
        System.out.println(aluno1.cursos.get(0).alunos);
        Curso cursoEncontrado = aluno1.obterCursoPorNome("WeB");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);

        }
    }
}
