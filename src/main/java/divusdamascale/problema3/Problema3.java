/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package divusdamascale.problema3;

import javax.swing.*;

public class Problema3 {
    Varf[] varfuri;
    Punct punct;

    Problema3()
    {
        
        varfuri = new Varf[9];
        // varfuri[0]=new Varf(0, 0, "A");
    varfuri[8]=new Varf(0, 0, "A'");
        // varfuri[1]=new Varf(5, 0, "B");
        // varfuri[2]=new Varf(5, 5, "C");
        // varfuri[3]=new Varf(0, 5, "D");
    varfuri[0]=new Varf(0, 0, "A");
    varfuri[1]=new Varf(10, 5, "B");
    varfuri[2]=new Varf(20, 0, "C");
    varfuri[3]=new Varf(25, 10, "D");
    varfuri[4]=new Varf(15, 15, "E");
    varfuri[5]=new Varf(20, 5, "F");
    varfuri[6]=new Varf(0, 20, "G");
    varfuri[7]=new Varf(0, 1, "H");
     punct=new Punct(0, 0, null);

    }
    



//clasa care reprezinta varfurile polignoului
     static class Varf{
        String nume;
        int x;
        int y;

        Varf(int x,int y,String nume){
            this.nume=nume;
            this.x=x;
            this.y=y;
        }
    }
// clasa care reprezinta punctul al carei poztii se determina
    static class Punct{
        public String nume;
        public int x;
        public int y;

        Punct(int x,int y,String nume){
            this.nume=nume;
            this.x=x;
            this.y=y;
        }
    }

    
    

    
//metoda pentru afisat varfurile si punctul
    public void afiseaza(int x,int y,String a)
        {
            System.out.println(a+":"+"("+x+","+y+")");
        }

        public static int determinant(int x1,int y1,int x2,int y2,int x3,int y3)
    {
         return (x1*y2) + (y1*x3) + (x2*y3) - (y2*x3) - (y3*x1) - (x2 * y1);
    }

    public void verificare(Varf[] var,Punct p)
    {
        int c=0;
        JFrame j = new JFrame();
        for (int i = 0; i < var.length-1; i++) {
            // afiseaza(var[i].x, var[i].y, var[i].nume);
            // System.out.println(var[i].y==var[i+1].y && var[i+1].y==p.y);
            if (var[i].y==var[i+1].y && var[i+1].y==p.y) {
                if(((p.x - var[i].x)*(p.x-var[i+1].x))<=0)
                {
                    JOptionPane.showMessageDialog(j,"Punctul M se afla pe frontiera.");
                    return;
                }
            }
                Varf a = new Varf(0, 0,"A");
                Varf b = new Varf(0, 0, "B");

                // afiseaza(var[i].x, var[i].y, var[i].nume);

                if(var[i].y>var[i+1].y)
                {
                    a=var[i];
                    b=var[i+1];

                    // afiseaza(a.x, a.y, a.nume);
                    // afiseaza(b.x, b.y, b.nume);
                }else
                {
                    a=var[i+1];
                    b=var[i];

                    // afiseaza(a.x, a.y, a.nume);
                    // afiseaza(b.x, b.y, b.nume);
                }

                if(var[i].y != var[i+1].y )
                {
                    if(((p.y-b.y)*(p.y-a.y))<=0){
                        if(determinant(a.x, a.y, p.x, p.y, b.x, b.y)>0)
                   {
                    c++;
                   }
                   if(determinant(a.x, a.y, p.x, p.y, b.x, b.y)==0)
                   {
                    JOptionPane.showMessageDialog(j,"M se localizeaza pe frontiera.");
                    return;
                   }

                    }
                   
                   
                }

                if(var[i].y!=var[i+1].y && p.y == a.y  )
                {
                    
                        if(p.x<a.x)
                        {
                            c++;
                        }
                        else if(p.x == a.x)
                        {
                            JOptionPane.showMessageDialog(j,"M se localizeaza pe frontiera.");
                            return;
                        }
                }

                if(var[i].y!=var[i+1].y && p.y == b.y && p.x == b.x)
                    {
                        JOptionPane.showMessageDialog(j,"M se localizeaza pe frontiera.");
                        return;
                    }
              
            
            
        }

        
        if(c%2==0)
        {
            JOptionPane.showMessageDialog(j,"M se afla in Exterior");
        }else
        {
            JOptionPane.showMessageDialog(j,"M se afla in Interior");
        }
    }

    //variabile
    
    
   

        
            

    
}
