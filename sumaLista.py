def suma(l):
    return 0 if len(l) == 0 else l[0] + suma(l[1:])

print(suma([1,3,-1,7,0]))
