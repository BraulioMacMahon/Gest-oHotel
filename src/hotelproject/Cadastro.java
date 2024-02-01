package hotelproject;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mardoche Pembele
 */
public class Cadastro {

    private Connection conexao;

    public Cadastro(Connection conexao) {
        this.conexao = conexao;
    }

    public boolean Login(String email, String senha) {
        try {
            String sql = "SELECT * FROM Usuario WHERE Email = ? AND Senha = ?";

            try (PreparedStatement declaracao = conexao.prepareStatement(sql)) {
                declaracao.setString(1, email);
                declaracao.setString(2, senha);

                try (ResultSet resultado = declaracao.executeQuery()) {
                    boolean loginBemSucedido = resultado.next();

                    return loginBemSucedido;
                }
            }
        } catch (SQLException e) {
            return false;
        }
    }

    public void cadastrarUsuario(String nome, String email, String telefone, String endereco, String senha) {

        try {
            String queryUsuario = "INSERT INTO Usuario (Nome, Email, Senha, Telefone, Endereco) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatementUsuario = conexao.prepareStatement(queryUsuario, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatementUsuario.setString(1, nome);
                preparedStatementUsuario.setString(2, email);
                preparedStatementUsuario.setString(3, senha);
                preparedStatementUsuario.setString(4, telefone);
                preparedStatementUsuario.setString(5, endereco);

                int registrosAfetadosUsuario = preparedStatementUsuario.executeUpdate();

                if (registrosAfetadosUsuario > 0) {
                    // Obtém o ID gerado para o usuário
                    ResultSet generatedKeys = preparedStatementUsuario.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        int idUsuario = generatedKeys.getInt(1);

                        String queryAdministrador = "INSERT INTO Administrador (IDUsuario) VALUES (?)";

                        try (PreparedStatement preparedStatementAdministrador = conexao.prepareStatement(queryAdministrador)) {
                            preparedStatementAdministrador.setInt(1, idUsuario);

                            int registrosAfetadosAdministrador = preparedStatementAdministrador.executeUpdate();

                            // Verifica se o administrador foi inserido com sucesso
                            if (registrosAfetadosAdministrador > 0) {
                                System.out.println("Registros inseridos com sucesso!");
                            } else {
                                System.out.println("Falha ao inserir o registro do administrador.");
                            }
                        }
                    }
                } else {
                    System.out.println("Falha ao inserir o registro do usuário.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao executar a inserção no banco de dados: " + e.getMessage());
        }
    }

    public void cadastrarReserva(String nomeHospede, String dataEntrada, String dataSaida, String preferenciasHospede, String tipoQuarto, String email, int telefone, String endereco) {
        try {
            String sql = "INSERT INTO Reservas (NomeHospede, DataEntrada, DataSaida, Preferencias, TipoQuartoEscolhido, Email, Telefone, Endereco) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement declaracao = conexao.prepareStatement(sql)) {
                declaracao.setString(1, nomeHospede);
                declaracao.setString(2, dataEntrada);
                declaracao.setString(3, dataSaida);
                declaracao.setString(4, preferenciasHospede);
                declaracao.setString(5, tipoQuarto);
                declaracao.setString(6, email);
                declaracao.setInt(7, telefone);
                declaracao.setString(8, endereco);
                declaracao.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
