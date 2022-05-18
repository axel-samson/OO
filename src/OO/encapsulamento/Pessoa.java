package OO.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;
    private String sobrenome;

    //não esquecer de colocar o SET dentro do Pessoa
    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setIdade(idade);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    //getter
    public int getIdade() {
        return idade;
    }

    //setter
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Olá, eu sou o " + getNome() + " tenho " + getIdade() + " anos";
    }
}
