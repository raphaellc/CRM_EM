import daos.*;
import dtos.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import controladoras.*;


public class CRM_EM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContatoDao contato_dao = new ContatoDao();
        ContatoControladora contato_controladora = new ContatoControladora();

        // Criando um objeto Calendar para dt_nasc
        LocalDate dtNasc= LocalDate.of(1883,01,10);


        System.out.println("O que você deseja, 1- inserir um contato, 2- Listar Contatos");
        int op = scanner.nextInt(); // Lê opção
        if(op == 1) {
            // Criand
            // o um objeto ContatoDto e preenchendo todos os atributos
            ContatoDto contato = new ContatoDto();
            contato.setNome("Pedro");
            contato.setDt_nasc(dtNasc);
            contato.setCelular("123456789");
            contato.setEmail("pedro@example.com");
            contato.setId_setor(2);
            contato.setOcupacao("Desenvolvedor");
            contato.setId_origem(3);
            contato.setDt_hr_origem(LocalDateTime.now()); // Data e hora atuais
            contato.setId_tipo_pessoa(1); // 1-Militante; 2-Contato;

            //Inserir no Banco
            contato_controladora.adicionarContato(contato);
            //contato_dao.adicionarContato(contato);
        }else {
            // Exibindo os dados do contato
            //List<ContatoDto> contatos = contato_dao.listarContatos();
            List<ContatoDto> contatos = contato_controladora.listarContatos();
            for (ContatoDto cto : contatos) {
                System.out.println("Nome: " + cto.getNome());
                System.out.println("Data de Nascimento: " + cto.getDt_nasc().toString());
                System.out.println("Celular: " + cto.getCelular());
                System.out.println("Email: " + cto.getEmail());
                System.out.println("ID Setor: " + cto.getId_setor());
                System.out.println("Ocupação: " + cto.getOcupacao());
                System.out.println("ID Origem: " + cto.getId_origem());
                System.out.println("Data e Hora de Origem: " + cto.getDt_hr_origem());
                System.out.println("Tipo Pessoa: " + cto.getId_tipo_pessoa());
                System.out.println("\n---------------------------\n");
            }
        }
    }
}

