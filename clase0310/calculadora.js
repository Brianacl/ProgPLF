function sumar(a,b){
    return a + b
}

function restar(a,b){
    return a - b
}

function multiplicar(a,b){
    return a*b
}

function dividir(a,b){
    return a/b
}

function calculadora(op, v1, v2){
    return op(v1,v2)
}

console.log(calculadora(sumar,2,3))
console.log(calculadora(restar,2,3))
console.log(calculadora(multiplicar,2,3))
console.log(calculadora(dividir,2,3))
