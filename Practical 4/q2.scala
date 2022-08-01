import scala.io.StdIn.readInt


def find(integer:Int):String = integer match{
 
        case integer if integer<=0 => "Negative/Zero";
        case deposit if integer%2==0 => "Even";
        case deposit if integer%2!=0  => "Odd";
}

@main
def deposit_interest:Unit={

    printf("Enter an integer: ")
    var integer=readInt()
    

    printf("%s",find(integer))
}