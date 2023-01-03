// Función sin parámetros que deuvelve siempre "true"
function devuelveTrue(){
    return true
}

//funcion asíncrona que utlice seTimeout y pase por consola un "Hola soy una promera" 5 sec después
async function devuelvePromesa() {
    return setTimeout(() => console.log("Hola soy una promera"), 5000)
}

//función generadora de índices pares automáticos
function* generaPar (){
    let id = 0;
    while(true){
        yield id +=2
    }
}
const gen =generaPar();

console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
console.log(gen.next().value)
