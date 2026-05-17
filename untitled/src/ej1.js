const productos = [
    {nombre: "Arroz", precio : 1.20 , cantidad : 3 },
    {nombre: "Atun" , precio : 2.50, cantidad : 10},
    {nombre: "Leche", precio: 0.90, cantidad: 6},
    {nombre : "Jamon", precio: 8.00, cantidad: 4}
];

function GenerarFactura(productos) {

    let total = 0;

    for (let i = 0; i < productos.length; i++) {

        let subtotal = productos[i].precio * productos[i].cantidad;
        let subtotalfinal = subtotal;

        if (subtotal > 20) {
            subtotalfinal = subtotal * 0.85;
            console.log(`${productos[i].nombre}: ${productos[i].precio} x ${productos[i].cantidad} = ${subtotal} → con descuento: ${subtotalfinal}`);
        } else {
            console.log(`${productos[i].nombre}: ${productos[i].precio} x ${productos[i].cantidad} = ${subtotal}`);
        }

        total += subtotalfinal;
    }

    console.log("TOTAL A PAGAR:", total);
}

GenerarFactura(productos);
