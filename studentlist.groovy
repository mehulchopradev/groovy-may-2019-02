import com.xyz.college.domain.Student

def studentlist = [
  new Student('mehul', 'm' as Character, 10, 90), // positional parameters
  new Student([name: 'jane', gender: 'f' as Character, roll: 12, marks: 80]), // map (keyword parameters)
  new Student(name: 'jill', roll: 1, marks: 95, gender: 'f' as Character) // keyword parameters can be passed in any order
]

def females = studentlist.findAll {
  it.gender == 'f'
}.collect {
  it.name
}

println females

// searching by rollno
def search = 34

def found = studentlist.find {
  it.roll == search
}

println(found ? found.name : 'Not found')
