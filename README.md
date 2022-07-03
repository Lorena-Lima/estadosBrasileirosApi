<h2>Documentação</h2>
<p><b>JDK:</b> 11</p>
<p><b>Banco de Dados: </b>H2</p>
<p>

<h3>Projeto iniciado via "Spring Initializr"</h3>
-Maven Project<br>
-java<br>
-Spring Boot 2.7.1<br>

<h4>Dependencias:</h4>
-Spring Boot DevTools<br>
-Spring Web<br>
-H2 Database<br>
-Validation<br>
-Spring Data JPA<br>
</p>
<p> <h3>Requisições via Postman</h3>
<b>**POST -/api/states</b><br>

-Requisito via Body – raw – JSON<br>
-Ex. de estados para serem inseridos tipo JSON:<br>
{<br>
    "name":"São Paulo",<br>
    "region":"sudeste",<br>
    "population":"44004000000,<br>
    "capital":"São Paulo",<br>
    "area":"1521"<br>
}<br>
{<br>
    "name":" Minas Gerais ",<br>
    "region":"sudeste",<br>
    "population":"20087000000",<br>
    "capital":"Belo horizonte",<br>
    "area":"586528"<br>
}<br>
{<br>
    "name":"Alagoas",<br>
    "region":"nordeste",<br>
    "population":"3322000000",<br>
    "capital":"Maceió",<br>
    "area":"27768"<br>
}<br>
{<br>
    "name":"Rio Grande do Norte",<br>
    "region":"nordeste",<br>
    "population":"3409000",<br>
    "capital":"Natal",<br>
    "area":"52797"<br>
}<br>
{<br>
    "name":"Santa Catarina",<br>
    "region":"sul",<br>
    "population":"7165000000",<br>
    "capital":"Florianópolis",<br>
    "area":"95346"<br>
}<br>
{<br>
    "name":"Paraná",<br>
    "region":"sul",<br>
    "population":"11008000000",<br>
    "capital":"Curitiba",<br>
    "area":"199315"<br>
}<br>
{<br>
    "name":"Pará",<br>
    "region":"norte",<br>
    "population":"8074000000",<br>
    "capital":"Belém",<br>
    "area":"1248000"<br>
}<br>
{<br>
    "name":"Acre",<br>
    "region":"norte",<br>
    "population":"894470",<br>
    "capital":"Rio Branco",<br>
    "area":"161124"<br>
}<br>
{<br>
    "name":"Mato Grosso",<br>
    "region":"centro-oeste",<br>
    "population":"3567234",<br>
    "capital":"Cuiabá",<br>
    "area":"903357"<br>
}<br>
{<br>
    "name":"Goias",<br>
    "region":"centro-oeste",<br>
    "population":"6523000000",<br>
    "capital":"Goiânia",<br>
    "area":"340086"<br>
}<br><br>

<b>**GET -/api/states/{id}</b><br>
-Requisição via parâmetro na URL<br><br>
<b>**GET -/api/states</b><br>
-Requisito via parâmetro na URL.<br>
-URL = http://localhost:8080/api/states?region= {nome da região a ser pesquisada}<br><br>
<b>**PUT -/api/states/{id} </b><br>
-Requisito via Body – raw – JSON<br><br>
<b>**DELETE -/api/states/{id}</b><br>
-Requisito via parâmetro na URL.<br>
-URL = http://localhost:8080/api/states/ {ID do estado que se deseja deletar}<br>
</p>
