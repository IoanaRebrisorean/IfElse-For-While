package com.JavaIfElse.Ex;

public class LogicalOp {


    public LogicalOp() {
    }

 //if-else

    //(if-else) 1. Creati o metoda care sa returneze numarul mai mare, dintre doua numere primite ca parametrii
    public int checkBiggerNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }

    }

    //(if-else) 2. Creati o metoda de tip String, care sa primeasca un parametru de tip String si sa compare doua texte.
    public String comparison(String word) {
        if (word.equals("FastTrackIT")) {
            return " Learning text comparsion";
        } else {
            return " Go to try some more ";
        }
    }

    //(if-else) 3. Creati o metoda de tip String care sa primeasca un parametru de tip String si unul de tip int. Daca testul primit ca parametru este egal cu "FastTrackIT", si numarul mai mic sau egal cu 3, returnati testul si numarul in oridinea asta, daca textul nu e "FastTrackIT" si numarul este mai mare sau egal cu 4, returnati numarul si textul, in oridnea asta
    public String stringAndNumberComparison(String word, int number) {
        if (word.equals("FastTrackIT") && number <= 3) {
            return word + " " + number;
        } else if (!word.equals("FastTrackIT") && number >= 4) {
            return number + " " + word;
        } else {
            return " Try again! ";
        }
    }

    //(if-else) 4. Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai mare de 8 sau egal cu 6, atunci sa returneze "The amount of snow this winter was(cm): " si numarul. Daca nu, sa printeze "The forecast snow is(cm): " si numarul.
    public String amountOfSnow(int cmOfSnow) {
        if (cmOfSnow > 8 || cmOfSnow == 6) {
            return " The amount of snow this winter is: " + cmOfSnow;
        } else {
            return " The forecast snow is: " + cmOfSnow;
        }
    }

    //(if-else) 5. Creati o metoda de tip String care sa primeasca un parametru de tip numar. Daca numarul este mai mare decat 4 si nu este egal cu 4, returnati "The number is grater than 3, and not equal to 4". Daca numarul este egal cu 4, returnati "The number is equal to 4, iar daca numarul este mai mic de 3 returnati "The number is lower than 3.
    public String numberComparsion(int number) {
        if (number > 3 && number != 4) {
            return " The number is grater than 3 and not equal to 4. ";
        } else if (number == 4) {
            return " The number is equal to 4. ";
        } else if (number < 3) {
            return " The number is lower than 3";
        } else {
            return " The number is 3 ";
        }
    }

    //(if else) 6.
    public String givenNumber(int givenNumber) {
        switch (givenNumber) {
            case 0:
                return " The number is: 0 ";
            case 1:
                return "The number is: 1 ";
            case 2:
                return " The number is: 2 ";
            case 3:
                return "The number is: 3 ";
            case 4:
                return " The number is: 4 ";
            case 5:
                return "The number is: 5 ";
            case 6:
                return " The number is: 6 ";
            case 7:
                return "The number is: 7 ";
            case 8:
                return " The number is: 8 ";
            case 9:
                return "The number is: 9 ";
            default:
                return " The numbers is: " + givenNumber;
        }
    }

    //(if-else) 7. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
    public boolean isNumberEven(int number){
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //(if-else) 8. Creati o metoda care sa returneze true, daca varsta e mai mare de 18 ani si false, daca e mai mica
    public boolean isEligibleToVote(int age){
        if ( age <= 18){
            return false;
        }
        else{
            return true;
        }
    }

    //(if-else) 9. Creati o metoda care sa primeasca 3 numere ca si parametri si sa-l returneze pe cel mai mare.
    public int biggestOf3Numbers(int number1, int number2, int number3){
        if ( number1 > number2 && number1 > number3){
            return number1;
        }
        else if ( number2 > number1 && number2 > number3){
            return number2;
        }
        else{
            return number3;
        }
    }

//for

    //(for) 1. Creati o metoda care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul dat ca parametru.
    public void printNumbers(int number){
        for (int i = number; i <= 100; i++){
            System.out.println(i);
        }
    }

    //(for) 2. Creati o metoda care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul dat ca parametru.
    public void printNumbersDesc(int number){
        for ( int i = number; i >= -100; i--){
            System.out.println(i);
        }
    }

    //(for) 3. Creati o metoda care primeste doua numere ca parametru. Metoda sa afiseze numerele de la primul parametru, pana la al doilea.
    public void countingFromAToB(int number1, int number2){
        for ( int i = number1; i <= number2; i++){
            System.out.println(i);
        }
    }

    //(for) 4. Creati o metoda care sa primeasca doua numere ca parametru. Sa verifice care numar e mai mic, si de la el sa porneaca numaratoare.
    public void compairAndCount(int number1, int number2){
        if ( number1 < number2){
            for (int i = number1; i <= number2; i++){
                System.out.println(i);
            }
        }
        else{
            for ( int j = number2; j <= number1; j++){
                System.out.println(j);
            }
        }
    }

    //(for) 5. Creati o metoda care sa returneze toate numerele de la 1 la 100.
    public void countTo100(){
        for ( int i = 0; i <= 100; i++){
            System.out.println(i);
        }
    }

    //(for) 6. Creati o metoda care sa afiseze toate numerele impare de la 1 la 100.
    public void oddNumbers(){
        for ( int i = 0; i <= 100; i++){
            if ( i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    //(for) 7. Creati o metoda care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100 pornind de la numarul primit.
    public void sum(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++)
            sum = sum + i;
        System.out.println(sum);
    }

    //(for) 8. Creati o metoda care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100 si sa faca media lor.
    public void sumAndAverage(int number) {
        int sum = 0;
        float avg = 1;
        float n = 100 - number;
        for ( int i = number; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        avg = (float) sum / (float) (n+1);
        System.out.println(avg);
    }

    //(for) 9. Creati o metoda care sa afiseze urmatorul tipar (ex cu stelute)
    public void star(){
        for ( int i = 7; i > 0; i--){
            String line = " ";
            for ( int j = i; j > 0; j--){
                line = line + " * ";
            }
            System.out.println(line);
        }
    }

//while

    //(while) 1. Creati o metoda care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul dat ca parametru.
    public void whilePrintNumbers(int number){
        int i=number;
        while (i <= 100) {
            System.out.println(i);
            i++;

        }
    }

    //(while) 2. Creati o metoda care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul dat ca parametru.
    public void whilePrintNumbersDesc(int number){
        int i = number;
        while ( i >= -100){
            System.out.println(i);
            i--;
        }
    }

    //(while) 3.  Creati o metoda care primeste doua numere ca parametru. Metoda sa afiseze numerele de la primul parametru, pana la al doilea.
    public void whileCountingFromAToB(int number1, int number2){
        int i = number1;
        while ( i <= number2){
            System.out.println(i);
            i++;
        }
    }

    //(while) 4. Creati o metoda care sa primeasca doua numere ca parametru. Sa verifice care numar e mai mic, si de la el sa porneaca numaratoare.
    public void whileCompairAndCount(int number1, int number2) {
        if  (number1 < number2) {
            int i = number1;
            while (i <= number2) {
                System.out.println(i);
                i++;
            }
            }
            else{
                int j = number2;
                while (j <= number1) {
                    System.out.println(j);
                    j++;
                }
            }
        }

        //(while) 5. Creati o metoda care sa returneze toate numerele  pare de la 1 la 100.
    public void whileEvenNumbers(){
        int i = 1;
        while ( i <= 100){
            if ( i % 2 ==0 ) {
                System.out.println(i);
            }
            i++;
        }
    }

    //(while) 6. Creati o metoda care sa returneze numerele impare de la 1 la 100
    public void whileOddNumbers(){
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    //(while) 7. Creati o metoda care sa adune toate numerele de la 111 la 8899 si sa calculeze media lor
    public void sumAndAverageRange(){
        float sum = 0;
        int count = 0;
        int i = 111;
        while ( i <= 8899 ){
            sum = sum + i;
            count++;
            i++;
        }
        float average = sum / (float) count;
        System.out.println(sum);
        System.out.println(count);
        System.out.println(average);
    }

    //(while) 8. Creati o metoda care sa primeasca doi parametrii si sa returneze media numerelor divizibile cu 7 din acel interval
    public void div7(int number1, int number2){
        int sum = 0;
        int count = 0;
        float average = 1;
        while ( number1 <= number2) {
            if ( number1 % 7 == 0 ){
                count++;
                sum = sum + number1;
            }
            number1++;
        }
        System.out.println(sum);
        average = (float) sum / (float) count;
        System.out.println(average);
    }

    //(while) 9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci
    public void fibonacci(){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int i = 1;
        while ( i <= 18 ){
            int sum = a + b;
            System.out.println( sum );
            a = b;
            b = sum;
            i++;

        }
    }

    //(for) 10. Creati o metoda numita CozaLozaWoza.
    public void cozzaLozzaWozza() {
        String linie = "";
        for (int i = 1; i <= 110; i++) {
            //i in rest construim linia la lfiecare pas adaugand nr curent
            String nume = "";
            if (i % 3 == 0) {
                nume += "Cozza";
            }
            if (i % 5 == 0) {
                nume += "Lozza";
            }
            if (i % 7 == 0) {
                nume += "Wozza";
            }

            if (nume.equals("")) {
                linie += i + " ";
            } else {
                linie += nume + " ";
            }

            if (i % 11 == 0) {
                // daca ordinea nr este divizibila cu 11, afisam linia si o curatam
                System.out.println(linie);
                linie = "";
            }
        }
    }









}







