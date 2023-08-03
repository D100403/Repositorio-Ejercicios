const user = prompt('Usuario:')
const pass = prompt('Clave:')

const userValidacion = user === 'admin'
const passValidacion = Number(pass) === 1234

if (userValidacion && passValidacion) {
    alert('Bienvenido ' + user)
}else {
    alert('ERROR: Usuario o clave incorrecta')
}
