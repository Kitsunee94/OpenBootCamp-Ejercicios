//Lista de la compra original
const compra = ["Arroz", "leche", "fruta", "galletas", "carne"];
console.log(compra);
//añadimos aceite de girasol
compra.push("Aceite de Girasol")
console.log(compra)
//retiramos aceite de Girsasol de la lista
compra.pop("Aceite de Girasol")
console.log(compra)

//Lista de mir tres peliculas favoritas
const peliculas= [
    {
        titulo:"High School Musical",
        director: "Kenny Ortega",
        fecha: 2006,
    },
    {
        titulo:"Hannah Montana: La Pel·lícula",
        director: "Peter Chelsom",
        fecha: 2009,
    },
    {
        titulo:"The Greatest Showman",
        director: "Micheal Gracey",
        fecha: 2017,
    }
]
console.log(peliculas)

// Nueva lista con pelicula posterior al 1 de enero de 2010( con filter)
const nuevaLista = peliculas.filter(obj=> obj.fecha >2010)
console.log(nuevaLista)

//Nueva lista con los directores de la lista de peliculas original ( con map)
const listaDirectores = peliculas.map(nombres =>nombres.director)
console.log(listaDirectores)

//Nueva lista de titulos de peliculas
const listaPeliculas = peliculas.map (nombres =>nombres.titulo)
console.log (listaPeliculas)

//Lista concatene lista directores y titulos
console.log(listaDirectores.concat(listaPeliculas))

//LISTA DIRECTORES, LISTA TITULOS (PROPAGACIÓN)
const listaPropagacion =[...listaDirectores, ...listaPeliculas]
console.log(listaPropagacion)