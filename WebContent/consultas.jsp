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
		<h2>Caderneta da Crian�a e do Adolescente</h2>
		<nav id="menu">
		<h1>MENU PRINCIPAL</h1>
		<ul type="disc">
			<li><a href="index.jsp">In�cio</a></li>
			<li><a href="paciente.jsp">Pacientes</a></li>
			<li><a href="graficos.jsp">Gr�ficos</a></li>
			<li><a href="relatorios.jsp">Relat�rios</a></li>
			<li><a href="funcionarios.jsp">Funcion�rios</a></li>
			<li><a href="login.jsp">Sair</a></li>
		</ul>
		</nav> </header>
		<section id="conteudo">
		<form method="post" action="">
			<fieldset id="InfoPaciente">
				<legend>Informa��es do Paciente</legend>
				<p>QPD:</p>
				<textarea name="tQPD" id="cQPD" cols="60" rows="4" placeholder="Digite as informa��es aqui."></textarea>
				
				<p>HDA:</p>
				<textarea name="tHDA" id="cHDA" cols="60" rows="4" placeholder="Digite as informa��es aqui."></textarea>
				
				<p>IS:</p>
				<textarea name="tHDA" id="cHDA" cols="60" rows="4" placeholder="Digite as informa��es aqui."></textarea>
			</fieldset>
			
			<fieldset id="ExameFisico"><legend>Exame f�sico</legend>
					<p>
						Peso: <input type="text" name="tPeso" id="cPeso" size="4" placeholder="Ex:3,5Kg"/>
						Comprimento:<input type="text" name="tComprimento" id="cComprimento" size="4" placeholder="Ex:50cm"/>
						Per�metro Cef�lico: <input type="text" name="tPerimetroCefalico" id="cPerimetroCefalico" size="4" placeholder="Ex:32cm"/> 
					</p>
					<textarea name="tObsExameFisico" id="cObsExameFisico" cols="60" rows="3" placeholder="Digite as informa��es aqui."></textarea>
				</fieldset>

			<fieldset id="habitosAtuais">
				<legend>Habitos/Condi��es fisiol�gicas atuais</legend>
				<table>
					<tr>
						<td>
							<fieldset id="sono">
								<legend>Sono</legend>
								<select name="sono">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">�timo</option>
								</select>
							</fieldset>
						</td>
						<td>
							<fieldset id="hu">
								<legend>HU</legend>
								<select name="hu">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">�timo</option>
								</select>
							</fieldset>
						</td>
						<td>
							<fieldset id=hi">
								<legend>HI</legend>
								<select name="hi">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">�timo</option>>
								</select>
							</fieldset>
						</td>
					</tr>
					<tr>
						<td>
							<fieldset id="atividadeFisica">
								<legend>Atividade F�sica</legend>
								<select name="atividadeFisica">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">�timo</option>>
								</select>
							</fieldset>
						</td>
						<td>
							<fieldset id=alimentacaoAtual">
								<legend>Alimenta��o Atual</legend>
								<select name="alimentacaoAtual">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">�timo</option>>
								</select>
							</fieldset>
						</td>
					</tr>
				</table>
				<p>Observa��es:</p>
				<textarea name="tObsHabitosAtuais" id="cObsHabitosAtuais" cols="60" rows="3" placeholder="Digite as informa��es aqui."></textarea>
			</fieldset>

			<fieldset id="consideracoesFinais">
				<legend>Considera��es</legend>
					<p>Diagn�sticos:</p>
					<textarea name="tObsDiagnostico" id="cObsDiagnostico" cols="60" rows="4" placeholder="Digite as informa��es aqui."></textarea>
				
				<p>Conduta:</p>
					<textarea name="tObsConduta" id="cObsConduta" cols="60" rows="3" placeholder="Digite as informa��es aqui."></textarea>
					
					<p>Observa��es finais:</p>
					<textarea name="tObsFinais" id="cObsFinais" cols="60" rows="3" placeholder="Digite as informa��es aqui."></textarea>
			</fieldset>
			<input type="submit" value="Cadastar" />
			<input type="button" value="voltar" />

		</form>
		</section>
		
	</div>
</body>
</html>