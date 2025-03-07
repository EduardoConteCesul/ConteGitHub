public class Aluno {
    public String nome;
    public String matricula;

    public Aluno (){
        this.nome = "Nome padrão";
        this.matricula = "0000";
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void exibirAluno(){
        System.out.println("Nome: " + nome + " | Matricula: " + matricula);
    }
}
