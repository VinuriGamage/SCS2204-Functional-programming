import scala.io.StdIn.readInt

def bookprice(copies:Int):Double=copies*24.95;

def discount(amount:Double):Double=amount*0.4;

def cost(copies:Int):Double={
    if(copies>50){
        3*copies + (copies-50)*0.75;
    }
    else
        copies*3;

    
} 

@main
def Shipping():Unit={
    var total: Double=bookprice(60)-discount(bookprice(60))+cost(60);
    printf("Wholesale cost for 60 books is Rs. %.2f",total);
}






