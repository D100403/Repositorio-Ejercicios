const edad = Number(prompt('Ingresar tu edad:'))

if (edad < 18 || !edad) {
    alert('Error, usuario menor de edad o dato incorrecto')
}else {
    alert('Bienvenido usuario')
}