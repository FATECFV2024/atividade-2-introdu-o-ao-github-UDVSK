public class eu{

    private String nome, ra, idade, idgit, idlinkedin, curso;
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setIdlinkedin(String idlinkedin) {
        this.idlinkedin = idlinkedin;
    }
    public void setIdgit(String idgit) {
        this.idgit = idgit;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCurso() {
        return curso;
    }
    public String getIdlinkedin() {
        return idlinkedin;
    }
    public String getIdgit() {
        return idgit;
    }
    public String getIdade() {
        return idade;
    }
    public String getRa() {
        return ra;
    }
    public String getNome() {
        return nome;
    }
    
    
    public void explanar() {
        System.out.println(getCurso());
        System.out.println(getIdlinkedin());
        System.out.println(getIdgit());
        System.out.println(getIdade());
        System.out.println(getRa());
        System.out.println(getNome());

    }

}
