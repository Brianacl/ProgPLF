def filtro(l):
    return [] if len(l) == 0 else [l[0]] + filtro(l[1:]) if l[0] % 4 == 0 else filtro(l[1:])

print(filtro([1,2,3,4,5,6,7,8,9]))
'''
lista = [1,2,3,4,5,6,7,8,9]

filtrada = []
i = 0
while i < len(lista):
    if lista[i] % 4 == 0:
        filtrada.append(lista[i])
    i+= 1
print(filtrada)
'''
