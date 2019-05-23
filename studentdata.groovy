// Person Y
// how many student objects -> 0
import com.xyz.college.domain.Student
import com.xyz.college.domain.Address

// import com.somvendor.Student as Stud (aliasing an imported class)
// useful at the time of resolving the namespace conflict

import static com.xyz.college.domain.Student.getMinimumAttendance as getMinAtten

println Student.count
def s1 = new Student(name: 'mehul', gender: 'o' as Character,
  roll: 10, marks: 90, contactNos: ['9874875834534','54355435345'],
  address: new Address(country: 'India', state: 'MH', city: 'MUM', pincode: '400053'))
// new -> 4003
// Student('mehul', 'm', 10, 90) -> Student('mehul', 'm', 10, 90, 4003)


def s2 = new Student()
// new -> reserves some memory in the ram : 4005
// Student() -> Student(4005) - available by default

// how many student objects -> 2

println Student.count

// println Student.getMinimumAttendance() // Student.getMinimumAttendance()
// println getMinimumAttendance()
println getMinAtten()

// getting the properties
/* println s1
println s1.name // s1.getName()
println s2.name
println s1.roll // s1.getRoll()
println s2.roll */

// setting the properties
/* s1.name = 'mehul'
s1.gender = 'm'
s1.roll = 10
s1.marks = 90 */

// setting properties on an object
s2.name = 'jane' // s2.setName('jane')
s2.gender = 'f' // gender property shud take in only m or f. s2.setGender('o')
s2.roll = 13 // s2.setRoll(13)
s2.marks = 80
// s2.addToContacts('9883475943')
// s2.addToContacts('832483435')
s2 << '9887673423' << '8637482348' // operator overloading
// Student.leftShift('9887673423', s2)

// dot access converting to setter and getter function calls happens only from outside the class

def r1 = s1.getDetails()
// Student.getDetails(s1)

def r2 = s2.getDetails()
// Student.getDetails(s2)

println r1
println r2

def s3 = new Student(name: 'jane', contactNos: ['76564656'])
s2 + s3 // collate the contacts from s3 and add it to s2 contacts
// Student.plus(s3, s2)

println s2.getDetails()

s2 >> '8637482348' // removing a contact
// Student.rightShift('8637482348', s2)

println s2.getDetails()

/* println s1.name
println s2.name
println s1.roll
println s2.roll */
