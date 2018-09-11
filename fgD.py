import cmath
def fg(a,b,c):
    return [(-b + cmath.sqrt(b**2 - 4*a*c))/(2*a), (-b - cmath.sqrt(b**2 - 4*a*c))/(2*a)] if (b**2>4*a*c) else None

print(fg(3,1,-5));

