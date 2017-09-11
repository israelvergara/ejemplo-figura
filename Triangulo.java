/**
 * 
 * 
 * clase triangulo herada de clase Figura
 */

public class Triangulo extends Figura
{ 
    private float base, altura;
    
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