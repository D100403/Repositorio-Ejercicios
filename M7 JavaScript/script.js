let costosFijos = costosF();
let precioVenta = precioV();
let costosVariables = costosVar();
let cv = puntoEqui();
alert('El punto de equilibrio es: $'+ cv)

function costosF() {
    let costos
    do {
        costos = Number(prompt('Ingrese los costos fijos'));
    }while (!costos || costos < 0)
    return costos;
}

function precioV() {
    let ventas
    do {
        ventas = Number(prompt('Ingrese el precio de Venta'));
    }while (!ventas || ventas < 0)
    return ventas;
}

function costosVar() {
    let costosVar
    do {
        costosVar = Number(prompt('Ingrese los costos variables'));
    }while (!costosVar || costosVar < 0)
    return costosVar;
}

function puntoEqui() {
    return (precioVenta - costosVariables) / costosFijos;
}