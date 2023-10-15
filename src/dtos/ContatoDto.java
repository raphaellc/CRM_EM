package dtos;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContatoDto {
    private int id_pessoa;
    private String nome;
    private LocalDate dt_nasc;
    private String celular;
    private String email;
    private int id_setor;
    private String ocupacao;
    private int id_origem;
    private LocalDateTime dt_hr_origem;
    private int id_tipo_pessoa;

    // Construtor
    public ContatoDto() {
    }

    // Métodos getters e setters para os atributos
    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(LocalDate dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_setor() {
        return id_setor;
    }

    public void setId_tipo_pessoa(int id_tipo_pessoa){
        this.id_tipo_pessoa =  id_tipo_pessoa;
    }

    public void setId_setor(int id_setor) {
        this.id_setor = id_setor;
    }
    public int getId_tipo_pessoa(){
        return this.id_tipo_pessoa;
    }
    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public int getId_origem() {
        return id_origem;
    }

    public void setId_origem(int id_origem) {
        this.id_origem = id_origem;
    }

    public LocalDateTime getDt_hr_origem() {
        return dt_hr_origem;
    }

    public void setDt_hr_origem(LocalDateTime dt_hr_origem) {
        this.dt_hr_origem = dt_hr_origem;
    }
}
