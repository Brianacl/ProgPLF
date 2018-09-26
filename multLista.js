function mult(l){
    return (l.length == 0) ? 1 : l[0] * mult(l.slice(1))
}

console.log(mult([1,3,-1,7]))
