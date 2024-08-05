.text
.globl main

## Assignment 10 Question 2
## 18ab + 20bc – 9a + 36ac - 7 

main:   li $v0,4
        la $a0,string1  
        syscall              # output string1
        
        li $v0,5
        syscall
        move $t0,$v0         # get a and store into $t0

        li $v0,4
        la $a0,string2
        syscall              # output string2

        li $v0,5
        syscall
        move $t1,$v0         # get b and store into $t1

        li $v0,4
        la $a0,string3       # output string3
        syscall

        li $v0,5
        syscall
        move $t2,$v0         # get c and store into $t2

        li   $a1,18          # load 18 into $a1    
        mul  $a1,$t0,18      # compute 18*a and store into $a1
        mul  $a1,$a1,$t1     # compmute 18*a*b and store into $a1
        subu $sp,$sp,4       # stack push operation (push 18*a*b)
        sw   $a1,($sp)

        li   $a1,20          # load 20 into $a1
        mul  $a1,$a1,$t1     # compute 20*b and store into $a1
        mul  $a1,$a1,$t2     # compute 20*b*c and store into $a1
        subu $sp,$sp,4       # stack push operation (push 20*b*c)
        sw   $a1,($sp)

        li   $a1,-9          # load -9 into $a1       
        mul  $a1,$a1,$t0     # compute -9*a and store into $a1
        subu $sp,$sp,4       # stack push operation (push -9*a)
        sw   $a1,($sp)

        li   $a1,36          # load 36 into $a1
        mul  $a1,$a1,$t0     # compute 36*a and store into $a1
        mul  $a1,$a1,$t2     # compute 36*a*c and store into $a1
        subu $sp,$sp,4       # stack push operation (push 36*a*c)
        sw   $a1,($sp)

        li   $a1,-7          # load -7 into $a1
        
        lw   $a0,($sp)       # stack pop operation (pop 36*a*c)
        addu $sp,$sp,4 
        add  $t1,$a0,$a1     # compute 36ac-7 and store into $t1;
        
        lw   $a0,($sp)       # stack pop operation (pop -9*a)
        addu $sp,$sp,4
        add  $t1,$t1,$a0     # compute -9a+36ac-7 and store into $t1;
        
        lw   $a0,($sp)       # stack pop operation (pop 20*b*c)
        addu $sp,$sp,4
        add  $t1,$t1,$a0     # computer 20bc-9a+36ac-7 and store into $t1;
        
        lw   $a0,($sp)       # stack pop operation (pop 18*a*b)
        addu $sp,$sp,4
        add  $t1,$t1,$a0     # compute 18ab+20bc-9a+26ac-7 and store into $t1;
        
        move $a0,$t1         # move $t1 to $a0
        li $v0,1             # set $vo to print $a0 (integer)
        syscall

          .data
string1: .asciiz "\nPlease input a: "
string2: .asciiz "\nPlease input b: "
string3: .asciiz "\nPlease input c: "
