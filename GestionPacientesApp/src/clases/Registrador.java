package clases;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registrador {
    private final String serverName = "localhost";
    private final String database = "gestionpacientes";
    private final String user = "root";
    private final String password = "";
    
    private MysqlDataSource getDataSource() {
        MysqlDataSource mds = new MysqlDataSource();
        mds.setServerName(serverName);
        mds.setDatabaseName(database);
        mds.setUser(user);
        mds.setPassword(password);
        
        return mds;
    }
    
    public boolean Login(int usuario, String cont) {
        Boolean resultado = false;
        int users[] = {10001, 10002, 10003, 10004, 20001, 20002, 20003, 30001, 30002};
        String pass[] = {"PH001", "PH002", "PH003", "PH004", "EN001", "EN002", "EN003", "AD001", "AD002"};
        
        for (int i=0; i<users.length; i++) {
            if (users[i]==usuario) {
                if (pass[i].equals(cont)) {
                    resultado = true;
                }
            }
        }

        return resultado;
    }
    
//    public void RegistrarPacienteAdmin(Paciente p) {
//        MysqlDataSource mds = getDataSource();
//        
//        try {
//            Connection con = mds.getConnection();
//            PreparedStatement ps = con.prepareStatement("INSERT INTO pacientes VALUES (NULL,?,?,?)");
//            ps.setString(1, p.getNombre());
//            ps.setString(2, p.getTipo());
//            ps.setInt(3, p.getVida());
//            ps.executeUpdate();
//            
//        } catch (Exception e) {
//            System.out.println("El programa falló satisfactoriamente.");
//            System.out.println(e.toString());
//        }
//    }
//    
//    public ArrayList<Pokemon> ListarPokemones() {
//        ArrayList<Pokemon> lista = new ArrayList<>();
//        MysqlDataSource mds = getDataSource();
//        
//        try {
//            Connection con = mds.getConnection();
//            Statement s = con.createStatement();
//            ResultSet rs = s.executeQuery("SELECT * FROM pokemones");
//            
//            while (rs.next()) {
//                Pokemon p = new Pokemon();
//                p.setCodigo(rs.getInt("codigo"));
//                p.setNombre(rs.getString("nombre"));
//                p.setTipo(rs.getString("tipo"));
//                p.setVida(rs.getInt("vida"));
//                
//                lista.add(p);
//            }
//            
//        } catch (Exception e) {
//            System.out.println("El programa falló satisfactoriamente.");
//            System.out.println(e.toString());
//        }
//        
//        return lista;
//    }
}
