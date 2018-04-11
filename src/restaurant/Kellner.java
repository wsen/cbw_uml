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
public class Kellner {
    public Gast kunde;
    
    public void setKunde(Gast g) {
        kunde = g;
        kunde.bedienung = this; //this Kellner (ein Obj der Klasse Kellner)
    }

}
