<%-- 
    Document   : StudentDB
    Created on : 10-Aug-2017, 15:27:24
    Author     : Rahul Bhenjalia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br><br><br>
    <font size='3 '><h1 align='center'>Inserting a Record</h1></font>
        <br><br>
        <form name="Reg" action ="StudentDB"  method = "post">
        
           <table border = '0' align='center' cellspacing='20' >
            <tr>
                <td>
                    ID: 
                </td>
                <td>
                    <input type="text" name="id">
                </td>
            </tr>
          
            <tr>
                <td>
                    HERO NAME: 
                </td>
                
                <td>
                    <input type="text" name="hname">
                </td>
            </tr>
           
            <tr>
                <td> 
                    REAL NAME: 
                </td>
                <td> 
                    <input type="text" name="rname">
                </td>

            </tr>
            
            <tr>
                <td>
                    CITY: 
                </td>
                <td>
                   <input type="text" name="city">
                </td>

            </tr>
           
            <tr>
                <td>
                    AGE: 
                </td>
                <td>
                    <input type="text" name="age">
                </td>

            </tr>
 
            <tr align='center'>
                <td>
                    <input type="SUBMIT" name="SUBMIT">
                </td>
            </tr>
           </table>
 
        </form>
 
       
        
    </body>
</html>
