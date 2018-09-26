function suma(l){
    return (l.length == 0) ? 0 : l[0] + suma(l.slice(1))
}

console.log(suma([1,3,-1,7,0]))
