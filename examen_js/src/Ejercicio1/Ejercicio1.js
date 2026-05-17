const productos = [
    {nombre: "Arroz", precio : 1.20 , cantidad : 3 },
    {nombre: "Atun" , precio : 2.50, cantidad : 10} ,
    {nombre: "Leche", precio: 0.90, cantidad:6},
    {nombre : "Jamon ", precio:8.00, cantidad:4}

];

function GenerarFactura (productos) {

    let subtotal=0;
    let subtotalfinal=0;
    let total =0;

    for(let i=0;i<productos.length;i++){
        subtotal=productos[i].precio * productos[i].cantidad
        if(subtotal>20){
            subtotalfinal=(subtotal*85)/100

            console.log(productos[i].nombre + " " + productos[i].cantidad+  " x " + productos[i].precio + " " + subtotal + " con descuento se queda en : " + subtotalfinal)

            total=total+subtotalfinal




        }else{

            console.log(productos[i].nombre + " " + productos[i].cantidad+  " x " + productos[i].precio + " " + subtotal)

            total=total+subtotal

        }











    }

    console.log("el total es:" + total)



};

GenerarFactura(productos);


