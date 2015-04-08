for i  in range (0,5):
	j=0
	while(j<5):
		print("\t"+str(i)+str(j),end="")
		j+=1
	else:	#when while loop condition is false
		print(".")
else:		#when for loop condition is false
	print("for loop ended")
	
array = ["hello","world"]	
for i in array:
	print(" "+i,end="")
