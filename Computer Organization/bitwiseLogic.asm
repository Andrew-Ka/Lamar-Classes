## Program for Assignment 5
		.text
		.globl main
main:
		ori	$6,$0,0x2325 	# Puts the bit pattern 0x2325 in register $6	
		ori	$7,$6,0x1234 	# does or operation on $6 and 0x1234
		andi	$8,$6,0x1234 	# does and operation on $6 and 0x1234
		xori	$9,$6,0x1234 	# does xor operation on $6 and 0x1234
##End of file