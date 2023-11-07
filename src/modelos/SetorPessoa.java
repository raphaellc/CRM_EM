package modelos;

import daos.Conexao;
import daos.SetorPessoaDao;
import dtos.SetorPessoaDto;

import java.util.ArrayList;
import java.util.List;

public class SetorPessoa {
    private List<SetorPessoaDto> setor_pessoa;
    private SetorPessoaDao setor_pessoa_dao;
    private Conexao conexao;

    public SetorPessoa(){
        conexao = new Conexao();
        setor_pessoa_dao = new SetorPessoaDao(conexao);
        setor_pessoa = new ArrayList<SetorPessoaDto>();
    }

    public List<SetorPessoaDto> listarSetoresPessoa(){
        return setor_pessoa_dao.listarSetorPessoa();
    }
}
