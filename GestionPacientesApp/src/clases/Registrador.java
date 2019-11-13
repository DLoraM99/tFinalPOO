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
                    resultado = true;}
            }
        }
        
        //Pokemon p = new Pokemon();
//        MysqlDataSource mds = getDataSource();        
//        try {
//            Connection con = mds.getConnection();
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM pokemones WHERE codigo = ?"); 
//            ps.setInt(1, codigo);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {                
//                p.setCodigo(rs.getInt("codigo"));
//                p.setNombre(rs.getString("nombre"));
//                p.setTipo(rs.getString("tipo"));
//                p.setVida(rs.getInt("vida"));
//            }
//          
//        } catch (Exception e) {
//            System.out.println("El programa falló satisfactoriamente:");
//            System.out.println(e.toString());
//        }    

        return resultado;
    }
    
    
    public void RegistrarPacienteAdmin(Paciente p) {
        MysqlDataSource mds = getDataSource();
        
        try {
            Connection con = mds.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO pacientes VALUES (NULL,?,?,?,?,?,?,NULL,NULL,NULL,NULL,NULL)");
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDni());
            ps.setInt(3, p.getEdad());
            ps.setString(4, p.getSexo());
            ps.setString(5, p.getTelefono());
            ps.setString(6, p.getCorreo());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("El programa falló.");
            System.out.println(e.toString());
        }
    }
    
    
    public void RegistrarPacienteEnfer(Paciente p) {
        MysqlDataSource mds = getDataSource();
        
        try {         
            Connection con = mds.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE pacientes SET peso = ?, talla = ?, condicion = ? WHERE codigo = ?");
            ps.setFloat(1, p.getPeso());
            ps.setFloat(2, p.getTalla());
            ps.setString(3, p.getCondicion());
            ps.setInt(4, p.getCodigo());
            ps.executeUpdate(); 
            
        } catch (Exception e) {
            System.out.println("El programa falló.");
            System.out.println(e.toString());
        }
    }
    
    
    public ArrayList<Paciente> ListarPacientes() {
        ArrayList<Paciente> lista = new ArrayList<>();
        
        MysqlDataSource mds = getDataSource();        
        try {
            Connection con = mds.getConnection();
            Statement s = con.createStatement();            
            ResultSet rs = s.executeQuery("SELECT * FROM pacientes");
            while (rs.next()) {
                Paciente p = new Paciente();
                p.setCodigo(rs.getInt("codigo"));
                p.setNombre(rs.getString("nombre"));
                p.setDni(rs.getString("dni"));
                p.setEdad(rs.getInt("edad"));
                p.setSexo(rs.getString("sexo"));
                p.setTelefono(rs.getString("telefono")); 
                p.setCorreo(rs.getString("correo"));
                p.setPeso(rs.getFloat("peso")); 
                p.setTalla(rs.getFloat("talla")); 
                p.setCondicion(rs.getString("condicion"));
                p.setEstado(rs.getString("estado"));
                p.setNombDoctor(rs.getString("doctor"));
                lista.add(p);
            }
          
        } catch (Exception e) {
            System.out.println("El programa falló.");
            System.out.println(e.toString());
        }
        
        return lista;
    }


    public void EliminarPaciente(int codigo) {
        MysqlDataSource mds = getDataSource();
        
        try {
            Connection con = mds.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM pacientes WHERE codigo = ?");
            ps.setInt(1, codigo);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("El programa falló.");
            System.out.println(e.toString());
        }
    }
}
