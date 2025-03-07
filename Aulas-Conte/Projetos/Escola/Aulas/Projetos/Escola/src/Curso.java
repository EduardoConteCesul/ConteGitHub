public class Curso {
    public String codigo;
    public String nome;

    public int cargaHoraria;

    public Curso(){
        this.codigo = "0000";
        this.nome = "Nome padrao";
        this.cargaHoraria = 0;
    }

    public Curso(String codigo, String nome, int cargaHoraria){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirInfo(String codigo, String nome, int cargaHoraria){

        System.out.println(
                "Codigo: " + codigo +
                " | Nome: " + nome +
                " | Carga Horaria: " + cargaHoraria
        );

    }
}
