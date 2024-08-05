##Question 1
#
#(1)	Put the bit pattern 0xA5A5 in register $7. 
#(2)	$8 gets the bits in $7 shifted left logical by 2 positions 
#(3)	Reflect each bit of the pattern in $8 and put the result into register $9 
#(4)	Move the bit pattern in register $9 to register $10 

		.text
		.globl  main
main:
	ori   $7, $0, 0xA5A5       #$7  <--- 0xA5A5
	sll	$8, $7, 2		   #$4  <--- 4*$7
	nor	$9, $8, $0		   #$9  <--- reflected $8
	or	$10,$9, $0		   #$10 <--- $9

##end of file