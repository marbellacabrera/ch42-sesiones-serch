console.log("Gracias por ayudarnos Serch🫂🥷")

const student1Courses = ['Math', 'English', 'Programming', 'Spanish', 'Chemistry'];
const student2Courses = ['Geography', 'Spanish', 'Programming', 'Chemistry'];
for (let course1 of student1Courses ){
    console.log( course1 )
}

const commonCourses = [];
for (let course1 of student1Courses ){
    console.log( course1 ); 
    for(let course2 of student2Courses ){
        if( course1 === course2) commonCourses.push( course1 );
    }
}
console.log("Cursos en común: " +  commonCourses.join(", ")  );