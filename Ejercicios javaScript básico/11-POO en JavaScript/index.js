class Estudiante {
    nombre;
    asignaturas;
    constructor(nombre, asignaturas){
        this.nombre=nombre;
        this.asignaturas=["JavaScript", "HTML", "CSS"];
    }
    obtenDatos(){
        console.log(`Nombre:${this.nombre}, y cursa ${this.asignaturas}.`)
    }
}

const nuevo_estudiante = new Estudiante("Juan")
console.log(nuevo_estudiante)
nuevo_estudiante.obtenDatos()
