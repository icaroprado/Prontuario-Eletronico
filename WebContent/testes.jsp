<%@ page language="java" import="java.sql.*, model.*"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<head>  
   <title>Teste de Conexão</title>  
</head>  
  
<body>  

<%  
   Connection con;  
   Statement stm;  
  
   try {  
  
      /*Class.forName("org.postgresql.Driver");  
      con = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProntuarioDB","icaro","brook1norris2");  
      stm = con.createStatement();   */
      con = new ConnectionFactory().getConnection();
      out.println("Conexão efetuada com sucesso");
      FacadeServicos fachada = new FacadeServicos(con);
      Pediatra joao = new Pediatra();
      joao.setcPF("00012345679");
      joao.setcRM(01);
      joao.setEmail("blabla@gmail.com");
      joao.setLogin("joaozin");
      joao.setSenha("jo1ao2zin3");
      joao.setNome("Joao da Silva");      
      joao.setTelefone("79 999998888");
      fachada.cadastrarPediatra(joao);
      out.println("Pediatra inserido no banco!");
      Pediatra teste;
      teste = fachada.realizarLogin(joao.getLogin(), joao.getSenha());
      out.println(teste.getNome());      
      con.close();      
      
   } catch (Exception e) {  
      out.println("Não foi possível conectar ao banco " + e.getMessage()); 
      
   }
   
%>  
  
</body> 
