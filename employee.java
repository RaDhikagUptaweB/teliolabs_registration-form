import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employee")

public class employee extends HttpServlet {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con;
    PreparedStatement pst;
    int row;
    
    public void doPost(HttpServletRequest req,HttpServletResponse rsp ) throws IOException,ServletException
    {
        
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lba","root","");
            String empid = req.getParameter("empid");
            String empfname = req.getParameter("fname");
            String emplname= req.getParameter("lname");
            
            pst = con.prepareStatement("insert into employee(id,fname,lname)values(?,?,?) ");
            pst.setString(1, empid);
            pst.setString(2, empfname);
            pst.setString(3, emplname);
            row = pst.executeUpdate();
            
            out.println("<font color='green'>  Record Addedddd   </font>");
 
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           
             out.println("<font color='red'>  Record Failed   </font>");
        } 
    }
  
}