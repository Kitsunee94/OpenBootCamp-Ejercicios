//objeto con datos personales
const datos =
    {
    Nombre: "Carles",
    Apellido: "Brugada",
    Edad: 28,
    Altura: 1.70,
    Desarollador: false
    }

//Variable obtener edad del objeto anterior
console.log(datos.Edad)

// Lista de datos personales y un nuevo dato

const amigos =[
    {
        ...datos
    },
    {
    Nombre: "Joan",
    Apellido: "Mario",
    Edad: 22,
    Desarollador: false,
    },
    {
    Nombre: "Pere",
    Apellido: "Aran",
    Edad: 23,
    Desarollador: false,
    }
]

console.log(amigos)

//Nueva lista ordenados por edad mayor>menor
amigos.sort((a,b)=> b.Edad-a.Edad)
console.log(amigos)