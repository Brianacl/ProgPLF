function fg(a,b,c){
	return (b*b>4*a*b) ? [(-b+Math.sqrt(b*b - 4*a*c))/(2*a),(-b-Math.sqrt(b*b - 4*a*c))/(2*a)] : null;
}

console.log(fg(1,3,-5))
