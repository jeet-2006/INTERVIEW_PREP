<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% try{
			String[] params = request.getParameterValues("paramname");
			
			out.println("params:"+ request.getParameterValues("paramname"));
			out.println("params:"+ request.getParameter("numb1"));
			out.println("params:"+ request.getParameter("numb2"));
			Map<String, String[]> parameterMap = request.getParameterMap();
			
			   // Loop through and print all request parameters
			   for (String paramName : parameterMap.keySet()) {
			       String[] paramValues = parameterMap.get(paramName);
			       for (String paramValue : paramValues) {
			           out.println("Parameter Name: " + paramName + ", Value: " + paramValue);
			       }
			   }
			int n1 = Integer.parseInt(request.getParameter("numb1"));
			int n2 = Integer.parseInt(request.getParameter("numb2"));
			//String clusterId = request.getParameter("CLUSTERID");
			
			//out.println("CLUSTERID: "+ clusterId);
			
			/*for(int i=0;i<params.length;i++) {
				String paramname=params[i];
				String paramvalue=request.getParameter(paramname);
				out.println("paramname:"+ paramname);
				out.println("paramvalue:"+ paramvalue);
			}*/
			//Map<String, String[]> parameterMap = request.getParameterMap();
	
			   // Loop through and print all request parameters
			   /*for (String paramName : parameterMap.keySet()) {
			       String[] paramValues = parameterMap.get(paramName);
			       for (String paramValue : paramValues) {
			           out.println("Parameter Name: " + paramName + ", Value: " + paramValue);
			       }
			   }*/
			int ans = n1 + n2;
			out.println(n1);
		} catch(Exception e){
			 %>
	            <p>An exception occurred:</p>
	            <p><%= e.getMessage() %></p>
	            <p>Stack Trace:</p>
	            <pre><%= e.getStackTrace() %></pre>
	    <%
	        }
	    %>
	
	HELLO
</body>
</html>