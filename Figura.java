/**
 * Superclase 
 * @author Israel Vergara
 * @version 8 Sep 2017
 */

public class Figura
{
    protected float area;
    protected float perimetro;
    
    public Figura()
    {
        area = 0;
        perimetro = 0;
    }
    
    public void calculaArea()
    {
        System.out.println("No se como cacular el area");
    }
    
    public void calculaPerimetro()
    {
        System.out.println("No se como cacular el perimetro");
    }
    
    public void imprimeArea()
    {
        System.out.println("El area de la figura es: "+ area);
    }
}