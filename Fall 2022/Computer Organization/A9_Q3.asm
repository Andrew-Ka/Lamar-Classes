# ## A9_Q3.asm
        .text
        .globl  main
main:
Start:  li      $v0, 4       # set $v0 to print string
        la      $a0,str1     # print str1
        syscall              # Invoke the exception handler.
        li      $v0, 5       # get height
        syscall
        move    $t1, $v0     # move height to $t1    
        bnez    $t1, Next    # If $t1 is not zero, go to Next
        li      $v0, 10      # otherwise ($t1=0 means user wants to stop), set $v0 to exit
        syscall              # Halt the program.
 Next:  li      $v0, 4       # set $v0 to print string
        la      $a0, str2    # print str2
        syscall    
        li      $v0, 5       # get base
        syscall
        move    $t2, $v0     # move base to $t2
       
        li      $v0, 4       # set $v0 to print string
        la      $a0, output  # print string: Output
        syscall
        mul     $a0, $t1, $t2 # use pseudoinstruction multiplication to
                             # compute base*height and save it into $a0
        div     $a0, $a0, 2  # compute base*height/2 and save it into $a0                    
        li      $v0, 1       # print computed area (integer)
        syscall
        j       Start        # jump to start to let user input again
       

        .data
str1: .asciiz      "\nPlease input the height (integer):"
str2: .asciiz      "\nPlease input the base (integer):"
output: .asciiz      "\nThe triangle area is:"
