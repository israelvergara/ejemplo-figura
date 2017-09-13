/**
 * Clase circulo calcula el area del mismo
 * hereda de Figura
 * @version 8 sep 2017
 */

public class Circulo extends Figura
{
    protected float radio;
    
    public Circulo (float unRadio)
    {
        radio = unRadio;
    }
    
    @Override 
    
    public void calculaArea()
    {
        area = 3.1416f * radio * radio;
    }
    
    @Override
    
    public void calculaPerimetro()
    {
        perimetro = 2 * 3.1416f * radio;
    }
}