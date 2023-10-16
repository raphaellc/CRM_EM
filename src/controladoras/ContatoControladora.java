package controladoras;

import java.util.ArrayList;
import java.util.List;
import dtos.ContatoDto;
import modelos.Contato;

public class ContatoControladora {
    private List<ContatoDto> contatos;
    private Contato contato;
    public ContatoControladora() {

        contatos = new ArrayList<>();
        contato = new Contato();

    }

    public void adicionarContato(ContatoDto contato) {
        contatos.add(contato);
        if (contato != null) {
            this.contato.adicionarContato(contato);
        }
    }

    public List<ContatoDto> listarContatos() {
        return this.contato.listarContatos();
    }
    /*
    public ContatoDto buscarContatoPorNome(String nome) {
        for (ContatoDto contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; // Retorna null se o contato não for encontrado
    }

    public void atualizarContato(String nome, ContatoDto novoContato) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                contatos.set(i, novoContato);
                return;
            }
        }
        // Lançar exceção ou realizar outra ação se o contato não for encontrado
    }

    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
    }

     */
}

