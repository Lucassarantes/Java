class Primo{
  boolean testaNumeroPrimo(int numero){
	if (numero <=0) {
        return false;
	} else{
        int acumulaLooping = 0;
		for (int i = 1; i <= numero ; i++) {
		 	if (numero%i == 0) {
		    	acumulaLooping +=1;
		    }
	   	}
	    if (acumulaLooping == 2) {
	    	return true;
	    }
   	}
  return false;
  }
}
