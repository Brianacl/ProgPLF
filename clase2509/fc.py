def f(x):
    return x + 1

def g(x,fun):
    return fun(x)

funcion = f
#print(g(3, lambda x: x + 1)) #Funciones lambda en python 
print(g(3,funcion))
