package visoes;
import controladoras.ContatoControladora;
import dtos.ContatoDto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TelaCadastroContato extends JFrame{
    private JTextField textNome;
    private JLabel nome;
    private JLabel email;
    private JTextField textEmail;
    private JPanel jp_tela_cadastro_contato;
    private JButton btn_cadastrar;
    private JFormattedTextField form_text_dt_nasc;
    private JLabel dt_nasc;
    private JLabel celular;
    private JTextArea textCelular;

    public TelaCadastroContato(ContatoControladora cto_control){
        setContentPane(jp_tela_cadastro_contato);
        setTitle("Tela");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
        btn_cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText();
                ContatoDto contato = new ContatoDto();
                contato.setNome(textNome.getText());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                contato.setDt_nasc(LocalDate.parse(form_text_dt_nasc.getText(), formatter));
                contato.setCelular(textCelular.getText());
                contato.setEmail(textEmail.getText());
                contato.setId_setor(2);
                contato.setOcupacao("Desenvolvedor");
                contato.setId_origem(3);
                contato.setDt_hr_origem(LocalDateTime.now()); // Data e hora atuais
                contato.setId_tipo_pessoa(1); // 1-Militante; 2-Contato;
                if(cto_control.adicionarContato(contato))
                    JOptionPane.showMessageDialog(TelaCadastroContato.this,"Cadastrado com sucesso");
                else
                    JOptionPane.showMessageDialog(TelaCadastroContato.this,"Falhou cadastro");
            }
        });
    }
}
