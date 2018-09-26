def f(x):
    return 1/x

def mapear(l):
    return [] if len(l) == 0 else [f(l[0])] + mapear(l[1:])

print(mapear([1,2,3]))
