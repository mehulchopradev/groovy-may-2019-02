def marks = 78

/*
 >= 70 - A
 >= 60 - B
 >= 40 - C
 < 40 - F
 anythin = I
*/

def calcGrade(marks) {
  // if - else if - else if - else
  if (marks > 100 || marks < 0) {
    'I'
  } else if (marks >= 70) {
    'A'
  } else if (marks >= 60) {
    'B'
  } else if (marks >= 40) {
    'C'
  } else {
    'F'
  }
}

// println calcGrade(marks)

// switch case
def calcGradeSwitch(marks) {
  switch (marks) { // like java it has fall through
    case 70..100: 'A'
      break
    case 60..69: 'B'
      break
    case 40..59: 'C'
      break
    case 0..39: 'F'
      break
    default: 'I'
  }
}

println calcGradeSwitch(marks)
