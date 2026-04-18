
start:
    MOV R0, #5
    MOV R1, #10
    ADD R2, R0, R1
loop:
    SUB R2, R2, #1
    CMP R2, #0
    B loop