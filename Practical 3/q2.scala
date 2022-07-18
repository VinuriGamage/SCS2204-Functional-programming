import scala.io.StdIn.readInt

def calculatetemp(tempC:Int):Double={

     tempC * 1.8 + 32
     
}

@main
def temperature():Unit={

    

    printf("%.2f",calculatetemp(35))

}

