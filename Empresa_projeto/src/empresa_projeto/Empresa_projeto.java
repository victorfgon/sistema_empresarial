package empresa_projeto;


import java.util.Scanner;
import java.util.ArrayList;

public class Empresa_projeto {

   
    public static void main(String[] args) {
        int codigo=0,opc=0,cod,aux=-1,codigo2=0;
        String auxi=new String();
        
        ArrayList<Gerente>listaG=new ArrayList<Gerente>();//vetor que guarda os dados dos gerentes
        ArrayList<Operário>listaO=new ArrayList<Operário>();//vetor que guarda os dados dos operários
        ArrayList<Dependente>listaD=new ArrayList<Dependente>();//vetor que guarda os dados dos dependentes
        ArrayList<Tipo_de_trabalho>listaT = new ArrayList<Tipo_de_trabalho>();//vetor que guarda os dados dos tipos de trabalho
        Scanner entrada=new Scanner(System.in);
        //menu
        while(opc!=15){
        System.out.printf("\nDigite a opção:\n");
        System.out.printf("1 - Inserir gerente\n");
        System.out.printf("2 - Inserir operário\n");
        System.out.printf("3 - Imprimir funcionários\n");
        System.out.printf("4 - Inserir dependente do funcionário\n");
        System.out.printf("5 - Remover funcionário\n");
        System.out.printf("6 - Imprimir dependente\n");
        System.out.printf("7 - Inserir projeto\n");
        System.out.printf("8 - Imprimir projetos do gerente\n");
        System.out.printf("9 - Imprimir gerente do projeto\n");
        System.out.printf("10 - Criar tipo de trabalho\n");
        System.out.printf("11 - Imprimir tipos de trabalho\n");
        System.out.printf("12 - Inserir habilidades do operário\n");
        System.out.printf("13 - Inserir tipo de trabalho do operário\n");
        System.out.printf("14 - Imprimir tipos de trabalho e habilidades\n");
        System.out.printf("15 - Sair\n");
        
        opc=entrada.nextInt();
        switch(opc){
           
            case 1:
                Gerente func=new Gerente();
                func.inserir_funcionario();
                func.codigo=codigo;
                codigo++;
                listaG.add(func);
                break;
            
            case 2:
                Operário funci=new Operário();
                funci.inserir_funcionario();
                funci.codigo=codigo;
                codigo++;
                listaO.add(funci);
                break;
            
            case 3:
                System.out.printf("Gerentes:\n");
               for(Gerente x : listaG){
                  x.imprimir_funcionario();  
} 
               System.out.printf("\nOperários:\n");
                for(Operário x : listaO){
                  x.imprimir_funcionario();  
} 
                break;
            
            case 4:
                System.out.printf("Digite o código do funcionário\n");
                cod=entrada.nextInt();
                for(Gerente x : listaG){
                    if(x.codigo==cod){
                Dependente dep=new Dependente();
                Funcionário funcio=new Funcionário();
                funcio.inserir_dependente(dep);
                dep.codigo=cod;
                listaD.add(dep);
                }
                }
                
                for(Operário x : listaO){
                    if(x.codigo==cod){
                Dependente dep=new Dependente();
                Funcionário funcio=new Funcionário();
                funcio.inserir_dependente(dep);
                dep.codigo=cod;
                listaD.add(dep);
                }
                }
                break;
            
            case 5:
               System.out.printf("Digite o código do funcionário\n");
               cod=entrada.nextInt();
               
               for(Gerente x : listaG){
                   aux=x.codigo;
                 if(aux==cod){
                     listaG.remove(x);
                 }
               }
               
               for(Operário x : listaO){
                   aux=x.codigo;
                 if(aux==cod){
                     listaO.remove(x);
                 }
               }
               break;
               
            case 6:
                System.out.printf("Digite o código do funcionário\n");
               cod=entrada.nextInt();
               
               for(Gerente x : listaG){
                   aux=x.codigo;
                 if(aux==cod){
                     System.out.printf("Dependentes:\n");
               for(Dependente y : listaD){
                   if(y.codigo==aux){
                  x.imprimir_dependente(y);
                   }
                 }
               }
               }
               
               for(Operário x : listaO){
                   aux=x.codigo;
                 if(aux==cod){
                     System.out.printf("Dependentes:\n");
               for(Dependente y : listaD){
                   if(y.codigo==aux){
                  x.imprimir_dependente(y);
                   }
                 }
               }
               }
               break;
            
            case 7:
                System.out.printf("Digite o código do gerente\n");
               cod=entrada.nextInt();
               
               for(Gerente x : listaG){
                   if(x.codigo==cod){
                  x.inserir_projeto();
                   }
}
               break;
            
            case 8:
                System.out.printf("Digite o código do gerente\n");
                cod=entrada.nextInt();
                
                for(Gerente x : listaG){
                   aux=x.codigo;
                 if(aux==cod){
                     x.imprimir_Projeto();
               }
               }
                break;
            
            case 9:
               System.out.printf("Digite o código do projeto\n");
                cod=entrada.nextInt();
                
                for(Gerente x : listaG){
                   aux=x.codigo;
                 if(aux==cod){
                    x.getProjeto().imprimir_Gerente();
               }
               }
                break;
                
            case 10:
                Tipo_de_trabalho tip=new Tipo_de_trabalho();
                tip.codigo=codigo2;
                codigo2++;
                listaT.add(tip.criar_tipo_de_trabalho(tip));
                break;
            
            case 11:
                for(Tipo_de_trabalho x : listaT){
                    x.imprimir_tipo_de_trabalho();
                }
                break;
                
            case 12:
                System.out.printf("Digite o código do operário\n");
               cod=entrada.nextInt();
               
               for(Operário x : listaO){
                  if(x.codigo==cod){
                      entrada.nextLine();
                      System.out.printf("Digite as habilidades do operário\n");
                      auxi=entrada.nextLine();
                      x.setHabilidades(auxi);
                  }
}
               break;
            
            case 13:
                System.out.printf("Digite o código do operário\n");
               cod=entrada.nextInt();
               
               for(Operário x : listaO){
                  if(x.codigo==cod){
                      System.out.printf("Digite o código do tipo de trabalho a ser inserido\n");
                      aux=entrada.nextInt();
                      for(Tipo_de_trabalho y : listaT){
                          if(y.codigo==aux){
                            y.guardar_operario(x);
                            x.inserir_tipo_de_trabalho(y);
                          }
                      }
                  }
}
               break;
            
            case 14:
                System.out.printf("Digite o código do operário\n");
               cod=entrada.nextInt();
               
                for(Operário x : listaO){
                if(x.codigo==cod){
                    x.imprimir_tipo_de_trabalho();
                }
                    }
            case 15:    
                System.out.printf("Saindo...\n");
                break;
                
            default:
                System.out.printf("Comando inválido\n");
        }
        }
        
    }
    
}
