package modelos;

import java.util.ArrayList;
import java.util.List;
import daos.ContatoDao;
import dtos.ContatoDto;
import daos.Conexao;

public class Contato {

    private List<ContatoDto> contatos;
    private ContatoDao contato_dao;
    private Conexao conexao;

    public Contato() {
        conexao = new Conexao();
        contatos = new ArrayList<ContatoDto>();
        contato_dao = new ContatoDao(conexao);
    }

    public boolean adicionarContato(ContatoDto contato) {
        contatos.add(contato);
        return contato_dao.adicionarContato(contato);
    }

    public List<ContatoDto> listarContatos() {
        return contato_dao.listarContatos();
    }
    /*
    public ContatoDto buscarContatoPorNome(String nome) {
        for (ContatoDto contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; // Retorna null se o contato não for encontrado
    }*/
    /*
    public void atualizarContato(String nome, ContatoDto novoContato) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                contatos.set(i, novoContato);
                return;
            }
        }
        // Lançar exceção ou realizar outra ação se o contato não for encontrado
    }*/
    /*
    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
    }*/
}
