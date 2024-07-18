console.log("No sé que hice, pero creo que se logro!!😁❤️");


let gente = ["María", "Dani", "Luis", "Juan", "Camila"];

// Imprimir todas las personas de la lista
console.log("Personas en la lista:");
for (let persona of gente) {
  console.log(persona);
}

// Eliminar "Dani" de la matriz
let indexDani = gente.indexOf("Dani");
if (indexDani !== -1) {
  gente.splice(indexDani, 1);
}
console.log(gente);

// Eliminar "Juan" del array
let indexJuan = gente.indexOf("Juan");
if (indexJuan !== -1) {
  gente.splice(indexJuan, 1);
}
console.log(gente);

// Mover "Luis" al frente de la matriz
let indexLuis = gente.indexOf("Luis");
if (indexLuis !== -1) {
  let luis = gente.splice(indexLuis, 1); // saca a Luis
  gente.unshift(luis[0]); // lo pone al frente
}
console.log(gente);

// Agregar tu nombre al final de la matriz
let miNombre = "Marbe";
gente.push(miNombre);
console.log(gente);

// Iterar a través de la matriz y salir después de imprimir "Maria"
for( let i = 0; i < gente; i++ ){
    console.log(i, gente[i] );
    if( gente[i] === "María" ) break; 
  }

console.log("María")

// Encontrar el indexOf donde se encuentra "Maria"
let indexMaria = gente.indexOf("María");
console.log("Index de 'Maria':", indexMaria);

// Al final del ejercicio, debería haber 4 personas en la formación
console.log("Personas al final del ejercicio:", gente);

