function f(x){
	return x + 1;
}

function g(x,fun){
	return fun(x);
}

funcion = f;

console.log(g(3,funcion));
