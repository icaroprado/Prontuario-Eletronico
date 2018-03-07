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
			<fieldset id="paciente">
				<legend>Identifica��o do paciente</legend>
				<p>
					Primeiro nome:<input type="text" name="tPrimeiroNome"
						id="cPrimeiroNome" size="25" maxlength="30"
						placeholder="Ex: Jo�o Miguel" />
				</p>
				<p>
					Sobrenome:<input type="text" name="tSobrenome" id="cSobrenome"
						size="25" maxlength="30" placeholder="Ex: Santos de Oliveira" />
				</p>
				<p>
					Data de Nascimento:<input type="date" name="tNasc" id="cNasc" />
				</p>

				<table>
					<tr>
						<td>
							<fieldset id="sexo">
								<legend>Sexo</legend>
								<select name="sexo">
									<option value="fem">Feminino</option>
									<option value="masc">Masculino</option>
								</select>
							</fieldset>
						</td>
						<td>
							<fieldset id="corDaPele">
								<legend>Cor da pele</legend>
								<select name="cor">
									<option value="branca">Branca</option>
									<option value="negra">Negra</option>
									<option value="parda">Parda</option>
									<option value="amarela">Amarela</option>
								</select>
							</fieldset>
						</td>
						<td>
							<fieldset id=tipoSanquineo">
								<legend>Tipo sanqu�neo</legend>
								<select name="sangue">
									<option value="a+">A+</option>
									<option value="b+">B+</option>
									<option value="o+">O+</option>
									<option value="ab+">AB+</option>
									<option value="a-">A-</option>
									<option value="b-">B-</option>
									<option value="o-">O-</option>
									<option value="ab-">AB-</option>
								</select>
							</fieldset>
						</td>
					</tr>
				</table>

				<p>
					Naturalidade:<input type="text" name="tNaturalidade" id="cNome"
						size="30" maxlength="40" placeholder="Cidade onde nasceu" />
				</p>
				<p>
					N� Cart�o do SUS:<input type="text" name="tCartaoSUS"
						id="tCartaoSUS" size="10" maxlength="12" />
				</p>
				<p>
					N� Declara��o Nasc.:<input type="text" name="tDeclaracaoNasc"
						id="tDeclaracaoNasc" size="10" maxlength="12" />
				</p>
				<p>
					N� Registro civil:<input type="text" name="tRegistroCivil"
						id="tRegistroCivil" size="10" maxlength="12" />
				</p>
			</fieldset>

			<fieldset id="endereco">
				<legend>Endere�o do paciente</legend>
				<p>
					Logradouro:<input type="text" name="tRua" id="cRua" size="32"
						maxlength="60" placeholder="Rua, Av. Travessa, ..." /> N�mero:<input
						type="number" name="tNum" id="cNum" size="5" min="0" max="99999" />
				</p>
				<p>
					Estado: <select name="estados-brasil">
						<option value="AC">Acre</option>
						<option value="AL">Alagoas</option>
						<option value="AP">Amap�</option>
						<option value="AM">Amazonas</option>
						<option value="BA">Bahia</option>
						<option value="CE">Cear�</option>
						<option value="DF">Distrito Federal</option>
						<option value="ES">Esp�rito Santo</option>
						<option value="GO">Goi�s</option>
						<option value="MA">Maranh�o</option>
						<option value="MT">Mato Grosso</option>
						<option value="MS">Mato Grosso do Sul</option>
						<option value="MG">Minas Gerais</option>
						<option value="PA">Par�</option>
						<option value="PB">Para�ba</option>
						<option value="PR">Paran�</option>
						<option value="PE">Pernambuco</option>
						<option value="PI">Piau�</option>
						<option value="RJ">Rio de Janeiro</option>
						<option value="RN">Rio Grande do Norte</option>
						<option value="RS">Rio Grande do Sul</option>
						<option value="RO">Rond�nia</option>
						<option value="RR">Roraima</option>
						<option value="SC">Santa Catarina</option>
						<option value="SP">S�o Paulo</option>
						<option selected value="SE">Sergipe</option>
						<option value="TO">Tocantins</option>
					</select> Cidade:<input type="text" name="tCidade" id="cCidade" size="30"
						maxlength="60" pleceholder="Sua cidade" />
				</p>
			</fieldset>

			<fieldset id="responsaveis">
				<legend>Respons�veis pelo paciente</legend>
				<fieldset>
					<legend>Pai</legend>
					<p>
						Pai:<input type="text" name="tNomePai" id="tNomePai" size="50"
							maxlength="60" pleceholder="teste" />
					</p>
					<p>
						CPF:<input type="text" name="tCPFPai" id="tCPFPai" size=""
							maxlength="14" pleceholder="Ex: 123.456.789.00" /> Telefone:<input
							type="text" name="tTelefonePai" id="tTelefonePai" size="10"
							maxlength="10" pleceholder="Ex: 0000-0000" />
					</p>
					<p>
						Celular:<input type="text" name="tCelularPai" id="tCelularPai"
							size="11" maxlength="11" pleceholder="Ex: 90000-0000" />
					</p>
				</fieldset>
				<fieldset>
					<legend>M�e</legend>
					<p>
						M�e:<input type="text" name="tNomeMae" id="tNomeMae" size="50"
							maxlength="60" />
					</p>
					<p>
						CPF:<input type="text" name="tCPFMae" id="tCPFMae" size=""
							maxlength="14" pleceholder="ex: 123.456.789.00" /> Telefone:<input
							type="text" name="tTelefoneMae" id="tTelefoneMae" size="10"
							maxlength="10" pleceholder="Ex: 0000-0000" />
					</p>
					<p>
						Celular:<input type="text" name="tCelularMae" id="tCelularMae"
							size="11" maxlength="11" pleceholder="Ex: 90000-0000" />
					</p>
				</fieldset>
			</fieldset>
			<input type="submit" value="Cadastar" />
			<a href="paciente.jsp"><input type="button" value="voltar" /></a>

		</form>
		</section>

	</div>
</body>
</html>