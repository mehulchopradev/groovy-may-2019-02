import com.xyz.geometry.Square
import com.xyz.geometry.Rectangle

def s = new Square(side: 4)
// println s.area()
// println s.perimeter()
println (ShapeStats.calcStats(s))

def r = new Rectangle(length: 5, breadth: 3)
println(ShapeStats.calcStats(r))

s.getType()
