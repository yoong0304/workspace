package a0713.Ex01;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return studentNum;
    }
    
    @Override
    // public boolean equals(Object obj) {
    //     if(obj instanceof Student) {
    //         Student target = (Student) obj;
    //         if(target.studentNum == studentNum) {
    //                 return true;
    //             }else {
    //             return false;
    //         } 
    //     } else {
    //             return false;
    //         }
    // }

    public boolean equals(Object obj) {
        // equals() 메소드로 동일한 객체 식별하기 위해서
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Student student = (Student) obj;
        if(studentNum != student.studentNum) {
            return false;
        }
        return true;
    }
    
}
