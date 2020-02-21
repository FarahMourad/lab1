/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farah
 */
public class CALC implements ICalculator{

    /**
     *
     * @param x
     * @param y
     * @return
     */
    @Override
public int add(int x,int y){
    return x+y;
}

    /**
     *
     * @param x
     * @param y
     * @return
     */
    @Override
    public float devide(int x,int y){
    if(y==0){
        throw new RuntimeException("ERROR!!!");}
    else if(x==0){
        return 0;
    }
    
        return (float)x/(float)y;
}
}
