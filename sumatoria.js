function sumatoria{
	return (n == 0) ? 0 : n + sumatoria(n-1);
}
console.log(sumatoria(4));
