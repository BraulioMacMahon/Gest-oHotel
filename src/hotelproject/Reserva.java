/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelproject;
import java.sql.*;

/**
 *
 * @author queuscript
 */






public class Reserva {
    private final Connection conexao;

    public Reserva(Connection conexao) {
        this.conexao = conexao;
    }

    public void cadastrarReserva(int idHospede, String dataEntrada, String dataSaida, int numeroHospedes, String tipoQuarto) {
        try {
            String sql = "INSERT INTO Reservas (IDHospede, DataEntrada, DataSaida, NumeroHospedes, TipoQuartoEscolhido) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement declaracao = conexao.prepareStatement(sql)) {
                declaracao.setInt(1, idHospede);
                declaracao.setString(2, dataEntrada);
                declaracao.setString(3, dataSaida);
                declaracao.setInt(4, numeroHospedes);
                declaracao.setString(5, tipoQuarto);
                declaracao.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
