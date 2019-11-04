/**
*Title:           Cota��o ON
*Version:         v1.0
*Data Atualiza��o 19/02/2001
*Copyright:       Copyright (c) 2000
*Author:          Eduardo Jorge / Ant�nio Oliveira Filho
*Company:         Criativa Web
*Description:     Sistema de Cota��o para Web
**/


import java.sql.*;




/**
  * Classe para estabelecer conex�o com Banco de Dados
  * Oracle via JODBC. Esta classe utilizar� o drive
  * da Oracle padr�o para JDK 1.2.
  *
  */

public class BDjdbc extends BD implements java.io.Serializable {
  static BDjdbc bdjdbc= new BDjdbc();

  private String dataSource;


  public BDjdbc() {
    
  }
  
  public void setDataSource(String dataSource){
  	this.dataSource = dataSource;
  }

  

  /**
  * M�todo responsavel por fazer a conexao com o
  * Banco atraves de um driver JDBC e do objeto
  * conn.
  *
  * @throws Exception Contendo a descri��o do erro
  * que poder� vir acontecer se houver algum problema
  * na conexao com o Banco de Dados.
  */
  public void setConexao() throws
    Exception {
      try {
    /*
        //Interbase
          String driverName = "interbase.interclient.Driver";
          System.out.println("Conectando com o BancoX .....");
        
          Class.forName (DriverUtilities.getDriver(DriverUtilities.MSSQL));
          String url = this.dataSource;
          System.out.println(url);
          DriverManager.setLoginTimeout(10);
          conn = DriverManager.getConnection(url,this.login,this.senha);*/
    	      String driver = "com.mysql.jdbc.Driver";

 		 
 		 Class.forName(driver);

 		 String url = "jdbc:mariadb://localhost:3306/escola";

 		
 		 this.conn = DriverManager.getConnection(url, "root", "root" );
 		 
          conn.setAutoCommit(false);
       }catch (Exception e){
           System.out.println(e);
          throw  e;
      }
  }

  /**
  * M�todo que pega o objeto Conn que contem a
  * conexao com Banco de Dados.
  *
  * @return Connection Objeto que encapsula
  * metodos para conexao com o Banco de Dados.
  */

  

  

  public String toString (){
         return "Login = " + this.login + " Senha = " + this.senha;


}

    public static void main(String args[])throws Exception {

        // BDjdbc conexao = new BDjdbc();


            String driver = "org.mariadb.jdbc.Driver";


            Class.forName(driver);

                String url = "jdbc:mariadb://localhost:3306/escola";


                 Connection c= DriverManager.getConnection(url, "root",null );
                 System.out.println(c.getCatalog());



    }
}
