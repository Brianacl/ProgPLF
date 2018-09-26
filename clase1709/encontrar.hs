encontrar n l
	| n `elem` l = True
	| otherwise = False

main = print $ encontrar 5 [1,2,3,4,5,6,7,8,9]
