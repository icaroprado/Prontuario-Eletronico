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
      
      Paciente joao = new Paciente();
      joao.setCpfMae("00123456789");
      joao.setCpfPai("00123456787");
      joao.setDataNascimento("26/09/1990");
      joao.setGrupoSanguineo(1);
      joao.setNaturalidade("BRporra!");
      joao.setNomeMae("Dona Maria");
      joao.setNomePai("Seu jose");
      joao.setNumeroCartaoSus("3541246");
      joao.setNumeroDeclaracaoNascidoVivo("6476");
      joao.setNumeroRegistroCivilNascimento("3972");
      joao.setPrimeiroNome("Joao");
      joao.setSobrenome("Da Silva");
      joao.setRacaCorEtnia("pardo");
      joao.setRg("3086777-2");
      joao.setSexo('M');
      joao.setNumeroProntuario("1");      
      fachada.cadastrarPaciente(joao);
      
Pediatra jose = new Pediatra();
      jose.setcPF("00012345679");
      jose.setcRM(01);
      jose.setEmail("blabla@gmail.com");
      jose.setLogin("joaozin");
      jose.setSenha("jo1ao2zin3");
      jose.setNome("Joao da Silva");      
      jose.setTelefone("79 999998888");
      fachada.cadastrarPediatra(jose);
      Pediatra teste2;
      teste2 = fachada.realizarLogin(jose.getLogin(), jose.getSenha());
      out.println(jose.getNome());      
      
      Paciente teste;
      teste = fachada.buscarPaciente("1");
      out.println(" o rg de fulano eh " + teste.getRg() );


	  fachada.registrarConsulta("1",01,"08/03/2018","dores de garganta","novamente","foi efetuado o interrogatorio", 50.320 , 1.60 , 12.3 , "tudo ok no exame fisico", "virose haha", "toma doril" , "sem observacoes");

      //fachada.registrarConsulta("01",1,"08/03/2018","dores de garganta","novamente","foi efetuado o interrogatorio", 50.320 , 1.60 , 12.3 , "tudo ok no exame fisico", "virose haha", "toma doril" , "sem observacoes");
      out.println("Consulta registrada com sucesso!!!!");
      con.close();      
      
   } catch (Exception e) {  
      out.println("Não foi possível conectar ao banco " + e.getMessage()); 
      
   }
   
%>  
  
</body> 
