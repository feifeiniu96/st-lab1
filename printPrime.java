package printPrime;

public  class printPrime {
	/******************************************************* 
     * Finds and prints n prime integers 
     * Jeff Offutt, Spring 2003 
     ******************************************************/ 
    public String printPrimes (int n) 
    { 
        int curPrime; // Value currently considered for primeness 
        int numPrimes; // Number of primes found so far. 
        boolean isPrime; // Is curPrime prime? 
        int [] primes = new int [3]; // The list of prime numbers. 
        
        // Initialize 2 into the list of primes. 
        primes [0] = 2; 
        numPrimes = 1; 
        curPrime = 2; 
        while (numPrimes < n) 
        { 
            curPrime++; // next number to consider ... 
            isPrime = true; 
            for (int i = 0; i <= numPrimes-1; i++) 
            { // for each previous prime. 
                if (curPrime%primes[i]==0) 
                { // Found a divisor, curPrime is not prime. 
                    isPrime = false; 
                    break; // out of loop through primes. 
                } 
            } 
            if (isPrime) 
            { // save it! 
                primes[numPrimes] = curPrime; 
                numPrimes++; 
            } 
        } // End while 
        
        String result = "";
        // Print all the primes out. 
        for (int i = 0; i <= numPrimes-1; i++) 
        { 
            System.out.println ("Prime: " + primes[i]); 
            result = result + primes[i] + " ";
        } 
        return result;
    } // end printPrimes
}
