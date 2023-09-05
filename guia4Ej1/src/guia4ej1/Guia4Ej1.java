
package guia4ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Guia4Ej1 {

    
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");//
            
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/ulp", "root", "");
            
          
            String sql="INSERT INTO alumno( dni, apellido, nombre, fechaNacimiento, estado) VALUES (3812786,'cePon','Mailen','1997-12-21',1), (38123526454,'Catalani','Sofi','1995-12-21',1)";
                    //"INSERT INTO alumno (dni,apellido, nombre, acceso,estado)"+ "VALUES (76533345,'Montanari','Marina',1,true),(76352352,'Leguizamon','Mai',1,true)";
            
            PreparedStatement ps=conexion.prepareStatement(sql);
            int registro=ps.executeUpdate();
            System.out.println(registro);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null , "Error al cargar Drive"+ex.getMessage());
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null , "Error en la conexion con la base de datos"+ex.getMessage());
        }
 }
    
}
