/* Hello there in this section we will go through the loops in java .
-->  Application
     1.When we have to perform a task repeaditilly then we use
     2.For example if we have to print the numbers from 1 to 10... we can use print statements 10 times but what if i have to print
       the number from 1 to 1000...then using print statements is not good at all , so we can use loops here to print numbers this most sophisticated
       way. */
//for loop -->Printing numbers from 1 to 100
class Loops{
  public static void main(String [] args){
    for(int i = 1; i <= 100; i++){
      System.out.print(i+" ");
    }
  //for each loop  --> here we don't need to update the loop variable. 
    for(data_type variable : array_name/collection_name){
    statements 
}
    // Similarly we can perform same operation using while loop and do-while loop
    int i = 1;
    while(i<=100){
      System.out.print(i+" ");
      i++;
    }
    //do-while
    do{
      System.out.print(i+" ");
      i++;
    } while(i<=100);
  }
}
