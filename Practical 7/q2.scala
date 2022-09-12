object MyApp extends App{

    
class Rational(n:Int,d:Int){

    def numer=n
    def denom=d

    def sub(r:Rational) = new Rational(this.numer * r.denom - r.numer * this.denom, denom * r.denom)


    override def toString = numer + "/" + denom

}

    val r1=new Rational(2,3)
    val r2=new Rational(6,7)
    val x=r1.sub(r2)
    println(x)

}


