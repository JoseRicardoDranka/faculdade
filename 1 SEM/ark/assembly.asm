.data
	x:0
	y:0
	maior:0
	menor:0
	resultado:0
	.text
ld $in_port
sto x
ld $in_port
sto y
ld x
sub y
ble senao
ld x
sto maior
ld y
sto menor
jmp fimse
	senao:
ld y
sto menor
	fimse:
ld maior
sub menor
sto resultado
sto $out_port
hlt 0