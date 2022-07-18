import scala.io.StdIn.readInt
import math._

def volume(r:Int):Double={
    var Pi=3.14
    1.34*Pi*r*r*r
}

@main
def function():Unit={
    printf("%.2f",volume(5))
}



