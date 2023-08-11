

const year = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio','Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
const meses = year.length - 1;

var i = 0;
const resultados = [];

do {
    let ingreso = Number(prompt('Ingresos de ' + year[i]));
    let egreso = Number(prompt('Egresos de ' + year[i]));

    let resultado = analizarFlujoCaja(ingreso, egreso);

    resultados.push(`${year[i]}: ${resultado}`);
    
    i++;
} while (i <= meses);

console.log('Resultados:');
for (const resultado of resultados) {
    console.log(resultado);
}

function analizarFlujoCaja(ingreso, egreso) {
    if (ingreso > egreso) {
        return -1;
    } else if (ingreso < egreso) {
        return 1;
    } else {
        return 0;
    }
}