// ===================== USUARIOS =====================
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


// ===================== PRODUCTOS =====================
fetch("http://localhost:8080/producto")
    .then(r => r.json())
    .then(lista => {
        const tabla = document.getElementById("tabla-productos");
        tabla.innerHTML = "";

        lista.forEach(p => {
            tabla.innerHTML += `
                <tr>
                    <td>${p.id}</td>
                    <td>${p.nombre}</td>
                    <td>${p.precio} €</td>
                    <td>${p.talla}</td>
                    <td>${p.color}</td>
                    <td>
                        <button onclick="editarProducto(${p.id})">Modificar</button>
                        <button onclick="eliminarProducto(${p.id})" style="color:red;">Eliminar</button>
                    </td>
                </tr>
            `;
        });
    });

function editarProducto(id) {
    localStorage.setItem("edit_producto", id);
    window.location.href = "productoEditar.html";
}

function eliminarProducto(id) {
    if (!confirm("¿Eliminar producto?")) return;
    fetch("http://localhost:8080/producto/" + id, { method: "DELETE" })
        .then(() => location.reload());
}


// ===================== CLIENTES =====================
fetch("http://localhost:8080/cliente")
    .then(r => r.json())
    .then(lista => {
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
    });

function editarCliente(id) {
    localStorage.setItem("edit_cliente", id);
    window.location.href = "clienteEditar.html";
}

function eliminarCliente(id) {
    if (!confirm("¿Eliminar cliente?")) return;
    fetch("http://localhost:8080/cliente/" + id, { method: "DELETE" })
        .then(() => location.reload());
}
