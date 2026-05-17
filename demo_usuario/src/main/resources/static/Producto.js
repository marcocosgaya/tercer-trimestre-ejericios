// Cargar lista de productos
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
    })
    .catch(err => console.error("Error cargando productos:", err));


// Botón editar
function editarProducto(id) {
    localStorage.setItem("edit_producto", id);
    window.location.href = "productoEditar.html";
}


// Botón eliminar
function eliminarProducto(id) {
    if (!confirm("¿Eliminar producto?")) return;

    fetch("http://localhost:8080/producto/" + id, {
        method: "DELETE"
    })
        .then(() => location.reload())
        .catch(err => console.error("Error eliminando producto:", err));
}
