//Tính tổng các giá trị lẻ trong dãy số từ 1 đến N (với n lá số nguyên dương, nhập từ bàn phím)
package bt01_02

fun main(){
    print("Nhập số nguyên dương N: ")
    var n = readLine()?.toIntOrNull() ?:0
    while(n<=0) {
        print("Nhập số nguyên dương")
        n=readLine()?.toIntOrNull() ?:0
    }
    var sum=0
    for(i in 1..n step 2){
        sum+=i
    }
    print("Tổng các số lẻ từ 1 đến $n là $sum")

}