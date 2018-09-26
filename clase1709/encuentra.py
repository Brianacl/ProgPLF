def encuentra(n,l):
    return False if len(l) == 0 else True if l[0] == n else encuentra(n,l[1:])

print(encuentra(7,[1,2,3,4,5,6,7,8,9]))

'''Forma
lista = [1,2,3,4,5,6,7,8,9]

n = 5
i = 0
encontrado = False
while i < len(lista):
    if lista[i] == n:
        encontrado = True
    i += 1
print(encontrado)
'''
