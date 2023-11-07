package dtos;

public class SetorPessoaDto {
    private int idSetorPessoa;
    private String descricao;

    public int getIdSetorPessoa() {
        return idSetorPessoa;
    }

    public void setIdSetorPessoa(int idSetorPessoa) {
        this.idSetorPessoa = idSetorPessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "SetorPessoaDTO{" +
                "idSetorPessoa=" + idSetorPessoa +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

