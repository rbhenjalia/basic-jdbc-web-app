<%-- 
    Document   : Ques1
    Created on : 22-Aug-2017, 23:05:14
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
    <font size='3 '><h1 align='center'>GAME OF THRONES</h1></font>
        <br><br>
        <form name="Reg" action ="Ques1"  method = "post">
        
           <table border = '0' align='center' cellspacing='20' >
            <tr>
                <td>
                    ENTER YOUR NAME: 
                </td>
                <td>
                    <input type="text" name="Name">
                </td>
            </tr>
          
            <tr>
                <td>
                    CHOOSE YOUR SIGIL: 
                </td>
                
                <td>
                    Dragon:<input type="radio" name="Sigil" value="Targaeryen">
                </td>
                
                <td>
                    Wolf:<input type="radio" name="Sigil" value="Stark">
                </td>
                
                <td>
                    Lion:<input type="radio" name="Sigil" value="Lannister">
                </td>
            </tr>
            
          
              <tr>
                <td>
                    CHOOSE YOUR WEAPON/S: 
                </td>
                
                <td>
                    Sword:<input type="checkbox" name="Weapon" value="Sword">
                </td>
                
                <td>
                    Hammer:<input type="checkbox" name="Weapon" value="Hammer">
                </td>
                
                <td>
                    Axe:<input type="checkbox" name="Weapon" value="Axe">
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
