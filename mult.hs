mult [] = 1
mult (x:xs) = x * suma xs

main = print $ mult [1,3,-1,7]
