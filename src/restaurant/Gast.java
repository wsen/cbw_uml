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
public class Gast {
    public Kellner bedienung;
    public void setBedienung(Kellner k){
        bedienung = k;
        k.kunde = this; 
    } 
}
