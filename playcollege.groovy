import com.xyz.college.domain.*

def s1 = new CollegeStudent(name: 'mehul', gender: 'm' as Character, roll: 10, marks: 90,
  address: new Address(country: 'India', state: 'MH', city: 'MUM', pincode: '400053'))
def p1 = new Professor(name: 'jane', gender: 'f' as Character, subjects: ['Physics', 'Chemistry'], contactNos: ['986876878'])


// println s1.getDetails() // CollegeStudent.getDetails(s1)
// println p1.getDetails() // Professor.getDetails(p1)


s1 << '8673467234'
p1 << '7863287428'

// println s1.getDetails()
// println p1.getDetails()
def name = 'mehul chopra'

println name // println(name.toString())
// String.toString(name)


println s1 // println(s1.toString()) // CollegeStudent.toString(s1)
