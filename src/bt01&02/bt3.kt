//Giải phương trình bậc 2: ax^2 + bx + c = 0 (với mọi a)
package `bt01&02`

import kotlin.math.sqrt
fun giaiptb2(a:Double, b:Double,c:Double){
    if(a==0.0){
        giaiptb1(b,c)
    }
    else{
        val delta = b*b- 4*a*c
        when{
            delta > 0 ->{
                val x1=(-b+sqrt(delta))/(2*a)
                val x2=(-b-sqrt(delta))/(2*a)
                println("=> Phương trình có 2 nghiệm phân biệt:")
                println("x1 = $x1")
                println("x2 = $x2")
            }
            delta ==0.0 ->{
                val x = -b/(2*a)
                print("=> Phương trình có nghiệm kép x1= x2= $x")
            }
            else ->{
                print("=> Phương trình vô nghiệm")
            }
        }
    }
}
fun giaiptb1(a:Double, b:Double){
    when{
        (a!= 0.0 && b!=0.0) ->{
            val x=-b/a
            print("=> Nghiệm của phương trình là x=$x")
        }
        b==0.0 ->{
            print("=> Phương trình có vô số nghiệm")
        }
        else ->{
            print("=> Phương trình vô nghiệm")
        }
    }
}
fun main(){
    println("Phương trình có dạng ax^2+bx+c=0")
    print("Nhập giá trị của a: ")
    val a = readLine()?.toDoubleOrNull() ?:0.0
    print("Nhập giá trị của b: ")
    val b = readLine()?.toDoubleOrNull() ?:0.0
    print("Nhập giá trị của c: ")
    val c = readLine()?.toDoubleOrNull() ?:0.0
    giaiptb2(a,b,c)
}