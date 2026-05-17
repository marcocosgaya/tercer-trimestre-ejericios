fetch("http://localhost:8080/detalle")
    .then(r => r.json())
    .then(lista => {

        const tabla = document.getElementById("tablaDetalle");

        lista.forEach(d => {
            tabla.innerHTML += `
                <tr>
                    <td>${d.id}</td>
                    <td>${d.cliente}</td>
                    <td>${d.usuario}</td>
                    <td>${d.producto}</td>
                    <td>${d.precio} €</td>
                    <td>${d.cantidad}</td>
                    <td>${d.fecha}</td>
                </tr>
            `;
        });
    });
