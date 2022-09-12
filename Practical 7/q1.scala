object MyApp extends App{

class Rational(n:Int,d:Int){

    def numer=n
    def denom=d

    def neg(r:Rational)=new Rational(-this.numer,this.denom)

    override def toString = numer + "/" + denom
}

    val r1=new Rational(2,3)
    val x=r1.neg(r1)
    println(x)

}


















