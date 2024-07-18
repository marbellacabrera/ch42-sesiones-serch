console.log("Necesito Dormir más... y un café 😁😜")
/*
Write a function that performs the bubble algorithm.
*/
Input [3, 6, 12, 5, 100, 1]
Output [1, 3, 5, 6, 12, 100]


function burbuja(arr) {
    // Clonamos el array para no modificar el original
    const array = arr.slice();

    // Longitud del array
    const n = array.length;

    // Iteramos sobre el array
    for (let i = 0; i < n - 1; i++) {
        // Bucle interno para comparar y hacer swap
        for (let j = 0; j < n - i - 1; j++) {
            // Si el elemento actual es mayor que el siguiente
            if (array[j] > array[j + 1]) {
                // Intercambiamos los elementos usando destructuring
                [array[j], array[j + 1]] = [array[j + 1], array[j]];
            }
        }
    }

    // Devolvemos el array ordenado
    return array;
}

// Ejemplo de uso:
const entrada = [3, 6, 12, 5, 100, 1];
const salida = burbuja(entrada);

console.log('Entrada:', entrada);
console.log('Salida:', salida);


