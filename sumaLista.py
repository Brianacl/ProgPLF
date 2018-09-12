#def suma(l):
# 1,3,-1,7,0

lista = [1,3,-1,7,0]
lista.pop()
i = 0
s = 0
while i < len(lista):
    s+= lista[i]
    i+=1

print(s)
