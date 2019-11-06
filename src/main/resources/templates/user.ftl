<html>
    <head>
        <title>spring boot</title>
    </head>

    <body>
        <table border="1px">
            <thead>
            <tr>
                <td>id</td>
                <td>用户名</td>
                <td>密码</td>
                <td>姓名</td>
            </tr>
            </thead>
            <tbody>
                <#list userList as user>
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <td>${user.password}</td>
                        <td>${user.name}</td>
                    </tr>
                </#list>
            </tbody>
        </table>
    </body>
</html>