package daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import dtos.SetorPessoaDto;

public class SetorPessoaDao {
    private daos.Conexao con;
    public SetorPessoaDao(Conexao conexao){
        this.con = conexao;
    }

    public List<SetorPessoaDto> listarSetorPessoa() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List<SetorPessoaDto> setoresPessoa = new ArrayList<SetorPessoaDto>();
        try {
            String sql = "SELECT * FROM crmem.setor_pessoa";
            connection = this.con.conectar();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                SetorPessoaDto setorPessoa = new SetorPessoaDto();
                setorPessoa.setIdSetorPessoa(resultSet.getInt("id_setor_pessoa"));
                setorPessoa.setDescricao(resultSet.getString("descricao"));
                setoresPessoa.add(setorPessoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return setoresPessoa;
    }
}

