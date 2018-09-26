def mult(l):
    return 1 if len(l) == 0 else l[0] * mult(l[1:])

print(mult([1,2,3]))
