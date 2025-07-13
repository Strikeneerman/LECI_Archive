package Aula7.Ex73;
import java.util.Scanner;

public class testTravelAgency {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      
      TravelAgency agencia[] = new TravelAgency[100];
      int op, index = 0;
      do {
        System.out.println("Menu!");
        System.out.print("Agency operations:\n1 -Create new Agency \n2 -Add Entities\n3 -Car Department\n4 -Housing Department\n5 -Show all Agency\n0 -exit\n");
        System.out.print("-->");
          op = sc.nextInt();
        switch (op) {
            case 1:
                   int opr = 1, n; // agencias a serem criadas, sendo n o numero fixo;
                    System.out.println("Create new Agency!");
                    System.out.print("How many Agencies do you want to create?--> ");
                     n = sc.nextInt();
                    while (opr <= n){
                        sc.nextLine();
                        System.out.printf("%2dº - Agency\n", opr);
                        System.out.print("Agency Name -->: ");
                        String name = sc.nextLine();
                        System.out.print("Agency Address -->: ");
                        String address = sc.nextLine();

                        if(index < agencia.length){
                            agencia[index] = new TravelAgency(name, address);
                            index++;//indice do array de agencias;
                            opr++; // numero de agencias a ser criadas;
                        }
                        else{
                            System.out.println("You cannot create more Agency, there is no more space! I'm sorry");
                            opr = n;
                        } 
                    }  
                break;
            case 2:
                  int ope;
                  do {
                    System.out.println("Add Entities!: ");
                    System.out.println("which entity do you want to create: ");
                    System.out.print("1 - Accommodation\n2 - Car\n0 -Go to main menu!\n");
                    ope = sc.nextInt();
                    switch (ope) {
                        case 1:
                               int opa = 1, N;
                               System.out.println("Accommodation!");
                               System.out.print("How many Accommodation do you want to create?--> ");
                                 N = sc.nextInt();

                               int opt = 0, k = -1, cnt = 0; // opt- operação para escolher tipo de accom.., k-> indice da agencia com o nome pesquisado, 
                                   // ou  indice da agencia com o nome e endereço pesquisado, cnt- contador de numero de agencias com o mesmo nome;
                               while (opa <= N){
                                   sc.nextLine();
                                   System.out.print("Accommodation Name: ");
                                   String name = sc.nextLine();
                                   System.out.print("Accommodation Code: ");
                                   String code = sc.nextLine();
                                   System.out.print("Accommodation Location: ");
                                   String local = sc.nextLine();
                                   System.out.print("Price per Nigth: ");
                                   double priceNigth = sc.nextDouble();
                                   System.out.print("Evaluation: ");
                                   double evaluation = sc.nextDouble();

                                   sc.nextLine();
                                   System.out.print("What is the name of the agency-->: ");
                                   String Name = sc.nextLine();
                                   //System.out.println(Name);
                                   for(int i = 0; i < agencia.length; i++){
                                       if(agencia[i] != null){
                                            if(agencia[i].getName().equals(Name)){
                                                k = i;
                                                cnt++;
                                            }
                                       }
                                   }

                                   if(cnt > 1){
                                        System.out.println("Ops! there is more than one agency with the same name");
                                        System.out.print("Please tell the agency address!");
                                        String Address = sc.nextLine();
                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                if(agencia[i].getName().equals(Name) && agencia[i].getAddress().equals(Address))
                                                    k = i;
                                                    
                                            }  
                                        }
                                   }

                                   do {
                                        System.out.println("Which Accommodation do you want to create?: ");
                                        System.out.print("1 - Accommodation\n2 - Apartament\n3 - Hotel Room\n");
                                          opt = sc.nextInt();
                                          //sc.nextLine();
                                          /*Os promotores para o nosso projeto é uma parceria entre duas associações ligadas ao desporto, mais concretamente à comunidade de Personal Trainers.  A APTEF (Associação Portuguesa de Técnicos de Exercício Físico) em conjunto com a UPDTEF (União Portuguesa de Diretores Técnicos de Exercício Físico), estão envolvidas no projeto, financiando o mesmo, dando uma nova oportunidade à sua comunidade e a quem representam.*/ 

                                            switch (opt) {
                                                case 1:
                                                        Accommodation a = new Accommodation(name, code, local, priceNigth, evaluation);
                                                        if(k != -1){
                                                           agencia[k].setHouse(a);
                                                           opa++;
                                                        }
                                                        System.out.println(k);
                                                    break;
                                                case 2: 
                                                        System.out.print("Number of rooms in the apartment?-->: ");
                                                        int nRoom = sc.nextInt();
                                                        Accommodation p = new Apartament(name, code, local, priceNigth, evaluation, nRoom);
                                                        if(k != -1){
                                                            agencia[k].setHouse(p);
                                                            opa++;
                                                        }                                            
                                                    break;
                                                case 3:
                                                        System.out.print("Hotel Room Type?-->: ");
                                                        String typeOfRoom = sc.next();
                                                        Accommodation h = new HotelRoom(name, code, local, priceNigth, evaluation, typeOfRoom);
                                                        if(k != -1){
                                                            agencia[k].setHouse(h);
                                                            opa++;
                                                        }
                                                    break;                                           
                                                default:
                                                        System.out.println("Ops! : Não é isso!, Diz o número certo: [1, 3]");
                                                    break;
                                            }
                                   } while (opt < 1 && opt > 3);
                                   cnt = 0;
                               }
                            break;
                        case 2:                            
                                int opc = 1, nC;
                                System.out.println("CAR!");
                                System.out.print("How many Car do you want to create?--> ");
                                nC = sc.nextInt();

                                int x = -1, cntr = 0; //x-> indice da agencia com o nome pesquisado ou  indice da agencia com o nome e endereço pesquisado,
                                    // cntr- contador de numero de agencias com o mesmo nome;
                                while (opc <= nC){
                                    sc.nextLine();
                                    System.out.print("Car Class[A, F]:  ");
                                    String clas = sc.next();
                                    char classe;
                                    if(clas.length() != 0){
                                        clas = clas.toUpperCase();
                                        classe = clas.charAt(0);
                                    }else{
                                        classe = 'D';
                                    }
                                   
                                    System.out.print("Car Engine Type: ");
                                    String engineType = sc.next();
                                    sc.nextLine();
                                    System.out.print("What is the name of the agency-->: ");
                                    String Name = sc.nextLine();

                                    for(int i = 0; i < agencia.length; i++){
                                        if(agencia[i] != null){
                                            if(agencia[i].getName().equals(Name)){
                                                x = i;
                                                cntr++;
                                            }
                                       }
                                    }
                                    System.out.println(x);
                                    if(cntr > 1){
                                        System.out.println("Ops! there is more than one agency with the same name");
                                        System.out.print("Please tell the agency address!");
                                        String Address = sc.nextLine();

                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                if(agencia[i].getName().equals(Name) && agencia[i].getAddress().equals(Address))
                                                   x= i;
                                                   
                                            }  
                                        }
                                    }
                                    //Car c = new Car(classe, engineType);
                                    cntr = 0;
                                    System.out.println(x);
                                    if(x != -1){
                                        agencia[x].setRent(new Car(classe, engineType));
                                        opc++;
                                   }
                                   //System.out.println(opc);
                                }
                            break;
                        case 0:
                               System.out.println("Bye!");    
                            break;
                        default:
                               System.out.println("Ops! : Não é isso!");
                            break;
                    }
                  } while (ope != 0);
                break;
            case 3:
                   sc.nextLine();
                   int opcd;
                   do {
                        System.out.println("Car departament!");
                        System.out.print("Menu!\n1 - See the Agency Cars\n2 - Rent a Car\n3 - Deliver the Car\n0 - go to main menu!\n");
                        opcd = sc.nextInt();

                        switch (opcd) {
                            case 1:
                                    System.out.println("In which agency do you want to see the stock of cars?");
                                    System.out.print("1 - I have an Agency Name\n2 - I have an Agency Address\n3 - I don't know, please show me all the agencies\n ");
                                    int m = sc.nextInt(); // operação do menu;

                                    if(m == 1){
                                        sc.nextLine();
                                        System.out.print("Agency Name: ");
                                        String nam = sc.nextLine();
                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                if(agencia[i].getName().equals(nam)){
                                                    for(int j = 0; j < agencia[i].getIndexCar(); j++)
                                                        System.out.println(agencia[i].getRent(j));
                                                }
                                                  
                                            }
                                        }
                                    }
                                    else if(m == 2){
                                            sc.nextLine();
                                            System.out.print("Agency address: ");
                                            String adds = sc.nextLine();
                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getAddress().equals(adds)){
                                                        for(int j = 0; j < agencia[i].getIndexCar(); j++)
                                                           System.out.println(agencia[i].getRent(j));
                                                    }
                                                }
                                            }
                                    }
                                    else if(m == 3){
                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                for(int j = 0; j < agencia[i].getIndexCar(); j++)
                                                    System.out.println(agencia[i].getRent(j));
                                            }
                                        }
                                }
                                else {
                                    System.out.printf("Ops! There is %2d option", m);
                                 }
                                break;
                            case 2:
                                   System.out.println("In which agency do you want to Rent a Car?");
                                    System.out.print("1 - I have an Agency Name\n2 - I have an Agency Address\n");
                                    int r = sc.nextInt(); // operação do menu;

                                    sc.nextLine();
                                    int k = -1, cnt = 0;
                                    if(r == 1){ 
                                        System.out.print("Agency Name: ");
                                        String nam = sc.nextLine();

                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                if(agencia[i].getName().equals(nam)){
                                                    k = i;
                                                    cnt++;
                                                }
                                            }
                                        }
                                        if(cnt > 1){
                                            System.out.println("ops! There is more than one agency with this name, please state the address ");
                                            String adrs = sc.nextLine();
                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getName().equals(nam) && agencia[i].getAddress().equals(adrs) ){
                                                        k = i;
                                                    }
                                                }
                                            }
                                        }
                                        if(k != -1){

                                            System.out.println("What car do you want to rent?");

                                            System.out.print("Class-->: ");
                                            String cl = sc.next();
                                            System.out.print("Engine Type-->: ");
                                            String et = sc.next();

                                            char c = (cl.toUpperCase()).charAt(0);
                                            int j = agencia[k].getACar(c, et);

                                            if(j > -1){
                                                System.out.print("OK! What is your citizen number?-->: ");
                                                int cc = sc.nextInt();
                                                agencia[k].rent(cc, j);
                                            }
                                            else{
                                                System.out.println("This agency does not have a car with this data");
                                            }   
                                        }
                                        
                                    }                                   
                                    else if(r == 2){
                                        sc.nextLine();
                                            //int k = -1, cnt= 0;
                                            System.out.print("Agency address: ");
                                            String adds = sc.nextLine();
                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getAddress().equals(adds)){
                                                        k = i;
                                                        cnt++;
                                                    }
                                                }
                                            }
                                            if(cnt > 1){
                                                System.out.println("ops! There is more than one agency with this address, please state the Name ");
                                                String nam = sc.nextLine();
                                                for(int i = 0; i < agencia.length; i++){
                                                    if(agencia[i] != null){
                                                        if(agencia[i].getName().equals(nam) && agencia[i].getAddress().equals(adds) ){
                                                            k = i;
                                                        }
                                                    }
                                                }
                                            }
                                            if(k != -1){
                                                sc.nextLine();

                                                System.out.println("What car do you want to rent?");

                                                System.out.print("Class-->: ");
                                                String cl = sc.next();
                                                System.out.print("Engine Type-->: ");
                                                String et = sc.next();

                                                char c = (cl.toUpperCase()).charAt(0);
                                                int j = agencia[k].getACar(c, et);

                                                if(j > -1){
                                                    System.out.print("OK! What is your citizen number?-->: ");
                                                    int cc = sc.nextInt();
                                                    agencia[k].rent(cc, j);
                                                }
                                            }
                                            else{
                                                System.out.println("This agency does not have a car with this data");
                                            }  
                                    }
                                    else{
                                        System.out.println("Please go to See the Agency Cars");
                                    }
                                    cnt = 0;
                                break;
                            case 3:
                                    System.out.println("In which agency do you want to Deliver the Car?");
                                    System.out.print("1 - I have an Agency Name\n2 - I have an Agency Address\n");
                                    int t = sc.nextInt(); // operação do menu;
                                    sc.nextLine();
                                    int x = -1, cntr = 0;
                                    if(t == 1){
                                       
                                        System.out.print("Agency Name: ");
                                        String nam = sc.nextLine();
                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                if(agencia[i].getName().equals(nam)){
                                                    x = i;
                                                    cntr++;
                                                }
                                            }
                                        }
                                        if(cntr > 1){
                                            System.out.println("ops! There is more than one agency with this name, please state the address ");
                                            String adrs = sc.nextLine();
                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getName().equals(nam) && agencia[i].getAddress().equals(adrs) ){
                                                        x = i;
                                                    }
                                                }
                                            }
                                        }
                                        if(x != -1){
                                            sc.nextLine();

                                            System.out.println("What car do you want to Diliver?");

                                            System.out.print("Class-->: ");
                                            String cl = sc.next();
                                            System.out.print("Engine Type-->: ");
                                            String et = sc.next();

                                            char c = (cl.toUpperCase()).charAt(0);
                                            int j = agencia[x].getACar(c, et);

                                            if(j > -1){
                                                System.out.print("OK! What is your citizen number?-->: ");
                                                int cc = sc.nextInt();
                                                agencia[x].deliver(j); 
                                                cc = cc + cc; // não faz nada,  só fiz isso para ter simbologia real;
                                            }
                                            else{
                                                System.out.println("This agency does not have a car with this data");
                                            }   
                                        }
                                        
                                    }
                                    else if(t == 2){
                                        sc.nextLine();
                                            //int k = -1, cnt= 0;
                                            System.out.print("Agency address: ");
                                            String adds = sc.nextLine();
                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getAddress().equals(adds)){
                                                        x = i;
                                                        cntr++;
                                                    }
                                                }
                                            }
                                            if(cntr > 1){
                                                System.out.println("ops! There is more than one agency with this address, please state the Name ");
                                                String nam = sc.nextLine();
                                                for(int i = 0; i < agencia.length; i++){
                                                    if(agencia[i] != null){
                                                        if(agencia[i].getName().equals(nam) && agencia[i].getAddress().equals(adds)){
                                                            x = i;
                                                        }
                                                    }
                                                }
                                            }
                                            if(x != -1){

                                                System.out.println("What car do you want to Deliver?");

                                                System.out.print("Class-->: ");
                                                String cl = sc.next();
                                                System.out.print("Engine Type-->: ");
                                                String et = sc.next();

                                                char c = (cl.toUpperCase()).charAt(0);
                                                int j = agencia[x].getACar(c, et);

                                                if(j > -1){
                                                    System.out.print("OK! What is your citizen number?-->: ");
                                                    int cc = sc.nextInt();
                                                    agencia[x].deliver(j);
                                                    cc = cc + cc;  // faz nada só em caso simbolico
                                                    sc.nextLine();
                                                }
                                            }
                                            else{
                                                System.out.println("This agency does not have a car with this data");
                                            }  
                                    }
                                    else{
                                        System.out.println("Please go to See the Agency Cars");
                                    }
                                
                                break;
                            case 0:
                                   System.out.println("Bye!");    
                                break;
                            default:
                                    System.out.println("Ops! : Não é isso!");
                                break;
                        }
                   } while (opcd != 0);
                break;
            case 4:
                   sc.nextLine();
                   int opca;
                   do {
                        System.out.println("Accommodation departament!");
                        System.out.print("Menu!\n1 - See the Agency Accommodation\n2 - Reserve a Accommodation\n3 - Check-Out\n0 - go to main menu!\n");
                        opca = sc.nextInt();

                        sc.nextLine();
                        switch (opca) {
                            case 1:
                                    System.out.println("In which agency do you want to see the stock of Accomodation?");
                                    System.out.print("1 - I have an Agency Name\n2 - I have an Agency Address\n3 - I don't know, please show me all the agencies\n");
                                    int m = sc.nextInt(); // operação do menu;

                                    sc.nextLine();
                                    if(m == 1){
                                        System.out.print("Agency Name: ");
                                        String nam = sc.nextLine();
                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                if(agencia[i].getName().equals(nam)){
                                                    for(int j = 0; j < agencia[i].getIndexHouse(); j++)
                                                       System.out.println(agencia[i].getHouse(j));
                                                }
                                               
                                            }
                                        }
                                    }
                                    else if(m == 2){
                                            System.out.print("Agency address: ");
                                            String adds = sc.nextLine();
                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getAddress().equals( adds)){
                                                        for(int j = 0; j < agencia[i].getIndexHouse(); j++)
                                                            System.out.println(agencia[i].getHouse(j));
                                                    }
                                                }
                                            }
                                    }
                                    else if(m == 3){
                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                for(int j = 0; j < agencia[i].getIndexHouse(); j++)
                                                    System.out.println(agencia[i].getHouse(j));
                                            }
                                        }
                                }
                                else {
                                    System.out.printf("Ops! There is %2d option", m);
                                 }
                                break;

                            case 2:
                                   System.out.println("In which agency do you want to Reserve a Accomodation?");
                                    System.out.print("1 - I have an Agency Name\n2 - I have an Agency Address\n");
                                    int r = sc.nextInt(); // operação do menu;
                                    sc.nextLine();
                                    int k = -1, cnt = 0;
                                    if(r == 1){
                                       
                                        System.out.print("Agency Name: ");
                                        String nam = sc.nextLine();

                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                if(agencia[i].getName().equals(nam)){
                                                    k = i;
                                                    cnt++;
                                                }
                                            }
                                        }
                                        if(cnt > 1){
                                            System.out.println("ops! There is more than one agency with this name, please state the address ");
                                            String adrs = sc.nextLine();
                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getName().equals(nam) && agencia[i].getAddress().equals(adrs) ){
                                                        k = i;
                                                    }
                                                }
                                            }
                                        }
                                        if(k != -1){
                                            System.out.println("What Accommodation do you want to reserve?");

                                            System.out.print("Name-->: ");
                                            String nom = sc.nextLine();
                                            System.out.print("Code-->: ");
                                            String cd = sc.nextLine();

                                            int j = agencia[k].getAHous(nom, cd);
                                            if(j > -1){
                                                agencia[k].checkIn(j);
                                            }
                                            else{
                                                System.out.println("This agency does not have a Accommodation with this data");
                                            }   
                                        } 
                                    }
                                    else if(r == 2){
                                            //int k = -1, cnt= 0;
                                            System.out.print("Agency address: ");
                                            String adds = sc.nextLine();

                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getAddress().equals(adds)){
                                                        k = i;
                                                        cnt++;
                                                    }
                                                }
                                            }
                                            if(cnt > 1){
                                                System.out.println("ops! There is more than one agency with this address, please state the Name ");
                                                String nam = sc.nextLine();

                                                for(int i = 0; i < agencia.length; i++){
                                                    if(agencia[i] != null){
                                                        if(agencia[i].getName().equals(nam) && agencia[i].getAddress().equals(adds) ){
                                                            k = i;
                                                        }
                                                    }
                                                }
                                            }
                                            if(k != -1){
                                                sc.nextLine();

                                                System.out.println("What Accommodation do you want to reserve?");

                                                System.out.print("Name-->: ");
                                                String nom = sc.nextLine();
                                                System.out.print("Code-->: ");
                                                String cd = sc.nextLine();

                                                int j = agencia[k].getAHous(nom, cd);
                                                if(j > -1){
                                                    agencia[k].checkIn(j);
                                                }
                                                else{
                                                    System.out.println("This agency does not have a Accommodation with this data");
                                                }   
                                            }
                                    }
                                    else{
                                        System.out.println("Please go to See the Agency Accommodation");
                                    }
                                break;
                            case 3:
                                    System.out.println("This accommodation is from which Agency?");
                                    System.out.print("1 - I have an Agency Name\n2 - I have an Agency Address\n");
                                    int t = sc.nextInt(); // operação do menu;
                                    sc.nextLine();
                                    int x= -1, cntr = 0;
                                    if(t == 1){
                                       
                                        System.out.print("Agency Name: ");
                                        String nam = sc.nextLine();
                                        for(int i = 0; i < agencia.length; i++){
                                            if(agencia[i] != null){
                                                if(agencia[i].getName().equals(nam)){
                                                   x = i;
                                                    cntr++;
                                                }
                                            }
                                        }
                                        if(cntr > 1){
                                            System.out.println("ops! There is more than one agency with this name, please state the address ");
                                            String adrs = sc.nextLine();

                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getName().equals(nam) && agencia[i].getAddress().equals(adrs)){
                                                        x = i;
                                                    }
                                                }
                                            }
                                        }
                                        if(x != -1){
                                            System.out.println("Accommodation data?");

                                            System.out.print("Name-->: ");
                                            String nom = sc.nextLine();
                                            System.out.print("Code-->: ");
                                            String cd = sc.nextLine();

                                            int j = agencia[x].getAHous(nom, cd);
                                            if(j > -1){
                                                agencia[x].checkOut(j);
                                            }
                                            else{
                                                System.out.println("This agency does not have a Accommodation with this data");
                                            }   
                                        } 
                                    }
                                    else if(t == 2){
                                            //int k = -1, cnt= 0;
                                            System.out.print("Agency address: ");
                                            String adds = sc.nextLine();
                                            for(int i = 0; i < agencia.length; i++){
                                                if(agencia[i] != null){
                                                    if(agencia[i].getAddress().equals(adds)){
                                                        x = i;
                                                        cntr++;
                                                    }
                                                }
                                            }
                                            if(cntr > 1){
                                                System.out.println("ops! There is more than one agency with this address, please state the Name ");
                                                String nam = sc.nextLine();
                                                for(int i = 0; i < agencia.length; i++){

                                                    if(agencia[i] != null){
                                                        if(agencia[i].getName().equals(nam) && agencia[i].getAddress().equals(adds)){
                                                            x = i;
                                                        }
                                                    }
                                                }
                                            }
                                            if(x != -1){
                                                System.out.println("Accommodation data?");
                                                System.out.print("Name-->: ");
                                                String nom = sc.nextLine();
                                                System.out.print("Code-->: ");
                                                String cd = sc.nextLine();

                                                int j = agencia[x].getAHous(nom, cd);
                                                if(j > -1){
                                                    agencia[x].checkOut(j);
                                                }
                                                else{
                                                    System.out.println("This agency does not have a Accommodation with this data");
                                                }   
                                            }
                                    }
                                    else{
                                        System.out.println("Please go to See the Agency Accommodation");
                                    }
                                break;
                            case 0:
                                   System.out.println("Bye!");    
                                break;
                            default:
                                    System.out.println("Ops! : Não é isso!");
                                break;
                        }
                    } while (opca != 0);
                break;
            case 5:
                    System.out.println("All Angency: ");
                    for(TravelAgency u: agencia){
                        if(u != null)
                          System.out.println(u);
                    }
                break;
            case 0:
                    System.out.print("Good Job!");
                break;
            default:
                    System.out.println("Ops! : Não é isso!");
                break;
        }
      } while (op != 0);
      sc.close();


    }
}
