function todos(l){
    return (l.length == 0) ? true : l[0] && todos(l.slice(1))
}

console.log(todos([true,true,true]))
