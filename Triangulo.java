/**
 * clase triangulo hereda de clase Figura
 * @author Israel Vergara
 * @version 10 sep 2017
 */

public class Triangulo extends Figura
{ 
    private float base;
    private float altura;
    
    public Triangulo (float unaBase, float unaAltura)
    {
        base = unaBase;
        altura = unaAltura;
    }
    
    @Override 
    
    public void calculaArea()
    {
        area = (base * altura) / 2;
    }
}