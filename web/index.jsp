<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Project1Task1</title>
    </head>

    <body>
        <form action="ComputeHashes" method="get">
            <fieldset>
            <legend>Project1 Task1:</legend>

                Please enter text:		
		<input type="text" name="inputText" required/><br>		
		
		Please choose Hash Function:
		<input type="radio" name="inputAlgo" value="MD5" checked>
                MD5
                <input type="radio" name="inputAlgo" value="SHA-1">
                SHA-1<br>
                <input type="submit" value="submit">			
            </fieldset>
	</form>
    </body>
</html>

