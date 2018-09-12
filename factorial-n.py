def factorial(n):
    return 1 if n == 0 else n*factorial(n-1)
    assert type(n) == int and n >= 0

print(factorial(int(input("Calcular factorial de: "))))
