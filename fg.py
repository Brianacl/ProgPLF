import math
def fg(a,b,c):
    return [(-b + math.sqrt(b**2 - 4*a*c))/(2*a), (-b - math.sqrt(b**2 - 4*a*c))/(2*a)]

print(fg(3,1,-5));

