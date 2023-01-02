//nuevo set con nombres de la familia
const lista = ["Mercè","Eduard","Júlia","Francesc"]
const miset = new Set(lista)
console.log(miset)

//Añadir nombre duplicado
miset.add("Júlia")
console.log(miset)

//Añadir nombre JavaScript
miset.add("JavaScript")
console.log(miset)