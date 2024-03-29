import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aeroporto {
    private Companhia companhia;
    BufferedReader reader;

    public Companhia getCompanhia(int posicao) {
        return this.companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }

    public static void main(String[] args) throws Exception {
        try {
            Aeroporto aeroporto = new Aeroporto();
            aeroporto.companhia = new Companhia();
            aeroporto.reader = new BufferedReader(
                    new InputStreamReader(System.in));

            aeroporto.cadastrarCompanhia();
            String opcao = "";
            while (!opcao.equals("4")) {
                aeroporto.menu();
                opcao = aeroporto.reader.readLine();
                switch (opcao) {
                    case "1":
                        aeroporto.cadastrarVoo();
                        break;
                    case "2":
                        aeroporto.listarVoos();
                        break;
                    case "3":
                        aeroporto.consultarVoo();
                        break;
                    default:
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void menu() {
        System.out.println("---------------------------");
        System.out.println("\nO que gostaria de fazer?");
        System.out.println("\n[1] Cadastrar voo: ");
        System.out.println("\n[2] Listar os voos existentes: ");
        System.out.println("\n[3] Consultar determinado voo: ");
        System.out.println("\n[4] Sair: ");
    }

    public void cadastrarCompanhia() throws Exception {
        try {
            System.out.println("\nInforme o CNPJ da empresa: ");
            this.companhia.setCNPJ(this.reader.readLine());

            System.out.println("\nInforme o nome da empresa: ");
            this.companhia.setNome(this.reader.readLine());

            System.out.println("\nInforme o telefone da empresa: ");
            this.companhia.setTelefone(this.reader.readLine());

            this.setCompanhia(this.companhia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cadastrarVoo() throws Exception {
        try {
            Voo voo = new Voo();
            System.out.println("[Cadastro de voo]:  ");

            System.out.println("Informe o codigo do voo: ");
            voo.setCodigo(this.reader.readLine());

            System.out.println("\nInforme a data do voo: ");
            voo.setData(this.reader.readLine());

            this.cadastrarPassageiro(voo);

            this.companhia.setVoo(voo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void consultarVoo() throws Exception {
        try {
            System.out.println("Informe o código do voo: ");
            String codigo = this.reader.readLine();
            for (int i = 0; i < 100; i++) {
                if (this.companhia.getQuantidadeVoos() < 1) {
                    System.out.println("Nao ha voo cadastrado.");
                    break;
                }

                if (codigo.isBlank() || codigo.isEmpty()) {
                    break;
                }

                if (this.companhia.getVoo(i) != null && this.companhia.getVoo(i).getCodigo().equals(codigo)) {
                    System.out.println(this.companhia.getVoo(i).infoVoo());
                    System.out.println("\nDados dos passageiros deste voo: \n");
                    this.listarDadosPassageiros(this.companhia.getVoo(i));
                } else {
                    System.out.println("Nao existe voo com esse codigo. ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarVoos() throws Exception {
        try {
            for (int i = 0; i < 100; i++) {
                if (this.companhia.getQuantidadeVoos() < 1) {
                    System.out.println("Nao ha voo cadastrado.");
                    break;
                }
                if (this.companhia.getVoo(i) != null) {
                    System.out.println(this.companhia.getVoo(i).infoVoo());
                    System.out.println("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cadastrarPassageiro(Voo voo) throws Exception {
        try {
            System.out.println("\n-------------Passageiros--------------");
            int i;
            String opcao = "";
            for (i = (voo.getQuantidadePassageiros() > 0) ? voo.getQuantidadePassageiros() : 0; i < 180; i++) {
                if (voo.getQuantidadePassageiros() > 0) {
                    System.out.println("Deseja continuar cadastrando passageiros? [S] para sim, [N] para não: ");
                    opcao = this.reader.readLine();
                    if (!opcao.toUpperCase().equals("S")) {
                        break;
                    }
                }
                Passageiro passageiro = new Passageiro();
                System.out.println("Digite o nome do passageiro: ");
                String nome = this.reader.readLine();
                if (nome.isBlank() || nome.isEmpty()) {
                    break;
                }

                passageiro.setNome(nome);

                System.out.println("\nDigite o CPF do passageiro: ");
                passageiro.setCpf(this.reader.readLine());

                System.out.println("\nDigite o telefone do passageiro: ");
                passageiro.setTelefone(this.reader.readLine());

                System.out.println("\nDigite o passaporte do passageiro: ");
                passageiro.setPassaporte(this.reader.readLine());

                voo.setPassageiro(passageiro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void listarDadosPassageiros(Voo voo) throws Exception {
        try {
            for (int i = 0; i < 100; i++) {
                if (voo.getPassageiro(i) != null) {
                    System.out.println(voo.getPassageiro(i).infoPassageiro());
                }
            }
            System.out.println("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
