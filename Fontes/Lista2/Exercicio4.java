import java.util.Scanner;
class Exercicio4{
	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o dia de hoje:"); 
		dia = leia.nextInt()
		System.out.println("Digite o mês atual:");
		mes = leia.nextInt() 
		System.out.println("Digite o ano atual:");
		ano = leia.nextInt(); 
		if(ano % 4 == 0 || ano % 100 == 0 || ano % 400 == 0) {  
			if(mes == 1 && dia >= 1 && dia <= 31){ 
				System.out.println(dia+"/"+mes+"/"+ano+" Data válida!");
			}else{ 
				if(mes == 2 && dia >= 1 && dia <= 29){ 
					System.out.println(dia+"/"+mes+"/"+ano+" Data válida!"); 
					System.out.println("Este ano é bissexto!");             
				}else{ 
					if(mes == 3 && dia >= 1 && dia <= 31){ 
						System.out.println(dia+"/"+mes+"/"+ano+" Data válida!"); 
						System.out.println("Este ano é bissexto!"); 
					}else{ 
						if(mes == 4 && dia >= 1 && dia <= 30){ 
							System.out.println(dia+"/"+mes+"/"+ano+" Data válida!"); 
							System.out.println("Este ano é bissexto!");
						}else{ 
							if(mes == 5 && dia >= 1 && dia <= 31){ 
								System.out.println(dia+"/"+mes+"/"+ano+" Data válida!"); 
								System.out.println("Este ano é bissexto!");
							}else{ 
								if(mes == 6 && dia >= 1 && dia <= 30){ 
									System.out.println(dia+"/"+mes+"/"+ano+" Data válida!");
									System.out.println("Este ano é bissexto!");
								}else{ 
									if(mes == 7 && dia >= 1 && dia <= 31){ 
										System.out.println(dia+"/"+mes+"/"+ano+" Data válida!") 
										System.out.println("Este ano é bissexto!") 
									}else{ 
										if(mes == 8 && dia >= 1 && dia <= 31){ 
											System.out.println(dia+"/"+mes+"/"+ano+" Data válida!") 
											System.out.println("Este ano é bissexto!") 
											}else{ 
                                                if(mes == 9 && dia >= 1 && dia <= 30){ 
                                                    System.out.println(dia+"/"+mes+"/"+ano+" Data válida!"); 
                                                    System.out.println("Este ano é bissexto!"); 
                                                }else{ 
                                                    if(mes == 9 && dia >= 1 && dia <= 30){ 
                                                        System.out.println(dia+"/"+mes+"/"+ano+" Data                                                                                          válida!"); 
                                                        System.out.println("Este ano é bissexto!"); 
                                                    }else{
                                                        if(mes == 10 && dia >= 1 && dia <= 31){ 
                                                            System.out.println(dia+"/"+mes+"/"+ano+" Data válida!"); 
                                                            System.out.println("Este ano é bissexto!"); 
														}else{
                                                            if(mes == 11 && dia >= 1 && dia <= 30){ 
                                                                System.out.println(dia+"/"+mes+"/"+ano+" Data válida!"); 
                                                                System.out.println("Este ano é bissexto!"); 
                                                            }else{
                                                                if(mes == 12 && dia >= 1 && dia<=31){                                                                                                    <= 31){ 
                                                                                                System.out.println(dia+"/"+mes+"/"+ano+");                                                                                               Data válida!"); 
                                                                                                System.out.println("Este ano é bissexto!"); 
                                                                                           }else{                                                                               
                                                                                                                        System.out.println("Data Inválida!"); 
  
                                                                                             } 
                                                                                       }      
                                                                                 }         
                                                                           }     
                                                                     }      
                                                               }           
                                                         }      
                                                   }                   
                                             }      
                                       }      
                                 }           
                           }      
        }senao{
                 se(mes == 1 e dia >= 1 e dia <= 31){ 
                   Escreva(dia+"/"+mes+"/"+ano+" Data válida!"); 
                   Escreva("Este ano não é bissexto!"); 
              }senao{
                   se(mes == 2 e dia >= 1 e dia <= 28){ 
                        Escreva(dia+"/"+mes+"/"+ano+" Data válida!"); 
                        Escreva("Este ano não é bissexto!"); 
                   }senao{
                          se(mes == 3 e dia >= 1 e dia <= 31){ 
                               Escreva(dia+"/"+mes+"/"+ano+" Data válida!"); 
                               Escreva("Este ano não é bissexto!"); 
                          }senao{
                                 se(mes == 4 e dia >= 1 e dia <= 30){ 
                                      Escreva(dia+"/"+mes+"/"+ano+" Data válida!"); 
                                      Escreva("Este ano não é bissexto!"); 
                                 }senao{ 
                                        se(mes == 5 e dia >= 1 e dia <= 31){ 
                                             Escreva(dia+"/"+mes+"/"+ano+" Data válida!"); 
                                             Escreva("Este ano não é bissexto!"); 
                                        }senao{
                                               se(mes == 6 e dia >= 1 e dia <= 30){ 
                                                    Escreva(dia+"/"+mes+"/"+ano+" Data válida!"); 
                                                    Escreva("Este ano não é bissexto!"); 
                                               }senao{
                                                     se(mes == 7 e dia >= 1 e dia <= 31){ 
                                                          Escreva(+dia+"/"+mes+"/"+ano+" Data válida!"); 
                                                          Escreva("Este ano não é bissexto!"); 
                                                     }senao{ 
                                                            se(mes == 8 e dia >= 1 e dia <= 31){ 
                                                                 Escreva(+dia+"/"+mes+"/"+ano+" Data válida!"); 
                                                                 Escreva("Este ano não é bissexto!"); 
                                                            }senao{ 
                                                                   se(mes == 9 e dia >= 1 e dia <= 30){ 
                                                                        Escreva(dia+"/"+mes+"/"+ano+" Data válida!"); 
                                                                        Escreva("Este ano não é bissexto!"); 
                                                                   }senao{ 
                                                                          se(mes == 10 e dia >= 1 e dia <= 31){ 
                                                                      Escreva(dia+"/"+mes+"/"+ano+"                                                                                         Data válida!"); 
                                                                               Escreva("Este ano não é bissexto!"); 
                                                                          }senao{ 
                                                                                 se(mes == 11 e dia >= 1 e dia <= 30){ 
                                                                                      Escreva(+dia+"/"+mes+"/"+ano+" Data válida!"); 
                                                                                      Escreva("Este ano não é bissexto!"); 
                                                                                 }senao{ 
                                                                                        se(mes == 12 e dia >= 1 e dia <= 31)                                                                                           { 
                                                                                            Escreva(+dia+"/"+mes+"/"+ano+"                                                                                                Data válida!") 
                                                                                             Escreva("Este ano                            não é bissexto!"); 
                                                                                        }senao{ 
                                                                                               Escreva("Data Inválida!"); 
                                                                                          } 
                                                                                  } 
                                                                         } 
                                                                  } 
                                                           } 
                                                   } 
                                           } 
                             }
                              } 
                         }
          } 
            } 
      } 
} 
