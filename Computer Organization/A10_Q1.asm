## Assignment10_Q1.asm

.text
.globl main

main:
	li      $v0, 4       # set $v0 to print string
	la      $a0, str1    # print str1
	syscall

	li      $v0, 8       # set $v0 to read string
	la      $a0, buffer  # $a0 get the address of buffer
	li      $a1,400      # $a1 == buffer length
	syscall 
    
	li      $t1,0        # initialize $t1 to 0
loop: 
	lb      $v0,buffer($t1)  # use indexed addressing to get the 1st character
	                     # in the input string and save it into $v0
	                     # Note: use lb to load a character
	                     # because a character is 8 bits (ASCII)
	beq     $v0, 10, done  # if $v0 is 10 (the ASCII of '\n'), reach the end of the string
	                     # branch to done
	addiu   $t1,$t1,1    # otherwise ($v0 is not 10), increase $t1 to count # of characters
	j loop               # jump to the next iteration
done:
	li      $v0, 4       # set $v0 to print string
	la      $a0, str2    # print str1
	syscall
	move    $a0, $t1     # move $t1 to $a0 in order to print the length saved in $t1
	li      $v0, 1       # set $v0 to print the length (integer)  
	syscall
	li      $v0, 10      # set $v0 to exit
	syscall
	.data
str1: .asciiz "\n Please input a string: "
str2: .asciiz "\n The length of the string: "
buffer:  .space 400 #reserve 50 bytes (max 50 characters in the string
