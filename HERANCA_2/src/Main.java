import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados do Vendedor
        System.out.println("Digite os dados do Vendedor:");
        System.out.print("Nome: ");
        String nomeVendedor = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfVendedor = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimentoVendedor = scanner.nextLine();
        System.out.print("Data de Contratação: ");
        String dataContratacaoVendedor = scanner.nextLine();
        System.out.print("Salário Base: ");
        double salarioBaseVendedor = scanner.nextDouble();
        System.out.print("Percentual de Comissão: ");
        double percentualComissao = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha
        Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, dataNascimentoVendedor, dataContratacaoVendedor, salarioBaseVendedor, percentualComissao);

        // Dados do Gerente
        System.out.println("\nDigite os dados do Gerente:");
        System.out.print("Nome: ");
        String nomeGerente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfGerente = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimentoGerente = scanner.nextLine();
        System.out.print("Data de Contratação: ");
        String dataContratacaoGerente = scanner.nextLine();
        System.out.print("Salário Base: ");
        double salarioBaseGerente = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();
        Gerente gerente = new Gerente(nomeGerente, cpfGerente, dataNascimentoGerente, dataContratacaoGerente, salarioBaseGerente, departamento);

        // Dados do Cliente
        System.out.println("\nDigite os dados do Cliente:");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfCliente = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimentoCliente = scanner.nextLine();
        System.out.print("Email: ");
        String emailCliente = scanner.nextLine();
        System.out.print("Número do Cartão de Fidelidade: ");
        String numeroCartaoFidelidade = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente, cpfCliente, dataNascimentoCliente, emailCliente, numeroCartaoFidelidade, telefoneCliente);

        // Vai estar mostrando as respotas das perguntas
        System.out.println("\nDados cadastrados:");
        System.out.println(vendedor);
        System.out.println(gerente);
        System.out.println(cliente);

        scanner.close();
    }
}

// Classe vendedor
class Vendedor {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    // Inicia os atributos
    public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    // Retorna a string do objeto
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataContratacao='" + dataContratacao + '\'' +
                ", salarioBase=" + salarioBase +
                ", percentualComissao=" + percentualComissao +
                '}';
    }
}

// Classe gerente
class Gerente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String dataContratacao;
    private double salarioBase;
    private String departamento;

    // Inicia os atributos
    public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // Retorna a string do objeto
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataContratacao='" + dataContratacao + '\'' +
                ", salarioBase=" + salarioBase +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}

// Classe cliente
class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

    // Inicia os atributos
    public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    // Retorna a string do objeto
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                ", numeroCartaoFidelidade='" + numeroCartaoFidelidade + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
