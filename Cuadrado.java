/**
 * Clase que crea un cuadrado
 */

public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(float unLado)
    {
        lado = unLado;
    }
    
    @Override 
    
    public void calculaArea()
    {
        area = lado * lado;
    }
}