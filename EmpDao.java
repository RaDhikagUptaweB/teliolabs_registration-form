import java.util.*;
import java.sql.*;


public class EmpDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver\");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teliolabs", "root", "T#9758@qlphr");
	        
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	public static int save(Emp e) {
		int status = 0;
		try {
			Connection con EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into teliolabs(name,password,email,profession) values (?,?,?,?)\");  "
			ps.setString(1, e.getName());
			ps.setString(2, e.getEmail());
			ps.setString(3,e.getPassword());
			ps.setString(4, e.getProfession());
			
			status=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}
	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from teliolabs where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();  
            
          con.close();  
      }catch(Exception e){e.printStackTrace();}  
        
      return status;  
  }  
  public static Emp getEmployeeById(int id){  
      Emp e=new Emp();  
        
      try{  
          Connection con=EmpDao.getConnection();
          PreparedStatement ps=con.prepareStatement("select * from teliolabs where id=?");  
          ps.setInt(1,id);  
          ResultSet rs=ps.executeQuery();  
          if(rs.next()){  
              e.setId(rs.getInt(1));  
              e.setName(rs.getString(2));  
              e.setEmail(rs.getString(3));  
              e.setPassword(rs.getString(4));  
              e.setProfession(rs.getString(5));
		}
          con.close();
	}
      catch(Exception ex) {
    	  ex.printStackTrace();
      }
      return e
    		  public static List<Emp> getAllEmployees(){  
          List<Emp> list=new ArrayList<Emp>();  
            
          try{  
              Connection con=EmpDao.getConnection();  
              PreparedStatement ps=con.prepareStatement("select * from teliolabs");  
              ResultSet rs=ps.executeQuery();  
              while(rs.next()){  
                  Emp e=new Emp();  
                  e.setId(rs.getInt(1));  s.setName(rs.getString(2));  
                  e.setEmail(rs.getString(3));  
                  e.setPassword(rs.getString(4));  
                  e.setProfession(rs.getString(5));  
                  list.add(e);  
              }  
              con.close();  
          }catch(Exception e){e.printStackTrace();}  
            
          return list;  
}
