package org.bbspjt;
import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class mysqlTest1 {

 private static final String DRIVER = "com.mysql.jdbc.Driver";
 private static final String URL = "jdbc:mysql://localhost:3306/bbs_sp?characterEncoding=UTF-8&serverTimezone=JST";
 private static final String USER = "scott";
 private static final String PW = "tiger";
 
 @Test
 public void testConnection() throws Exception{
  Class.forName(DRIVER);
  try(Connection con = DriverManager.getConnection(URL, USER, PW)){
	System.out.println("成功");
	System.out.println(con);
  }catch (Exception e) {
	System.out.println("エラー発生");
	e.printStackTrace();
  }
 }

}

