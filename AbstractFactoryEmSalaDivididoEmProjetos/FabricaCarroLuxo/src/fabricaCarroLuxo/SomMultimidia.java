/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaCarroLuxo;

import interfaces.ISom;

/**
 *
 * @author aluno
 */
public class SomMultimidia implements ISom{

    @Override
    public void tocar() {
        System.out.println("Tocando som de carro de luxo");
    }
    
}