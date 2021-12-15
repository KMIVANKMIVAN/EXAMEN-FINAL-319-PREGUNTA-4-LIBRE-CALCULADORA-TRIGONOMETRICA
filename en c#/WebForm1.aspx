<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="FIBONA.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <a>DIGITE EL NUMERO PARA CALCULAR EL SENO</a><br />
            <asp:TextBox ID="txtNum1" type="number" runat="server"></asp:TextBox><br />
            <asp:Button ID="btnCal" runat="server" Text="VER EL SENO" OnClick="btnCal_Click" /><br />
            <asp:Label ID="lblRes" runat="server" Text=""></asp:Label><br />
            <a>DIGITE EL NUMERO PARA CALCULAR EL COSENO</a><br />
            <asp:TextBox ID="txtNum2" type="number" runat="server"></asp:TextBox><br />
            <asp:Button ID="btnCa2" runat="server" Text="VER EL COSENO" OnClick="btnCal_Click" /><br />
            <asp:Label ID="lblRes2" runat="server" Text=""></asp:Label><br />
            <a>DIGITE EL NUMERO PARA CALCULAR LA TANGENTE</a><br />
            <asp:TextBox ID="txtNum3" type="number" runat="server"></asp:TextBox><br />
            <asp:Button ID="btnCa3" runat="server" Text="VER LA TANGENTE" OnClick="btnCal_Click" /><br />
            <asp:Label ID="lblRes3" runat="server" Text=""></asp:Label>
        </div>
    </form>
</body>
</html>
