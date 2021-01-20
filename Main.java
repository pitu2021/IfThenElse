class Main {
  public static void main(String[] args) {
    int i = 5;
    if (i == 5){System.out.println("i is 5");}
    else if (i == 6) {System.out.println("i is 6");}
    else{System.out.println("i is not 5 or 6");}

    for (int i1 = 0;i1 < 5; i1++)
   { if (i1 == 3) {continue;}
    {System.out.println(i1);}
  }
  int i2 = 0;
  while (i2 != 5) {
    System.out.println(i2);
    i2++;
  }
  int i3=0;
  while(i3 != 5){
  if(i3 == 3){
    System.out.println("i3 is 3 now");
  }
  System.out.println(i3);
  i3++;
}

int i4 = 4;
switch(i4){
  case 1:
  System.out.println("i is 1");
  break;
  case 2:
  System.out.println("i is 2");
  break;
  case 3:
  System.out.println("i is 3");
  break;
  case 4:
  System.out.println("i is 4");
  break;
  case 5:
  System.out.println("i is 5");
  break;
  case 6:
  System.out.println("i is 6");
  break;
default:
System.out.println("i is not 1,2,3,4,5,6");
}
  
  }
}