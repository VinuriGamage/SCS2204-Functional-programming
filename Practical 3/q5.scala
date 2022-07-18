
import scala.io.StdIn.readInt

def Easypace(d1:Int):Int={
    8*d1
}

def Tempo(d2:Int):Int={
    7*d2
}

@main
def runTime():Unit={

    var total = Easypace(2) + Tempo(3) + Easypace(2)

    printf("Total running time is %d",total)

}