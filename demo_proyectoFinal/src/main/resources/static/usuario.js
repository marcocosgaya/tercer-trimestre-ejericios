fetch("http://localhost:8080/usuario")
    .then(response => response.json())
    .then(usuarios => {
        const tabla = document.getElementById("tabla-inicioSesion");

        usuarios.forEach(u => {
            const fila = document.createElement("tr");

            const tdId_usuario = document.createElement("td");
            tdId_usuario.value = u.id_usuario;

            const tdUsuario = document.createElement("td");
            tdUsuario.textContent = u.usuario;

            const tdPassword = document.createElement("td");
            tdPassword.textContent = u.password;

            const tdFecha_creacion = document.createElement("td");
            tdFecha_creacion.textContent = u.fecha_creacion;

            const tdUltimo_login = document.createElement("td");
            tdUltimo_login.textContent = u.ultimo_login;

            fila.appendChild(tdId_usuario)
            fila.appendChild(tdUsuario);
            fila.appendChild(tdPassword);
            fila.appendChild(tdFecha_creacion);
            fila.appendChild(tdUltimo_login);

            tabla.appendChild(fila);
        });
    });