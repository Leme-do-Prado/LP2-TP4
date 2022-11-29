import java.sql.*;
public class BDConexao
{
public static void main(String args[])
{
try
{
String url = "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS;databaseName=aulajava";
String user = "LEANDRO";
String password = "";
integratedSecurity=true";
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection con;
con = DriverManager.getConnection(url, user, senha);
System.out.println ("Conexao OK");
DatabaseMetaData db = con.getMetaData();
System.out.println("Conectado a "+db.getURL());
System.out.println("Conexao "+db.getConnection());
System.out.println("Driver "+db.getDriverName());
System.out.println("Usuario "+db.getUserName());
System.out.println("----------------------------------");
con.close();
}
catch (Exception e)
{
System.out.println("Erro: " + e.getMessage());
}

public static void recebeDado(){
	ResultSet rs;
	rs = st.executeQuery("SELECT * FROM tbfuncs");
	while(rs.next()){
	}	
}


}
}
