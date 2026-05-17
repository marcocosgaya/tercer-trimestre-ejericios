console.log("Cliente.js cargado correctamente");

// Cargar lista de clientes
fetch("http://localhost:8080/cliente")
    .then(r => r.json())
    .then(lista => {
        console.log("Clientes recibidos:", lista);

        const tabla = document.getElementById("tabla-clientes");
        tabla.innerHTML = "";

        lista.forEach(c => {
            tabla.innerHTML += `
                <tr>
                    <td>${c.id}</td>
                    <td>${c.nombre}</td>
                    <td>${c.email}</td>
                    <td>${c.telefono}</td>
                    <td>
                        <button onclick="editarCliente(${c.id})">Modificar</button>
                        <button onclick="eliminarCliente(${c.id})" style="color:red;">Eliminar</button>
                    </td>
                </tr>
            `;
        });
    })
    .catch(err => console.error("Error cargando clientes:", err));


// Botón editar
function editarCliente(id) {
    console.log("Editar cliente:", id);
    localStorage.setItem("edit_cliente", id);
    window.location.href = "clienteEditar.html";
}


// Botón eliminar
function eliminarCliente(id) {
    console.log("Eliminar cliente:", id);

    if (!confirm("¿Eliminar cliente?")) return;

    fetch("http://localhost:8080/cliente/" + id, {
        method: "DELETE"
    })
        .then(() => location.reload())
        .catch(err => console.error("Error eliminando cliente:", err));
}
