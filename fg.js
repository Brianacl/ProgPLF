function fg(a,b,c){
    return [(-b + Math.sqrt(b*b - 4*a*c))/(2*a), (-b - Math.sqrt(b*b - 4*a*c))/(2*a)]
}
console.log(fg(3,1,-5));

