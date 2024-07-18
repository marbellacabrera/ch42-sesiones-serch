console.log("sesion js02");

// =======================================================================

/*
https://developer.mozilla.org/es/docs/Web/JavaScript/Guide/Functions

Función: Conjunto de instrucciones que realiza una tarea o calcula un valor.
  Código que se puede reutilizar.


  ----------- Funciones declaradas --------------
    (function declaration, function statement)
Una característica de las funciones declaradas es que tien hoisting.

sintaxis:
    function nombreFuncionCamelCase ( parámetros ){
        //cuerpo de la función
        instrucciones;
    }

hoisting: comportamiento en JS que permite a las declaración de variables(var)
o funciones se eleven al comienzo de su ámbito antes de que se ejecute el código.

*/
console.log( greeting()  );

function greeting(){
    return "Hola Ch42, extrañamos a Tan y a Nan";
}



/*
 ------------ Funciones expresadas -----------------------
            (function expressions)
Son funciones declaradas dentro de la asignación de una variable.
Estas funciones pueden ser anónimas ( no tienen nombre ).
Las funciones expresadas no tiene hoisting, porque no se
carga en memoria hasta que se utilice.

sintaxis:
    const nombreVariable = function nombreFuncion (parámetros){
        instrucciones;
    };
    */

    const saludo = function greeting2( name ){
    return `Hola, me llamo ${name} y tengo hambre`; 
} ;

console.log( saludo("Marbe") );

// Realizar una función que reciba un palabra y retorne la palabra en minúscula
// Realizar dos versiones de función:  función declarada y función expresa.

/** Realizar la función acá */
// uso de la función
console.log( wordToLowerCase("YUPI YUPI El MUÑECO CHUKY") ); // yupi yupi el muñeco chuky

//***Respuesta***
//Función declarada
function wordToLowerCase(phrase){
    return phrase.toLowerCase();
}
//Función expresada
const wordToLowerCase2 = function (phrase){
    return phrase.toLowerCase();
}
// uso de la función
console.log( wordToLowerCase("YUPIII YUPI EL MUÑECO CHUCKY")); //yupiii yupi el muñeco chucky

/*
 ------------ Funciones flecha -----------------------
             (arrow functions)
Funciones similares a las funciones expresadas pero:
 - No requiere la palabra reservada function
 - Si tiene una solo instrucción no requiere las llaves {}
 - Si la instrucción es el mismo retorno, no requiere la palabra return

sintaxis:
    const nombreVariable = (parametros) => instrucción;

    Si en una arrow function se utilizan las {} se debe agregar explicitamente la palabra returno para retornar un valor.

    const nombreVariable = (parametros) => {
        instrucción;
        return expresión;
    }
*/

//Realizar una función expresada para calcular el área de un rectangulo. 
/**TODO: crear la función */
const areaRectangle = function area( base , altura ){
    return base * altura;
   }

   const calculoAreaRectangulo = (base, altura) => base * altura ;

const calculoAreaRectanguloVer2 = (base, altura) => { 
   return  base * altura 
};

//uso de la función
console.log(`El área de rectángulo es ${ areaRectangle( 6, 4) }`); // 24

// Realizar una Arrow function que calcule el impuesto de un valor
/** TODO calcular el impuesto de un valor */
const calcularImpuesto = (valor, impuesto) => valor*impuesto;

// caso de uso:
console.log( `El impuesto de los calcetines es: ${calcularImpuesto(70.50, .16 ) }`)

console.log( `El impuesto de los calcetines es: ${calcularImpuesto(100, .16 ) }`); // 16

// **Ejercicio practica**

// ==================================================================
// Ejercicios: Convertir las siguientes funciones a Arrow functions.

/** Función 1: Sumar dos números */
/*function sumar(a, b) {
    return a + b;
}*/
const sumar = (a,b) => a + b;

console.log( `La suma de 100 + 5 = ${sumar(100,5)}`); // 105

/** Función 2: Verificar si un número es par */
/*function esPar(num) {
    return num % 2 === 0;
}*/
const esPar = num => num % 2 === 0;

console.log( `El número 18 es par? ${esPar(18)}`); // true
console.log( `El número 23 es par? ${esPar(23)}`); // false

