import com.xyz.geometry.Shape

class ShapeStats {
  static def calcStats(Shape shape) {
    "Area : ${shape.area()}\nPerimeter : ${shape.perimeter()}"
  }
}
