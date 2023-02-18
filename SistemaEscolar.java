import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaEscolar {
    private Escola e1;
    BufferedReader reader;

    public static void main(String[] args) throws Exception {
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();
        se.reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Informe o número da escola: ");
        se.e1.setNome(se.reader.readLine());

        System.out.println("Informe o número de telefone: ");
        se.e1.setFone(se.reader.readLine());
    }

    public void menu() throws Exception {
        String opcao = "";
        while (!opcao.equals("4")) {
            System.out.println("---------------------------");
            System.out.println("[1] Cadastrar nova turma: ");
            System.out.println("[2] Listar as turmas existentes: ");
            System.out.println("[3] Consultar turma: ");
            System.out.println("[4] Sair: ");

            opcao = this.reader.readLine();
            switch (opcao) {
                case "1":
                    this.cadastrarTurma();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
        }
    }

    public void cadastrarTurma() throws Exception {
        Turma turma = new Turma();
        System.out.println("[Cadastro de turma]:  ");
        System.out.println("Informe o nº da turma: ");
        turma.setNumeroTurma(Integer.parseInt(this.reader.readLine()));

        System.out.println("Nome do curso: ");
        turma.setNomeCurso(this.reader.readLine());

        System.out.println("Informe o ano: ");
        turma.setAno(Integer.parseInt(this.reader.readLine()));

        System.out.println("-------------Alunos--------------");
        for (int iterator = 0; iterator < 40; iterator++) {
            System.out.println("Digite o nome do aluno: ");
            AlunoHerenca aluno = new AlunoHerenca();
            String nome = this.reader.readLine();
            if (nome.isBlank() || nome.isEmpty()) {
                break;
            }
            aluno.setNome(nome);

            System.out.println("Digite as notas do aluno: ");
            aluno.setNota1(Float.parseFloat(this.reader.readLine()));
            aluno.setNota2(Float.parseFloat(this.reader.readLine()));
            aluno.setNota3(Float.parseFloat(this.reader.readLine()));
            aluno.setNota4(Float.parseFloat(this.reader.readLine()));

            turma.setAluno(aluno);
        }
        this.e1.setTurma(turma);
    }
}
