<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- a linha abaixo faz a importação do código do topo --%>
<c:import url="topo.jsp" />

<div class="alert-success text-center espaco">
    Tela de Mensagens
</div>

<%-- A variável abaixo é substituida pelo envio do Controller --%>
<c:out value="${mensagem}" />


<%-- a linha abaixo faz a importação do código do rodapé --%>
<c:import url="rodape.jsp" />