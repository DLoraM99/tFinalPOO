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
    
    public boolean Login(int usuario, String contrasena) {
        MysqlDataSource mds = getDataSource();
        Boolean resultado = true;
        
        try {
            Connection con = mds.getConnection();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM usuarios");
            
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String pass = rs.getString("contraseña");
                
                if (codigo==usuario) {
                    if (pass==contrasena) {
                        resultado = true;
                        break;
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println("El programa falló satisfactoriamente.");
            System.out.println(e.toString());
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
