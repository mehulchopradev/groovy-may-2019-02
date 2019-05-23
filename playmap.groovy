// map
// internally groovy creates an instance of LinkedHashMap
// key-value pair data structure. Every entry in a map consists of key-value
// its not an ordered data structure
// is mutable
// key is suppose to be unique in a map
import com.xyz.college.domain.Student

def studentMap = [
  10: new Student('mehul', 'm' as Character, 10, 90),
  12: new Student('jane', 'f' as Character, 12, 80),
  1: new Student('jill', 'f' as Character, 1, 95),
  13: null,
  15: null,
]

studentMap.removeAll {roll, student->
  !student
}

println studentMap

def search = 12

def found = studentMap[search]
if (found) {
  println found.name
} else {
  println "Not found"
}

def femalesMap = studentMap.findAll {roll, student->
  student.gender == 'f'
}

println femalesMap

def r = studentMap.any {roll, student->
  student.marks < 80
}
println  r

def a = studentMap.collect {roll, student ->
  "${student.name}|${student.gender}"
}

println a // gives a transformed list from a map

def b = studentMap.collectEntries {roll, student ->
  [roll, "${student.name}|${student.gender}"]
}

println b // gives a transformed map from a map
