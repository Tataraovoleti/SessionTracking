<%-- 
    Document   : index
    Created on : Jun 28, 2012, 6:52:56 PM
    Author     : TATARAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Tracking</title>
        <script  type="text/javascript">
            function validate()
            {
                var name=document.f.uname;
                var val=name.value;
                if(name.value==0)
                {
                    alert("Please Enter");
                    name.focus;
                    return false;
                }
                return true;
            }
        </script>
    </head>
    <body>
        <form name="f" action="./SessionHandler" method="post" onsubmit="return validate()" >
            User name : <input type="text" name="uname" />
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>