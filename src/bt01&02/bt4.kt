// Tìm số thực lớn nhất trong 3 số nhập từ bàn phím
package `bt01&02`

fun main(){
    print("Nhập số thứ nhất")
    val a=readLine()?.toDoubleOrNull() ?:0.0
    print("Nhập số thứ hai")
    val b=readLine()?.toDoubleOrNull() ?:0.0
    print("Nhập số thứ ba")
    val c=readLine()?.toDoubleOrNull() ?:0.0
    val max=maxOf(a,b,c)
    print("Số thực lớn nhất là $max")
}