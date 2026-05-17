const form = document.getElementById("form-usuario");

form.addEventListener("submit", function (event) {
    event.preventDefault(); // evita que recargue la página

    const id_usuario = document.getElementById("id_usuario").value;
    const usuario = document.getElementById("usuario").value;
    const password = document.getElementById("password").value;
    const fecha_creacion = document.getElementById("fecha_creacion").value;
    const ultimo_login = document.getElementById("ultimo_login").value;

    const nuevoUsuario = {
        id_usuario: id_usuario,
        usuario: usuario,
        password: password,
        fecha_creacion: fecha_creacion,
        ultimo_login: ultimo_login
    };

    fetch("http://localhost:8080/usuario", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(nuevoUsuario)
    }).then(() => {
        // volver al listado
        window.location.href = "usuario.html";
    });
});