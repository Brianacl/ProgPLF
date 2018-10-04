def sumar(a,b):
    return a + b

def restar(a,b):
    return a - b

def multiplicar(a,b):
    return a*b

def dividir(a,b):
    return a/b

def calculadora(op, v1, v2):
    return op(v1,v2)

print(calculadora(sumar,2,3))
print(calculadora(restar,2,3))
print(calculadora(multiplicar,2,3))
print(calculadora(dividir,2,3))
