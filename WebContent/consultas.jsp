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
		</nav> </header>
		<section id="conteudo">
		<form method="post" action="">
			<fieldset id="InfoPaciente">
				<legend>Informações do Paciente</legend>
				<p>QPD:</p>
				<textarea name="tQPD" id="cQPD" cols="60" rows="4" placeholder="Digite as informações aqui."></textarea>
				
				<p>HDA:</p>
				<textarea name="tHDA" id="cHDA" cols="60" rows="4" placeholder="Digite as informações aqui."></textarea>
				
				<p>IS:</p>
				<textarea name="tHDA" id="cHDA" cols="60" rows="4" placeholder="Digite as informações aqui."></textarea>
			</fieldset>
			
			<fieldset id="ExameFisico"><legend>Exame físico</legend>
					<p>
						Peso: <input type="text" name="tPeso" id="cPeso" size="4" placeholder="Ex:3,5Kg"/>
						Comprimento:<input type="text" name="tComprimento" id="cComprimento" size="4" placeholder="Ex:50cm"/>
						Perímetro Cefálico: <input type="text" name="tPerimetroCefalico" id="cPerimetroCefalico" size="4" placeholder="Ex:32cm"/> 
					</p>
					<textarea name="tObsExameFisico" id="cObsExameFisico" cols="60" rows="3" placeholder="Digite as informações aqui."></textarea>
				</fieldset>

			<fieldset id="habitosAtuais">
				<legend>Habitos/Condições fisiológicas atuais</legend>
				<table>
					<tr>
						<td>
							<fieldset id="sono">
								<legend>Sono</legend>
								<select name="sono">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">Ótimo</option>
								</select>
							</fieldset>
						</td>
						<td>
							<fieldset id="hu">
								<legend>HU</legend>
								<select name="hu">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">Ótimo</option>
								</select>
							</fieldset>
						</td>
						<td>
							<fieldset id=hi">
								<legend>HI</legend>
								<select name="hi">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">Ótimo</option>>
								</select>
							</fieldset>
						</td>
					</tr>
					<tr>
						<td>
							<fieldset id="atividadeFisica">
								<legend>Atividade Física</legend>
								<select name="atividadeFisica">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">Ótimo</option>>
								</select>
							</fieldset>
						</td>
						<td>
							<fieldset id=alimentacaoAtual">
								<legend>Alimentação Atual</legend>
								<select name="alimentacaoAtual">
									<option value="ruim">Ruim</option>
									<option value="regular">Regular</option>
									<option value="otimo">Ótimo</option>>
								</select>
							</fieldset>
						</td>
					</tr>
				</table>
				<p>Observações:</p>
				<textarea name="tObsHabitosAtuais" id="cObsHabitosAtuais" cols="60" rows="3" placeholder="Digite as informações aqui."></textarea>
			</fieldset>

			<fieldset id="consideracoesFinais">
				<legend>Considerações</legend>
					<p>Diagnósticos:</p>
					<textarea name="tObsDiagnostico" id="cObsDiagnostico" cols="60" rows="4" placeholder="Digite as informações aqui."></textarea>
				
				<p>Conduta:</p>
					<textarea name="tObsConduta" id="cObsConduta" cols="60" rows="3" placeholder="Digite as informações aqui."></textarea>
					
					<p>Observações finais:</p>
					<textarea name="tObsFinais" id="cObsFinais" cols="60" rows="3" placeholder="Digite as informações aqui."></textarea>
			</fieldset>
			<input type="submit" value="Cadastar" />
			<input type="button" value="voltar" />

		</form>
		</section>
		
	</div>
</body>
</html>