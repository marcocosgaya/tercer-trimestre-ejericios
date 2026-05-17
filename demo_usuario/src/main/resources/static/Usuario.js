fetch("http://localhost:8080/usuario")
    .then(r => r.json())
    .then(lista => {
        const tabla = document.getElementById("tabla-usuarios");
        tabla.innerHTML = "";

        lista.forEach(u => {
            tabla.innerHTML += `
                <tr>
                    <td>${u.id}</td>
                    <td>${u.usuario}</td>
                    <td>${u.password}</td>
                    <td>
                        <button onclick="editarUsuario(${u.id})">Modificar</button>
                        <button onclick="eliminarUsuario(${u.id})" style="color:red;">Eliminar</button>
                    </td>
                </tr>
            `;
        });
    });

function editarUsuario(id) {
    localStorage.setItem("edit_usuario", id);
    window.location.href = "usuarioEditar.html";
}

function eliminarUsuario(id) {
    if (!confirm("¿Eliminar usuario?")) return;

    fetch("http://localhost:8080/usuario/" + id, { method: "DELETE" })
        .then(() => location.reload());
}
