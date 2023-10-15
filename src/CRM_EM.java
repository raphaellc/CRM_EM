import daos.*;
import dtos.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CRM_EM {
    public static void main(String[] args) {

        // Criando um objeto Calendar para dt_nasc
        LocalDate dtNasc= LocalDate.of(1883,01,10);

        // Criando um objeto ContatoDto e preenchendo todos os atributos
        ContatoDto contato = new ContatoDto();
        contato.setNome("João");
        contato.setDt_nasc(dtNasc);
        contato.setCelular("123456789");
        contato.setEmail("joao@example.com");
        contato.setId_setor(2);
        contato.setOcupacao("Desenvolvedor");
        contato.setId_origem(3);
        contato.setDt_hr_origem(LocalDateTime.now()); // Data e hora atuais
        contato.setId_tipo_pessoa(2); // 1-Militante; 2-Contato;

        //Inserir no Banco
        ContatoDao contato_dao = new ContatoDao();
        contato_dao.adicionarContato(contato);

        // Exibindo os dados do contato
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Data de Nascimento: " + contato.getDt_nasc().toString());
        System.out.println("Celular: " + contato.getCelular());
        System.out.println("Email: " + contato.getEmail());
        System.out.println("ID Setor: " + contato.getId_setor());
        System.out.println("Ocupação: " + contato.getOcupacao());
        System.out.println("ID Origem: " + contato.getId_origem());
        System.out.println("Data e Hora de Origem: " + contato.getDt_hr_origem());
    }
}

