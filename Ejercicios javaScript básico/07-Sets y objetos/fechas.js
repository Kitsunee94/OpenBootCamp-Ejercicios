//Fecha de hoy
const fecha = new Date()
console.log(fecha)

//Fecha de mi nacimiento
const nacimiento = new Date(1994,6,5)
console.log(nacimiento)

//Variable de si hoy es más tarde que mi nacimiento
console.log(fecha.getTime() > nacimiento.getTime())

//Variable que contenga el dia de mi nacimiento
console.log(nacimiento.getDate())

//Variable que contenga el mes de mi nacimiento
console.log(nacimiento.getMonth()+1)

//Variable que contenga el año de nacimiento
console.log(nacimiento.getFullYear())