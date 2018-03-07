<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" rel="stylesheet">
<link href="css/formulario.css" rel="stylesheet">
<title>Olhar Materno</title>
</head>
<body>
<div id="interface">
		<header id="cabecalho">
			<h1>Olhar Materno</h1>
			<h2>Caderneta da Criança e do Adolescente</h2>
			<nav id="menu">
			<h1>MENU PRINCIPAL</h1>
				<ul type="disc">
					<li><a href="index.jsp">Início</a></li>
					<li><a href="paciente.jsp">Pacientes</a></li>
					<li><a href="graficos.jsp">Gráficos</a></li>
					<li><a href="relatorios.jsp">Relatórios</a></li>
					<li><a href="funcionarios.jsp">Funcionários</a></li>
					<li><a href="login.jsp">Sair</a></li>
				</ul>
			</nav>
				
		</header>
		<section id="conteudo">
			<form method="post" action="">
				<fieldset>
					<p>
					<a href="cadastroPaciente.jsp"><button type="button" name="inserirPaciente">Cadastrar novo paciente</button></a>
					</p>
					<p>	  				
	  				<button type="button" name="inserirPaciente">Listar pacientes</button>
	  				</p>
				
					<p>
					<label for="busca">Buscar paciente:</label>
					</p>
	  				<input type="search" id="busca" name="paciente" pleceholder="Buscar...">
	  				<button type="submit">OK</button>
  				</fieldset>
			</form>
		</section>
		

	</div>
</body>
</html>