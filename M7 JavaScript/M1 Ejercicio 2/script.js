let plata = plataTotal();
let gastosNece = gastosNecesarios();
let gastosOpci = gastosOpcionales();
let inversion = inversiones();
alert('Los gastos necesarios son: $'+gastosNece + 
    '\nLos gastos opcionales son: $'+gastosOpci + 
    '\nEl ahorro e inversion es: $'+inversion);

function plataTotal() {
    let plata
    do {
        plata = Number(prompt('Ingrese la cantidad de dinero:'))
    }while (!plata || plata < 0)
    return plata;
}

function gastosNecesarios() {
    return plata * 0.5;
}

function gastosOpcionales() {
    return gastosNece * 0.3;
}

function inversiones() {
    return gastosOpci * 0.2;
}