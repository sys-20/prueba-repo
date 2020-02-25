import mates.*;
public class Principal {
public static void main(String[] args) {
TablaMultiplicar tabla = new TablaMultiplicar(5);
System.out.println(tabla.generarTabla());
Triangulo trian = new Triangulo(3,3,5);
System.out.println(trian.comprobarTipo());
}
}
