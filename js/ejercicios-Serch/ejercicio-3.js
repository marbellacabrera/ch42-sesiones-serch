console.log("Ejercicio 3, ¡Diosito, Esto esta subiendo de nivel!"); 


const arr=[1, 2, 3, 4,]
//opción 1
const sumArray = (array) =>{
  let sum = 0;
  let product =1;
  for ( let i = 0; i < array.length; i++){
    sum = sum + array[i];
    product = product * array[i];
  }
  return {sum, product}
}
console.log( sumArray(arr));

//opción reduce

const sumReduce= (array) =>
   array.reduce ((sumatoria, currentValue) => sumatoria + currentValue, 0 );
console.log(`La suma es: ${sumReduce(arr) }`)

const productReduce = (array) =>
  array.reduce((producto, currentValue) => producto * currentValue, 1);
console.log( `El producto es: ${productReduce(arr)}`);
