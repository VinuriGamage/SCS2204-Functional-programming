
var a:Int=2
var b:Int=3
var c:Int=4
var d:Int=5
var k=4.3f
var g=4.0f

@main
def cal_1()={

    b-=1
    println(b*a+c*d);
    d-=1

    println(a);
    a+=1

    println(-2*(g-k)+c);

    println(c);
    c+=1

    c+=1
    println(c*a)
    a+=1

}