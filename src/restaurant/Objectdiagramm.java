/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author 1767801
 */
public class Objectdiagramm {
    public static void main(String[] args)
    {
        Gast maren = new Gast();
        Kellner mathias = new Kellner();
        maren.setBedienung(mathias);
        
        System.out.println("*****");
    }
}
