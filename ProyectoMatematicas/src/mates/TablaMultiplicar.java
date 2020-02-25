package mates;

public class TablaMultiplicar {
private int numero;
public TablaMultiplicar(int numero) {
this.numero = numero;
}
public String generarTabla() {
String tabla="";
for (int i=1; i<=10; i++) {
int result = this.numero*i;
tabla = tabla.concat(this.numero + " x " + i + " = " + result + "\n");
}
return tabla;
}
}
