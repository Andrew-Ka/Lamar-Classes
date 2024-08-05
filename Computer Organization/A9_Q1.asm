## A9_Q1.asm

        .text
        .globl  main

main:
        la      $t0, size      # get the base address of size and store it into $t0
        la      $t1, array1    # get the base address of array1 and store it into $t1
        la      $t2, array2    # get the base address of array2 and store it into $t2
        la      $t3, result    # get the base address of result and store it into $t3
        lw      $t4, 0($t0)    # load size into register $t4
Loop:   beq     $t4, $0, Done  # check whether $t4=0; if yes, all elements used, jump to Done
        lw      $a1, 0($t1)    # load an element from array1 to $a1
        lw      $a2, 0($t2)    # load an element from array2 to $a2
        mul     $a3, $a1, $a2  # calculate the product of $a1 and $a2 and store it in $a3
        sw      $a3, 0($t3)    # write the sum ($a3) to result
        addi    $t1, $t1, 4    # increase array1 address to get the next element in it
        addi    $t2, $t2, 4    # increase array2 address to get the next element in it
        addi    $t3, $t3, 4    # increase result address to save the next sum
        sub     $t4, $t4, 1    # decrease $t4 (size)
        j       Loop          # jump back to start the next iteration
Done:   nop          
        .data
size:   .word 7
array1: .word 69, 2, -2, -3, 10, 8, 17
array2: .word -1, 56, 2, -32, -90, -18, 6
result: .word 0, 0, 0, 0, 0, 0, 0
## End of file
