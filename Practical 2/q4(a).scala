
import scala.io.StdIn.readInt



def wage(hours:Int):Int={
    hours*250
}

def OT(hours:Int):Int={
    hours*85
}

def income(h1:Int,h2:Int):Int={
    wage(h1)+OT(h2)
}

def tax(income:Int):Int={
    income*12/100
}

@main
def takehome():Unit={

    print("Input normal hours per week")
    var h1 = readInt()

    print("Input OT hours per week")
    var h2= readInt()

    println(income(h1,h2)-tax(income(h1,h2)))
}

