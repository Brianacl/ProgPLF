def sumatoria(n):
	return 0 if n == 0 else n + sumatoria(n-1)

print(sumatoria(4))
