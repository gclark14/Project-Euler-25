/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler25java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Fibonacci {
    
    public BigInteger fib(BigInteger n) throws FileNotFoundException{
        final BigInteger ONE = new BigInteger("1");
        final BigInteger ZERO = new BigInteger("0");
        ArrayList<BigInteger> bigFib = new ArrayList<BigInteger>();

        // 1, 1, 2
        bigFib.add(ONE);
        bigFib.add(ONE);
        bigFib.add(ONE.add(ONE));
        BigInteger temp = new BigInteger("0");
        
        int i = 3;
        while(bigFib.get(i-1).toString().length() < 1000){
            temp = ((BigInteger)bigFib.get(i-1)).add((BigInteger)bigFib.get(i-2));
            bigFib.add(temp);
            ++i;

        } 
        System.out.println("desired length: " + (bigFib.size()-1));
        return ZERO;
    }
}
