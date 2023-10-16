package visoes;

import dtos.ContatoDto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TelaCadastroContato extends JFrame {
    JFrame frame = new JFrame("Cadastro de Contato");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);

    JPanel panel = new JPanel();

    JLabel labelNome = new JLabel("Nome:");
    JTextField textFieldNome = new JTextField();
    JLabel labelDataNascimento = new JLabel("Data de Nascimento (AAAA-MM-DD):");
    JTextField textFieldDataNascimento = new JTextField();
    JLabel labelCelular = new JLabel("Celular:");
    JTextField textFieldCelular = new JTextField();
    JLabel labelEmail = new JLabel("E-mail:");
    JTextField textFieldEmail = new JTextField();
    JLabel labelSetor = new JLabel("ID Setor:");
    JTextField textFieldSetor = new JTextField();
    JLabel labelOcupacao = new JLabel("Ocupação:");
    JTextField textFieldOcupacao = new JTextField();
    JButton buttonCadastrar = new JButton("Cadastrar");

    panel.add(labelNome);
    panel.add(textFieldNome);
    panel.add(labelDataNascimento);
    panel.add(textFieldDataNascimento);
    panel.add(labelCelular);
    panel.add(textFieldCelular);
    panel.add(labelEmail);
    panel.add(textFieldEmail);
    panel.add(labelSetor);
    panel.add(textFieldSetor);
    panel.add(labelOcupacao);
    panel.add(textFieldOcupacao);
    panel.add(buttonCadastrar);

    frame.add(panel);
    frame.setVisible(true);

    buttonCadastrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = textFieldNome.getText();
            LocalDate dataNascimento = LocalDate.parse(textFieldDataNascimento.getText());
            String celular = textFieldCelular.getText();
            String email = textFieldEmail.getText();
            int setor = Integer.parseInt(textFieldSetor.getText());
            String ocupacao = textFieldOcupacao.getText();
            int idOrigem = 3; // Suponhamos que o ID de origem seja 3
            LocalDateTime dataHoraOrigem = LocalDateTime.now();

            ContatoDto contato = new ContatoDto();
            contato.setNome(nome);
            contato.setDt_nasc(dataNascimento);
            contato.setCelular(celular);
            contato.setEmail(email);
            contato.setId_setor(setor);
            contato.setOcupacao(ocupacao);
            contato.setId_origem(idOrigem);
            contato.setDt_hr_origem(dataHoraOrigem);

            // Exiba uma mensagem de confirmação (você pode personalizar isso)
            JOptionPane.showMessageDialog(frame, "Contato cadastrado com sucesso!");
        }
    });
}


