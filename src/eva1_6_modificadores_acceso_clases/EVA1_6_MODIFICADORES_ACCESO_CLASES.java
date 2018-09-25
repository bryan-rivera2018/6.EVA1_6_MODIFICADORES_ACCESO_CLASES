/*
 * DEMOSTRACION DE NIVELES DE ACCESO 
   PUBLIC || PRIVATE || PROTECTED || DEFAULT
 */
package eva1_6_modificadores_acceso_clases;

import MAIN.MAIN;//importa la clase de MAIN
import Secundaria.DefaultMain;

/**
 *
 * @author Bryan Rivera Villaseñor
 */
public class EVA1_6_MODIFICADORES_ACCESO_CLASES {
public int iPublico = 10;
    private int bPrivado = 20;
    protected int sProtegido = 30;
    int iDefault = 40;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 EVA1_6_MODIFICADORES_ACCESO_CLASES bPrincipal = new EVA1_6_MODIFICADORES_ACCESO_CLASES ();
        System.out.println(bPrincipal.bPrivado);//no se puede modificar ya que es privado
        System.out.println(bPrincipal.iDefault);
        System.out.println(bPrincipal.iPublico);//se puede modificar ya que es publico
        System.out.println(bPrincipal.sProtegido);//esta protegido por la clase
        
        Default fDefault = new Default();
        System.out.println(fDefault.iDefault);
        System.out.println(fDefault.iPublico);
        System.out.println(fDefault.sProtegido);
        
        MAIN mMain = new MAIN();//IMPRIME LOS DATOS ALOJADOS EN LA CLASE MAIN
        DefaultMain dDefaultMain = new DefaultMain();
    }
    
}
class Default{
    public int iPublico = 10;
    private int bPrivado = 20;
    protected int sProtegido = 30;
    int iDefault = 40;
}