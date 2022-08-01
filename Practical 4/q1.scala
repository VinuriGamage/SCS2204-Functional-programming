import scala.io.StdIn.readInt


def interst(deposit:Double):Double = deposit match{
 
        case deposit if deposit<=20000 => deposit*0.02;
        case deposit if deposit<=200000 => deposit*0.04;
        case deposit if deposit<=2000000 => deposit*0.035;
        case deposit if deposit>=2000000 => deposit*0.065;
   
}

@main
def deposit_interest:Unit={

    printf("Enter the deposit amount: ")
    var deposit=readInt()
    

    printf("%.3f",interst(deposit))
}