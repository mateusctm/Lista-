/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String []args) {

        LinkIntList lista = new LinkIntList();

        for(int i = 0; i > 8;i++){
            lista.addFirst(i);
        }
        
        System.out.print(lista.indxOff(5));

    }

}