/** Función 3: Verificar si tres números terminan con el mismo dígito */
/* function mismosUltimosDigitos(num1, num2, num3) {
    const ultimoDigito1 = num1 % 10;
    const ultimoDigito2 = num2 % 10;
    const ultimoDigito3 = num3 % 10;
    return ultimoDigito1 === ultimoDigito2 && ultimoDigito1 === ultimoDigito3;
} */
const mismosUltimosDigitos = (num1, num2, num3) =>{
    const ultimoDigito1 = num1 % 10; // 3
    const ultimoDigito2 = num2 % 10; // 3
    const ultimoDigito3 = num3 % 10; // 3
    return ultimoDigito1 === ultimoDigito2 && ultimoDigito1 === ultimoDigito3;
};


console.log(`El num. 23, 203 y 1013 terminan en 3? ${mismosUltimosDigitos(23,203,1013)}`);
console.log(`El num. 24, 203 y 1013 terminan en 3? ${mismosUltimosDigitos(24,203,1013)}`);


// =============================================================
/*
 ------------ Funciones de Callback -----------------------
 Es una función(definida, expresada, arrow, anónima) que se pasa 
 a otra función como argumento.
 Se pasa en el argumento como referencia ( sin parentesis).
 */
 // Hacer con arrow function una función que reciba un texto e imprima en consola
 
 const seVeEnConsola =(texto) => {
    console.log (texto);
 }
seVeEnConsola("Te amo Mamá"); 

const printToConsole = (text) => console.log(text);

 // Hacer con arrow function una función que reciba un texto e imprima en alert

 const printToAlert = (text) => alert(text);
//*ejercicio para html
 // Hacer con arrow function una función que reciba un texto e imprima en H1 "app-title"
 const printToH1 = (text) => document.getElementById("app-title").innerHTML = text;
 const printToLogoTitle = (text) => document.getElementById("logo-title").innerHTML = text;

// Realizar una función(arrow function) que reciba un texto
// y que pueda imprimir en consola, alert y quiza en el futuro
// se agregue otra salida para imprimir.

const printMessageIfElse = (text, optionToPrint ) => {
    if (optionToPrint === "console"){
        printToConsole(text);
    }else if (optionToPrint === "alert" ){
        printToAlert (text);
    }else if (optionToPrint === "h1"){
        printToH1(text);
    }else {
        console.error("que tranasa! te equivocaste de opción");
    }
};

/**Refactorización del código con Switch */
const printMessage = (text, optionToPrint ) =>{
  /*
    switch: Es una alternativa a if-else. Permite ejecutar
    diferentes bloques de código basándose en el valor de una expresión
   */
    switch( optionToPrint ){
        case "console":
         printToConsole(text);
         break;
        case "alert":
         printToAlert( text);
         break;
        case "h1":
        printToH1(text);
        break;
        default:
            console.error("Opción incorrecta");
    }
};

printMessage("Hola, Sampi, tqm ", "console");
printMessage("Hola, familia", "h1");
printMessage("Estoy Cansado Jefe", "console"); //si en lugar de poner console, agrego alert, sale la ventanita emergente
printMessage("Tengo Hambre", "f"); // envía un error 

// =============================================================
/*
 ------------ Funciones de Callback -----------------------
 Es una función(definida, expresada, arrow, anónima) que se pasa 
 a otra función como argumento.
 Se pasa en el argumento como referencia ( sin parentesis).
 */

 const printMessageUsingCallback = (text, functionToPrint ) => functionToPrint( text );
 // printMessageUsingCallback("Cualquiera puede cocinar" , 18 ); 
                 // functionToPrint is not a function
 printMessageUsingCallback("Cualquiera puede cocinar", printToConsole );
 printMessageUsingCallback("Cualquiera puede cocinar", printToH1 );

 
 //Ejercicio
 //Agregar una función que modifique "logo-title" con un nuevo mensaje.
// Usar printMessageUsingCallback para pasarle la nueva función(como referencia), con el mensaje: "Ratatuil".

printMessageUsingCallback ("Ratatuil", printToLogoTitle );

// Cambiar las imágenes de pitufina a Remy
// DONE: cambiar el nombre del archivo
// DONE: usar la propieda src
// DONE: crear la función que cambie la imagen
// DONE: agregar IDs a las imágenes

 const changeImage = ( imageID, imagePath) => 
    document.getElementById( imageID ).src = imagePath ;
changeImage( "img1", "./public/img/remy01.jpg" );
changeImage( "img2", "./public/img/remy02.jpg" );
changeImage( "img3", "./public/img/remy03.jpg" );
changeImage( "img4", "./public/img/remy04.jpg" ); 

