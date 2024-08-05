## A8_Q3.asm
## 
                .text
                .globl main
                
main:
                ori  $6, $0, 1              ## index
                ori  $7, $0, 1              ## flag (1: odd, 0: even)
                ori  $8, $0, 0              ## sum of evens;
                ori  $9, $0, 0              ## sum of odds;
                ori  $10, $0, 0             ## sum of all;
		    ori  $11, $0, 0		  ## scratch 
		    
loop:           sltiu $11, $6, 101
		    beq  $11,$0, end            ## terminate when $6>100
		    sll  $0, $0, 0
                beq  $7, $0, even           ## if flag==0, jump to even
		    sll  $0, $0, 0
                addu  $9, $9, $6             ## update odd sum using index
                ori  $7, $0, 0              ## set flag to 0
                j    all
		    sll  $0, $0, 0                
even:           addu  $8, $8, $6             ## update even sum using index
                ori  $7, $0, 1              ## set flag to 1
all:            addu  $10, $10, $6           ## update all sum using index
                addu  $6, $6, 1              ## increase index
                j loop                      ## next iteration if $6<=100    
end:            sll  $0, $0, 0        

## End of File