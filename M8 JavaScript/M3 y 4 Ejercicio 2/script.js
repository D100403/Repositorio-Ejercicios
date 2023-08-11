const planesCredito = [
    { 
    nombre: 'Plan 001', 
    capital: 150000, 
    plazo: 30, 
    tasa: 15 
},
    { 
    nombre: 'Plan 002', 
    capital: 300000, 
    plazo: 180, 
    tasa: 10 
},
    { 
    nombre: 'Plan 003', 
    capital: 485000, 
    plazo: 60, 
    tasa: 23 
}
];

function calcularInteres(capital, plazo, tasa) {
    return (capital * plazo * tasa) / 100;
}

function procesarInversiones(arrayInversiones) {
    const resultados = [];

    for (let i = 0; i < arrayInversiones.length; i++) {
        const inversion = arrayInversiones[i];
        const interes = calcularInteres(inversion.capital, inversion.plazo, inversion.tasa);

        resultados.push({
            nombre: inversion.nombre,
            capital: inversion.capital,
            plazo: inversion.plazo,
            tasa: inversion.tasa,
            interes: interes
        });
    }

    return {
        resultados: resultados,
    };
}

const resultadoProcesamiento = procesarInversiones(planesCredito);

console.log('Resultados de los planes de crédito:');
console.log(resultadoProcesamiento.resultados);
