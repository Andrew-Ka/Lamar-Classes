## Question 2
##
## Program to calculate (y-10)*3/(x+20)
##
## Register use:
##  $8    x
##  $9    y
##  $11   quotient
##  $12   remainder

        .text
        .globl  main

main:   
	ori   $8,  $0, 10        # put x into $8  (x=10)
	ori   $9,  $0, 40        # put y into $9  (y=40)
	ori   $10, $0, 3         # put 3 into $10
	addiu $11, $9, -10       # compute (y-10) and put the result into $11 
	multu $11, $10           # compute (y-10)*3
	mflo  $11                # put the product into $11
	addiu $12, $8, 20        # compute (x+20) and put the result into $12
	div   $11, $12           # compute (y-10)*3/(x+20)
	mflo  $11                # put the quotient into $11 
	mfhi  $12                # put the remainder into $12
	
## end of file