
        .text
        .globl  main

main:   
	lui   $8, 0x1000    # the address of pairs (SPIM:0x1000; Mars:0x1001)
	lw    $9, 0($8)     # get the number of pairs (5) and store in $9
	ori   $10, $0, 0    # use $10 to store the age sum
	ori   $11, $0, 0    # use $11 to store the weight sum
	ori   $12, $0, 0    # use $12 to count
	ori   $13, $0, 0    # use $13 to store temp values;
      addiu $8, $8, 4     # increase the address to get the first pair;
loop: beq   $12, $9, ave  # jump to compute the average if count==number of pairs
	lw    $13, 0($8)    # get age and store in $13
	sll   $0, $0, 0
	addu  $10, $10, $13 # update the age sum using $10
	addi  $8, $8, 4     # increase the address
	lw    $13, 0($8)    # get weight and store in $13
	sll   $0, $0, 0
	add   $11, $11, $13 # update the weight sum using $11
	addi  $8, $8, 4     # increase the address
	addi  $12, $12, 1   # increase count
	j loop
      sll   $0, $0, 0
ave:  div   $10, $9      # compute the average of age
	mflo  $10           # store the age average in $10
	div   $11, $9      # compute the average of weight
	mflo  $11           # store the weight average in $11
		
            .data
pairs:      .word 5       # number of pairs
	.word 12, 90        # first pair: age, weight
	.word 15, 105
	.word 32, 256
	.word 43, 270
	.word 25, 155

## End of file